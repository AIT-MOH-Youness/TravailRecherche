package ma.ensaj.reservation.controllers.soap;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import ma.ensaj.reservation.dto.ReservationInput;
import ma.ensaj.reservation.entities.Reservation;
import ma.ensaj.reservation.services.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@WebService(serviceName = "ReservationSoap")
@Service
public class ReservationSoapController {

    @Autowired
    private ReservationService reservationService;

    @WebMethod(operationName = "getAllReservations")
    public List<Reservation> getAllReservations() {
        try {
            return reservationService.getAllReservations();
        } catch (Exception e) {
            throw new RuntimeException("An error occurred while retrieving reservations", e);
        }
    }

    @WebMethod(operationName = "getReservationById")
    public Reservation getReservationById(@WebParam(name = "id") Long id) {
        try {
            return reservationService.getReservationById(id)
                    .orElseThrow(() -> new RuntimeException("The reservation with id " + id + " does not exist"));
        } catch (Exception e) {
            throw new RuntimeException("An error occurred while retrieving the reservation by Id", e);
        }
    }

    @WebMethod(operationName = "createReservation")
    public Reservation createReservation(@WebParam(name = "reservation") Reservation reservation) {
        try {
            reservation.getChambre().setDisponible(false);
            return reservationService.createReservation(reservation);
        } catch (Exception e) {
            throw new RuntimeException("An error occurred while creating the reservation", e);
        }
    }

    @WebMethod(operationName = "updateReservation")
    public Reservation updateReservation(@WebParam(name = "id") Long id,
                                         @WebParam(name = "reservationDetails") ReservationInput reservationDetails) {
        try {
            return reservationService.getReservationById(id)
                    .map(reservation -> {
                        reservation.setDateDebut(reservationDetails.getDateDebut());
                        reservation.setDateFin(reservationDetails.getDateFin());
                        return reservationService.updateReservation(id, reservation);
                    })
                    .orElseThrow(() -> new RuntimeException("The reservation with id " + id + " does not exist"));
        } catch (Exception e) {
            throw new RuntimeException("An error occurred while updating the reservation", e);
        }
    }

    
    @WebMethod(operationName = "deleteReservation")
    public boolean deleteReservation(@WebParam(name = "id") Long id) {
        try {
            return reservationService.getReservationById(id)
                    .map(reservation -> {
                        reservationService.deleteReservation(id);
                        return true;
                    })
                    .orElseThrow(() -> new RuntimeException("The reservation with id " + id + " does not exist"));
        } catch (Exception e) {
            throw new RuntimeException("An error occurred while deleting the reservation", e);
        }
    }
}