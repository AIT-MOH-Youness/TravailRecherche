package ma.ensaj.reservation.controllers.graphQL;

import ma.ensaj.reservation.dto.ReservationInput;
import ma.ensaj.reservation.entities.Reservation;
import ma.ensaj.reservation.services.ChambreService;
import ma.ensaj.reservation.services.ClientService;
import ma.ensaj.reservation.services.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.sql.Date;
import java.util.List;

@Controller
public class ReservationGraphQLController {

    @Autowired
    private ReservationService reservationService;

    @Autowired
    private ClientService clientService;

    @Autowired
    private ChambreService chambreService;


    // READ: Get all reservations
    @QueryMapping
    public List<Reservation> getAllReservations() {
        try {
            return reservationService.getAllReservations();
        } catch (Exception e) {
            throw new RuntimeException("Une erreur s'est produite lors de la récupération des réservations", e);
        }
    }

    // READ: Get a reservation by its ID
    @QueryMapping
    public Reservation getReservationById(@Argument Long id) {
        try {
            return reservationService.getReservationById(id)
                    .orElseThrow(() -> new RuntimeException("Reservation non trouvé"));
        } catch (Exception e) {
            throw new RuntimeException("Une erreur s'est produite lors de la récupération by Id", e);
        }
    }

    // CREATE: Add a new reservation
    @MutationMapping
    public Reservation createReservation(@Argument ReservationInput reservationInput) {
        try {
            Reservation reservation = new Reservation();
            reservation.setDateDebut(reservationInput.getDateDebut());
            reservation.setDateFin(reservationInput.getDateFin());
            reservation.setPreferences(reservationInput.getPreferences());
            reservation.setClient(clientService.getClientById(reservationInput.getClientId()).orElseThrow());
            reservation.setChambre(chambreService.getChambreById(reservationInput.getChambreId()).orElseThrow());
            reservation.getChambre().setDisponible(false);
            return reservationService.createReservation(reservation);
        } catch (Exception e) {
            throw new RuntimeException("Une erreur s'est produite lors de la création des réservations", e);
        }
    }

    // UPDATE: Update an existing reservation
    @MutationMapping
    public Reservation updateReservation(@Argument Long id, @Argument ReservationInput reservationDetails) {
        try {
            return reservationService.getReservationById(id)
                    .map(reservation -> {
                        reservation.setDateDebut(reservationDetails.getDateDebut());
                        reservation.setDateFin(reservationDetails.getDateFin());
                        reservation.setPreferences(reservationDetails.getPreferences());
                        reservation.setClient(clientService.getClientById(reservationDetails.getClientId()).orElseThrow());
                        reservation.setChambre(chambreService.getChambreById(reservationDetails.getChambreId()).orElseThrow());
                        return reservationService.createReservation(reservation);
                    }).orElseThrow(() -> new RuntimeException("Reservation non trouvé"));
        } catch (Exception e) {
            throw new RuntimeException("Une erreur s'est produite lors de la mise a jour des réservations", e);
        }
    }

    // DELETE: Delete a reservation
    @MutationMapping
    public Boolean deleteReservation(@Argument Long id) {
        try {
            return reservationService.getReservationById(id)
                    .map(reservation -> {
                        reservationService.deleteReservation(id);
                        reservation.getChambre().setDisponible(true);
                        return true;
                    })
                    .orElse(false);
        } catch (Exception e) {
            throw new RuntimeException("Une erreur s'est produite lors de la suppression des réservations", e);
        }
    }
}
