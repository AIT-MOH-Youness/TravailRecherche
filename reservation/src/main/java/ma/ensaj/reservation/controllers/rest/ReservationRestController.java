package ma.ensaj.reservation.controllers.rest;

import ma.ensaj.reservation.entities.Reservation;
import ma.ensaj.reservation.services.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotelRest")
public class ReservationRestController {

    @Autowired
    private ReservationService reservationService;

    // READ: Récupérer toutes les réservations
    @GetMapping("/reservations")
    public List<Reservation> getAllReservations() {
        try {
            return reservationService.getAllReservations();
        } catch (Exception e) {
            throw new RuntimeException("Une erreur s'est produite lors de la récupération des réservations", e);
        }
    }

    // READ: Récupérer une réservation par son identifiant
    @GetMapping("/reservations/{id}")
    public ResponseEntity<Reservation> getReservationById(@PathVariable Long id) {
        try {
            return reservationService.getReservationById(id)
                    .map(reservation -> ResponseEntity.ok().body(reservation))
                    .orElse(ResponseEntity.notFound().build());
        } catch (Exception e) {
            throw new RuntimeException("Une erreur s'est produite lors de la récupération by Id", e);
        }
    }

    // CREATE: Ajouter une nouvelle réservation
    @PostMapping("/reservations")
    public Reservation createReservation(@RequestBody Reservation reservation) {
        try {
            reservation.getChambre().setDisponible(false);
            return reservationService.createReservation(reservation);
        } catch (Exception e) {
            throw new RuntimeException("Une erreur s'est produite lors de la création des réservations", e);
        }
    }

    // UPDATE: Mettre à jour une réservation existante
    @PutMapping("/reservations/{id}")
    public ResponseEntity<Reservation> updateReservation(@PathVariable Long id,
                                                         @RequestBody Reservation reservationDetails) {
        try {
            return reservationService.getReservationById(id)
                    .map(reservation -> {
                        reservation.setDateDebut(reservationDetails.getDateDebut());
                        reservation.setDateFin(reservationDetails.getDateFin());
                        reservation.setPreferences(reservationDetails.getPreferences());
                        reservation.setChambre(reservationDetails.getChambre());
                        reservation.setClient(reservationDetails.getClient());
                        Reservation updatedReservation = reservationService.createReservation(reservation);
                        return ResponseEntity.ok().body(updatedReservation);
                    }).orElse(ResponseEntity.notFound().build());
        } catch (Exception e) {
            throw new RuntimeException("Une erreur s'est produite lors de la mise a jour des réservations", e);
        }
    }

    // DELETE: Supprimer une réservation
    @DeleteMapping("/reservations/{id}")
    public ResponseEntity<Void> deleteReservation(@PathVariable Long id) {
        try {
            return reservationService.getReservationById(id)
                    .map(reservation -> {
                        reservationService.deleteReservation(id);
                        reservation.getChambre().setDisponible(true);
                        return ResponseEntity.ok().<Void>build();
                    })
                    .orElse(ResponseEntity.notFound().build());
        } catch (Exception e) {
            throw new RuntimeException("Une erreur s'est produite lors de la suppression des réservations", e);
        }
    }
}
