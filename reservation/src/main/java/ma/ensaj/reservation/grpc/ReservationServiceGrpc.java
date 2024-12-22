package ma.ensaj.reservation.grpc;


import io.grpc.stub.StreamObserver;
import ma.ensaj.reservation.entities.Reservation;
import ma.ensaj.reservation.grpc.stubs.*;
import ma.ensaj.reservation.services.ChambreService;
import ma.ensaj.reservation.services.ClientService;
import ma.ensaj.reservation.services.ReservationService;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Collectors;

@GrpcService
public class ReservationServiceGrpc extends ma.ensaj.reservation.grpc.stubs.ReservationServiceGrpc.ReservationServiceImplBase {

    @Autowired
    private ReservationService reservationService;
    
    @Autowired
    private ClientService clientService;
    
    @Autowired
    private ChambreService chambreService;
    
    

    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");

    @Override
    public void createReservation(CreateReservationRequest request, StreamObserver<CreateReservationResponse> responseObserver) {
        try {
            Date dateDebut = parseDate(request.getDateDebut());
            Date dateFin = parseDate(request.getDateFin());

            if (dateDebut.after(dateFin)) {
                responseObserver.onError(io.grpc.Status.INVALID_ARGUMENT
                        .withDescription("La date d'arrivée doit être antérieure à la date de départ.")
                        .asRuntimeException());
                return;
            }

            // Récupérer le client par ID
            Optional<ma.ensaj.reservation.entities.Client> client = clientService.getClientById(request.getClientId());

            // Récupérer la chambre par ID (en supposant une seule chambre par réservation)
            Optional<ma.ensaj.reservation.entities.Chambre> chambre = chambreService.getChambreById(request.getChambreId());

            // Créer la réservation
            Reservation reservation = new Reservation();
            reservation.setClient(client.orElseThrow(() -> new NoSuchElementException("Client introuvable.")));
            reservation.setChambre(chambre.orElseThrow(() -> new NoSuchElementException("Chambre introuvable.")));
            reservation.setDateDebut(dateDebut);
            reservation.setDateFin(dateFin);
            reservation.setPreferences(request.getPrefernces());

            // Sauvegarder la réservation
            Reservation savedReservation = reservationService.createReservation(reservation);

            CreateReservationResponse response = CreateReservationResponse.newBuilder()
                    .setId(savedReservation.getId())
                    .setMessage("Réservation créée avec succès.")
                    .build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (ParseException e) {
            responseObserver.onError(io.grpc.Status.INVALID_ARGUMENT
                    .withDescription("Format de date invalide. Le format attendu est yyyy-MM-dd : " + e.getMessage())
                    .asRuntimeException());
        } catch (Exception e) {
            responseObserver.onError(io.grpc.Status.INTERNAL
                    .withDescription("Erreur inattendue lors de la création de la réservation : " + e.getMessage())
                    .asRuntimeException());
        }
    }

    @Override
    public void getReservation(GetReservationRequest request, StreamObserver<GetReservationResponse> responseObserver) {
        try {
            Reservation reservation = reservationService.getReservationById(request.getId())
                    .orElseThrow(() -> new NoSuchElementException("Réservation introuvable."));

            ma.ensaj.reservation.grpc.stubs.Reservation grpcReservation = ma.ensaj.reservation.grpc.stubs.Reservation.newBuilder()
                    .setId(reservation.getId())
                    .setDateDebut(DATE_FORMAT.format(reservation.getDateDebut()))
                    .setDateFin(DATE_FORMAT.format(reservation.getDateFin()))
                    .setPrefrences(reservation.getPreferences())
                    .build();

            GetReservationResponse response = GetReservationResponse.newBuilder()
                    .setReservation(grpcReservation)
                    .build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (NoSuchElementException e) {
            responseObserver.onError(io.grpc.Status.NOT_FOUND
                    .withDescription("Réservation introuvable : " + e.getMessage())
                    .asRuntimeException());
        } catch (Exception e) {
            responseObserver.onError(io.grpc.Status.INTERNAL
                    .withDescription("Erreur inattendue lors de la récupération de la réservation : " + e.getMessage())
                    .asRuntimeException());
        }
    }

    @Override
    public void updateReservation(UpdateReservationRequest request, StreamObserver<UpdateReservationResponse> responseObserver) {
        try {
            Date dateDebut = parseDate(request.getDateDebut());
            Date dateFin = parseDate(request.getDateFin());

            if (dateDebut.after(dateFin)) {
                responseObserver.onError(io.grpc.Status.INVALID_ARGUMENT
                        .withDescription("La date d'arrivée doit précéder la date de départ.")
                        .asRuntimeException());
                return;
            }

            // Récupérer le client par ID
            Optional<ma.ensaj.reservation.entities.Client> client = clientService.getClientById(request.getClientId());

            // Récupérer la chambre par ID (en supposant une seule chambre par réservation)
            Optional<ma.ensaj.reservation.entities.Chambre> chambre = chambreService.getChambreById(request.getChambreId());

            // Mettre à jour la réservation
            Reservation updatedReservation = new Reservation();
            updatedReservation.setId(request.getId());
            updatedReservation.setDateDebut(dateDebut);
            updatedReservation.setDateFin(dateFin);
            updatedReservation.setClient(client.orElseThrow(() -> new NoSuchElementException("Client introuvable")));
            updatedReservation.setChambre(chambre.orElseThrow(() -> new NoSuchElementException("Chambre introuvable")));
            updatedReservation.setPreferences(request.getPrefernces());

            // Appeler la méthode du service pour mettre à jour la réservation
            Reservation savedReservation = reservationService.updateReservation(request.getId(), updatedReservation);

            ma.ensaj.reservation.grpc.stubs.Reservation grpcReservation = ma.ensaj.reservation.grpc.stubs.Reservation.newBuilder()
                    .setId(savedReservation.getId())
                    .setDateDebut(DATE_FORMAT.format(savedReservation.getDateDebut()))
                    .setDateFin(DATE_FORMAT.format(savedReservation.getDateFin()))
                    .setPrefrences(savedReservation.getPreferences())
                    .build();

            UpdateReservationResponse response = UpdateReservationResponse.newBuilder()
                    .setReservation(grpcReservation)
                    .build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (IllegalArgumentException e) {
            responseObserver.onError(io.grpc.Status.INVALID_ARGUMENT
                    .withDescription(e.getMessage())
                    .asRuntimeException());
        } catch (NoSuchElementException e) {
            responseObserver.onError(io.grpc.Status.NOT_FOUND
                    .withDescription("Réservation, client ou chambre introuvable : " + e.getMessage())
                    .asRuntimeException());
        } catch (Exception e) {
            responseObserver.onError(io.grpc.Status.INTERNAL
                    .withDescription("Erreur inattendue lors de la mise à jour de la réservation : " + e.getMessage())
                    .asRuntimeException());
        }
    }

    @Override
    public void deleteReservation(DeleteReservationRequest request, StreamObserver<DeleteReservationResponse> responseObserver) {
        try {
            reservationService.deleteReservation(request.getId());

            DeleteReservationResponse response = DeleteReservationResponse.newBuilder().build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (NoSuchElementException e) {
            responseObserver.onError(io.grpc.Status.NOT_FOUND
                    .withDescription("Réservation non trouvée : " + e.getMessage())
                    .asRuntimeException());
        } catch (Exception e) {
            responseObserver.onError(io.grpc.Status.INTERNAL
                    .withDescription("Erreur inattendue lors de la suppression de la réservation : " + e.getMessage())
                    .asRuntimeException());
        }
    }

    private Date parseDate(String date) throws ParseException {
        if (date == null || date.isEmpty()) {
            throw new IllegalArgumentException("La date ne doit pas être nulle ou vide.");
        }
        return DATE_FORMAT.parse(date);
    }


    @Override
    public void getAllReservations(GetAllReservationsRequest request, StreamObserver<GetAllReservationsResponse> responseObserver) {
        try {
            // Récupérer toutes les réservations
            List<Reservation> reservations = reservationService.getAllReservations();

            // Mapper les réservations vers des objets gRPC
            List<ma.ensaj.reservation.grpc.stubs.Reservation> grpcReservations = reservations.stream()
                    .map(reservation -> ma.ensaj.reservation.grpc.stubs.Reservation.newBuilder()
                            .setId(reservation.getId())
                            .setDateDebut(DATE_FORMAT.format(reservation.getDateDebut()))
                            .setDateFin(DATE_FORMAT.format(reservation.getDateFin()))
                            .setPrefrences(reservation.getPreferences())
                            .setClient(ma.ensaj.reservation.grpc.stubs.Client.newBuilder()
                                    .setId(reservation.getClient().getId())
                                    .setNom(reservation.getClient().getNom())
                                    .setPrenom(reservation.getClient().getPrenom())
                                    .setEmail(reservation.getClient().getEmail())
                                    .setTelephone(reservation.getClient().getTelephone())
                                    .build())
                            .setChambres(ma.ensaj.reservation.grpc.stubs.Chambre.newBuilder()
                                    .setId(reservation.getChambre().getId())
                                    .setType(reservation.getChambre().getType())
                                    .setPrix(reservation.getChambre().getPrix())
                                    .setDisponible(reservation.getChambre().getDisponible())
                                    .build())
                            .build())
                    .collect(Collectors.toList());

            // Construire la réponse
            GetAllReservationsResponse response = GetAllReservationsResponse.newBuilder()
                    .addAllReservations(grpcReservations)
                    .build();

            // Envoyer la réponse
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (Exception e) {
            responseObserver.onError(io.grpc.Status.INTERNAL
                    .withDescription("Erreur inattendue lors de la récupération de toutes les réservations : " + e.getMessage())
                    .asRuntimeException());
        }
    }
}
