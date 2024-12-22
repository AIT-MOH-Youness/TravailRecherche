package ma.ensaj.reservation.controllers.graphQL;

import ma.ensaj.reservation.entities.Client;
import ma.ensaj.reservation.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hotelGraphQL")
public class ClientQraphQLController {

    @Autowired
    private ClientService clientService;

    // READ: Récupérer tous les clients
    @QueryMapping
    public List<Client> getAllClients() {
        try {
            return clientService.getAllClients();
        } catch (Exception e) {
            throw new RuntimeException("Une erreur s'est produite lors de la récupération des clients", e);
        }
    }

    // READ: Récupérer un client par son identifiant
    @QueryMapping
    public Client getClientById(@Argument Long id) {
        try {
            return clientService.getClientById(id).orElseThrow(() ->
                    new RuntimeException("Client not found"));
        } catch (Exception e) {
            throw new RuntimeException("Une erreur s'est produite lors de la récupération du client", e);
        }
    }

    // CREATE: Ajouter un nouveau client
    @MutationMapping
    public Client createClient(@Argument Client client) {
        try {
            return clientService.createClient(client);
        } catch (Exception e) {
            throw new RuntimeException("Une erreur s'est produite lors de la création du client", e);
        }
    }

    // UPDATE: Mettre à jour un client existant
    @MutationMapping
    public Client updateClient(@Argument Long id, @Argument Client clientDetails) {
        try {
            return clientService.getClientById(id)
                    .map(client -> {
                        client.setNom(clientDetails.getNom());
                        client.setPrenom(clientDetails.getPrenom());
                        client.setEmail(clientDetails.getEmail());
                        client.setTelephone(clientDetails.getTelephone());
                        return clientService.createClient(client);
                    }).orElseThrow(() -> new RuntimeException("Client not found"));
        } catch (Exception e) {
            throw new RuntimeException("Une erreur s'est produite lors de la mise à jour du client", e);
        }
    }

    // DELETE: Supprimer un client
    @MutationMapping
    public Boolean deleteClient(@Argument Long id) {
        try {
            return clientService.getClientById(id)
                    .map(client -> {
                        clientService.deleteClient(id);
                        return true;
                    }).orElseThrow(() -> new RuntimeException("Client not found"));
        } catch (Exception e) {
            throw new RuntimeException("Une erreur s'est produite lors de la suppression du client", e);
        }
    }

}
