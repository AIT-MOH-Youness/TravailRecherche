package ma.ensaj.reservation.controllers.rest;

import ma.ensaj.reservation.entities.Client;
import ma.ensaj.reservation.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotelRest")
public class ClientRestController {

    @Autowired
    private ClientService clientService;

    // READ: Récupérer tous les clients
    @GetMapping("/clients")
    public List<Client> getAllClients() {
        try {
            return clientService.getAllClients();
        } catch (Exception e) {
            throw new RuntimeException("Une erreur s'est produite lors de la récupération des clients", e);
        }
    }

    // READ: Récupérer un client par son identifiant
    @GetMapping("/clients/{id}")
    public ResponseEntity<Client> getClientById(@PathVariable Long id) {
        try {
            return clientService.getClientById(id)
                    .map(client -> ResponseEntity.ok().body(client))
                    .orElse(ResponseEntity.notFound().build());
        } catch (Exception e) {
            throw new RuntimeException("Une erreur s'est produite lors de la récupération du client", e);
        }
    }

    // CREATE: Ajouter un nouveau client
    @PostMapping("/clients")
    public Client createClient(@RequestBody Client client) {
        try {
            return clientService.createClient(client);
        } catch (Exception e) {
            throw new RuntimeException("Une erreur s'est produite lors de la création du client", e);
        }
    }

    // UPDATE: Mettre à jour un client existant
    @PutMapping("/clients/{id}")
    public ResponseEntity<Client> updateClient(@PathVariable Long id,
                                               @RequestBody Client clientDetails) {
        try {
            return clientService.getClientById(id)
                    .map(client -> {
                        client.setNom(clientDetails.getNom());
                        client.setPrenom(clientDetails.getPrenom());
                        client.setEmail(clientDetails.getEmail());
                        client.setTelephone(clientDetails.getTelephone());
                        Client updatedClient = clientService.createClient(client);
                        return ResponseEntity.ok().body(updatedClient);
                    }).orElse(ResponseEntity.notFound().build());
        } catch (Exception e) {
            throw new RuntimeException("Une erreur s'est produite lors de la mise à jour du client", e);
        }
    }

    // DELETE: Supprimer un client
    @DeleteMapping("/clients/{id}")
    public ResponseEntity<Void> deleteClient(@PathVariable Long id) {
        try {
            return clientService.getClientById(id)
                    .map(client -> {
                        clientService.deleteClient(id);
                        return ResponseEntity.ok().<Void>build();
                    })
                    .orElse(ResponseEntity.notFound().build());
        } catch (Exception e) {
            throw new RuntimeException("Une erreur s'est produite lors de la suppression du client", e);
        }
    }
}
