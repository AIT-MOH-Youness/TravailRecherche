package ma.ensaj.reservation.controllers.soap;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import ma.ensaj.reservation.dto.ClientInput;
import ma.ensaj.reservation.entities.Client;
import ma.ensaj.reservation.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@WebService(serviceName = "ClientSoap")
@Service
public class ClientSoapController {

    @Autowired
    private ClientService clientService;

    @WebMethod(operationName = "getAllClients")
    public List<Client> getAllClients() {
        try {
            return clientService.getAllClients();
        } catch (Exception e) {
            throw new RuntimeException("Une erreur s'est produite lors de la récupération des clients", e);
        }
    }

    @WebMethod(operationName = "getClientById")
    public Client getClientById(Long id) {
        try {
            Optional<Client> client = clientService.getClientById(id);
            if (client.isPresent()) {
                return client.get();
            }
            return null;
        } catch (Exception e) {
            throw new RuntimeException("Une erreur s'est produite lors de la récupération du client", e);
        }
    }

    @WebMethod(operationName = "createClient")
    public Client createClient(Client client) {
        try {
            return clientService.createClient(client);
        } catch (Exception e) {
            throw new RuntimeException("Une erreur s'est produite lors de la création du client", e);
        }
    }

    @WebMethod(operationName = "updateClient")
    public Client updateClient(Long id, ClientInput clientDetails) {
        try {
            Optional<Client> existingClient = clientService.getClientById(id);
            if (existingClient.isPresent()) {
                Client client = existingClient.get();
                client.setNom(clientDetails.getNom());
                client.setPrenom(clientDetails.getPrenom());
                client.setEmail(clientDetails.getEmail());
                client.setTelephone(clientDetails.getTelephone());
                return clientService.createClient(client);
            }
            return null;
        } catch (Exception e) {
            throw new RuntimeException("Une erreur s'est produite lors de la mise à jour du client", e);
        }
    }

    @WebMethod(operationName = "deleteClient")
    public boolean deleteClient(Long id) {
        try {
            Optional<Client> client = clientService.getClientById(id);
            if (client.isPresent()) {
                clientService.deleteClient(id);
                return true;
            }
            return false;
        } catch (Exception e) {
            throw new RuntimeException("Une erreur s'est produite lors de la suppression du client", e);
        }
    }
}
