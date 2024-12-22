package ma.ensaj.reservation.grpc;

import io.grpc.stub.StreamObserver;
import ma.ensaj.reservation.entities.Client;
import ma.ensaj.reservation.grpc.stubs.*;
import ma.ensaj.reservation.services.ClientService;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.NoSuchElementException;

@GrpcService
public class ClientServiceGrpc extends ma.ensaj.reservation.grpc.stubs.ClientServiceGrpc.ClientServiceImplBase {

    @Autowired
    private ClientService clientService;

    @Override
    public void createClient(CreateClientRequest request, StreamObserver<CreateClientResponse> responseObserver) {
        try {
            Client client = new Client();
            client.setNom(request.getNom());
            client.setPrenom(request.getPrenom());
            client.setEmail(request.getEmail());
            client.setTelephone(request.getTelephone());

            Client savedClient = clientService.createClient(client);

            CreateClientResponse response = CreateClientResponse.newBuilder()
                    .setId(savedClient.getId())
                    .setMessage("Client créé avec succès.")
                    .build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (Exception e) {
            responseObserver.onError(io.grpc.Status.INTERNAL
                    .withDescription("Erreur inattendue lors de la création du client : " + e.getMessage())
                    .asRuntimeException());
        }
    }

    @Override
    public void getClient(GetClientRequest request, StreamObserver<GetClientResponse> responseObserver) {
        try {
            Client client = clientService.getClientById(request.getId())
                    .orElseThrow(() -> new NoSuchElementException("Client non trouvé"));

            ma.ensaj.reservation.grpc.stubs.Client grpcClient = ma.ensaj.reservation.grpc.stubs.Client.newBuilder()
                    .setId(client.getId())
                    .setNom(client.getNom())
                    .setPrenom(client.getPrenom())
                    .setEmail(client.getEmail())
                    .setTelephone(client.getTelephone())
                    .build();

            GetClientResponse response = GetClientResponse.newBuilder()
                    .setClient(grpcClient)
                    .build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (NoSuchElementException e) {
            responseObserver.onError(io.grpc.Status.NOT_FOUND
                    .withDescription("Client non trouvé : " + e.getMessage())
                    .asRuntimeException());
        } catch (Exception e) {
            responseObserver.onError(io.grpc.Status.INTERNAL
                    .withDescription("Erreur inattendue lors de la récupération du client : " + e.getMessage())
                    .asRuntimeException());
        }
    }

    @Override
    public void updateClient(UpdateClientRequest request, StreamObserver<UpdateClientResponse> responseObserver) {
        try {
            Client updatedClient = new Client();
            updatedClient.setId(request.getId());
            updatedClient.setNom(request.getNom());
            updatedClient.setPrenom(request.getPrenom());
            updatedClient.setEmail(request.getEmail());
            updatedClient.setTelephone(request.getTelephone());

            Client savedClient = clientService.updateClient(request.getId(), updatedClient);

            ma.ensaj.reservation.grpc.stubs.Client grpcClient = ma.ensaj.reservation.grpc.stubs.Client.newBuilder()
                    .setId(savedClient.getId())
                    .setNom(savedClient.getNom())
                    .setPrenom(savedClient.getPrenom())
                    .setEmail(savedClient.getEmail())
                    .setTelephone(savedClient.getTelephone())
                    .build();

            UpdateClientResponse response = UpdateClientResponse.newBuilder()
                    .setClient(grpcClient)
                    .build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (IllegalArgumentException e) {
            responseObserver.onError(io.grpc.Status.INVALID_ARGUMENT
                    .withDescription(e.getMessage())
                    .asRuntimeException());
        } catch (NoSuchElementException e) {
            responseObserver.onError(io.grpc.Status.NOT_FOUND
                    .withDescription("Client non trouvé : " + e.getMessage())
                    .asRuntimeException());
        } catch (Exception e) {
            responseObserver.onError(io.grpc.Status.INTERNAL
                    .withDescription("Erreur inattendue lors de la mise à jour du client : " + e.getMessage())
                    .asRuntimeException());
        }
    }

    @Override
    public void deleteClient(DeleteClientRequest request, StreamObserver<DeleteClientResponse> responseObserver) {
        try {
            clientService.deleteClient(request.getId());

            DeleteClientResponse response = DeleteClientResponse.newBuilder().build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (NoSuchElementException e) {
            responseObserver.onError(io.grpc.Status.NOT_FOUND
                    .withDescription("Client non trouvé : " + e.getMessage())
                    .asRuntimeException());
        } catch (Exception e) {
            responseObserver.onError(io.grpc.Status.INTERNAL
                    .withDescription("Erreur inattendue lors de la suppression du client : " + e.getMessage())
                    .asRuntimeException());
        }
    }

    @Override
    public void getAllClients(GetAllClientsRequest request, StreamObserver<GetAllClientsResponse> responseObserver) {
        try {
            List<Client> clients = clientService.getAllClients();

            GetAllClientsResponse.Builder responseBuilder = GetAllClientsResponse.newBuilder();
            for (Client client : clients) {
                ma.ensaj.reservation.grpc.stubs.Client grpcClient = ma.ensaj.reservation.grpc.stubs.Client.newBuilder()
                        .setId(client.getId())
                        .setNom(client.getNom())
                        .setPrenom(client.getPrenom())
                        .setEmail(client.getEmail())
                        .setTelephone(client.getTelephone())
                        .build();
                responseBuilder.addClients(grpcClient);
            }

            responseObserver.onNext(responseBuilder.build());
            responseObserver.onCompleted();
        } catch (Exception e) {
            responseObserver.onError(io.grpc.Status.INTERNAL
                    .withDescription("Erreur inattendue lors de la récupération des clients : " + e.getMessage())
                    .asRuntimeException());
        }
    }
}
