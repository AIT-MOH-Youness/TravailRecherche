package ma.ensaj.reservation.grpc;

import io.grpc.stub.StreamObserver;
import ma.ensaj.reservation.entities.Chambre;
import ma.ensaj.reservation.grpc.stubs.*;
import ma.ensaj.reservation.services.ChambreService;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.NoSuchElementException;

@GrpcService
public class ChambreServiceGrpc extends ma.ensaj.reservation.grpc.stubs.ChambreServiceGrpc.ChambreServiceImplBase {

    @Autowired
    private ChambreService chambreService;

    @Override
    public void createChambre(CreateChambreRequest request, StreamObserver<CreateChambreResponse> responseObserver) {
        try {
            Chambre chambre = new Chambre();
            chambre.setType(request.getType());
            chambre.setPrix(request.getPrix());
            chambre.setDisponible(request.getDisponible());

            Chambre savedChambre = chambreService.createChambre(chambre);

            CreateChambreResponse response = CreateChambreResponse.newBuilder()
                    .setId(savedChambre.getId())
                    .setMessage("Chambre créée avec succès.") // Message en français
                    .build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (Exception e) {
            responseObserver.onError(io.grpc.Status.INTERNAL
                    .withDescription("Erreur inattendue pendant la création de la chambre: " + e.getMessage()) // Message en français
                    .asRuntimeException());
        }
    }

    @Override
    public void getChambre(GetChambreRequest request, StreamObserver<GetChambreResponse> responseObserver) {
        try {
            Chambre chambre = chambreService.getChambreById(request.getId())
                    .orElseThrow(() -> new NoSuchElementException("Chambre introuvable")); // Message en français

            ma.ensaj.reservation.grpc.stubs.Chambre grpcChambre = ma.ensaj.reservation.grpc.stubs.Chambre.newBuilder()
                    .setId(chambre.getId() != null ? chambre.getId() : 0L) // Assurez une valeur non nulle
                    .setType(chambre.getType() != null ? chambre.getType() : "") // Assurez une valeur non nulle
                    .setPrix(chambre.getPrix() != null ? chambre.getPrix() : 0.0) // Assurez une valeur non nulle
                    .setDisponible(chambre.getDisponible() != null && chambre.getDisponible()) // Assurez une valeur non nulle pour le booléen
                    .build();

            GetChambreResponse response = GetChambreResponse.newBuilder()
                    .setChambre(grpcChambre)
                    .build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (NoSuchElementException e) {
            responseObserver.onError(io.grpc.Status.NOT_FOUND
                    .withDescription("Chambre introuvable: " + e.getMessage()) // Message en français
                    .asRuntimeException());
        } catch (Exception e) {
            responseObserver.onError(io.grpc.Status.INTERNAL
                    .withDescription("Erreur inattendue lors de la récupération de la chambre: " + e.getMessage()) // Message en français
                    .asRuntimeException());
        }
    }

    @Override
    public void updateChambre(UpdateChambreRequest request, StreamObserver<UpdateChambreResponse> responseObserver) {
        try {
            Chambre updatedChambre = new Chambre();
            updatedChambre.setId(request.getId());
            updatedChambre.setType(request.getType());
            updatedChambre.setPrix(request.getPrix());
            updatedChambre.setDisponible(request.getDisponible());

            Chambre savedChambre = chambreService.updateChambre(request.getId(), updatedChambre);

            ma.ensaj.reservation.grpc.stubs.Chambre grpcChambre = ma.ensaj.reservation.grpc.stubs.Chambre.newBuilder()
                    .setId(savedChambre.getId())
                    .setType(savedChambre.getType())
                    .setPrix(savedChambre.getPrix())
                    .setDisponible(savedChambre.getDisponible())
                    .build();

            UpdateChambreResponse response = UpdateChambreResponse.newBuilder()
                    .setChambre(grpcChambre)
                    .build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (IllegalArgumentException e) {
            responseObserver.onError(io.grpc.Status.INVALID_ARGUMENT
                    .withDescription(e.getMessage()) // Message en français
                    .asRuntimeException());
        } catch (NoSuchElementException e) {
            responseObserver.onError(io.grpc.Status.NOT_FOUND
                    .withDescription("Chambre introuvable: " + e.getMessage()) // Message en français
                    .asRuntimeException());
        } catch (Exception e) {
            responseObserver.onError(io.grpc.Status.INTERNAL
                    .withDescription("Erreur inattendue lors de la mise à jour de la chambre: " + e.getMessage()) // Message en français
                    .asRuntimeException());
        }
    }

    @Override
    public void deleteChambre(DeleteChambreRequest request, StreamObserver<DeleteChambreResponse> responseObserver) {
        try {
            chambreService.deleteChambre(request.getId());

            DeleteChambreResponse response = DeleteChambreResponse.newBuilder().build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (NoSuchElementException e) {
            responseObserver.onError(io.grpc.Status.NOT_FOUND
                    .withDescription("Chambre introuvable: " + e.getMessage()) // Message en français
                    .asRuntimeException());
        } catch (Exception e) {
            responseObserver.onError(io.grpc.Status.INTERNAL
                    .withDescription("Erreur inattendue lors de la suppression de la chambre: " + e.getMessage()) // Message en français
                    .asRuntimeException());
        }
    }

    @Override
    public void getAllChambres(GetAllChambresRequest request, StreamObserver<GetAllChambresResponse> responseObserver) {
        try {
            List<Chambre> chambres = chambreService.getAllChambres();

            GetAllChambresResponse.Builder responseBuilder = GetAllChambresResponse.newBuilder();
            for (Chambre chambre : chambres) {
                ma.ensaj.reservation.grpc.stubs.Chambre grpcChambre = ma.ensaj.reservation.grpc.stubs.Chambre.newBuilder()
                        .setId(chambre.getId())
                        .setType(chambre.getType())
                        .setPrix(chambre.getPrix())
                        .setDisponible(chambre.getDisponible())
                        .build();
                responseBuilder.addChambres(grpcChambre);
            }

            responseObserver.onNext(responseBuilder.build());
            responseObserver.onCompleted();
        } catch (Exception e) {
            responseObserver.onError(io.grpc.Status.INTERNAL
                    .withDescription("Erreur inattendue lors de la récupération de toutes les chambres: " + e.getMessage()) // Message en français
                    .asRuntimeException());
        }
    }
}
