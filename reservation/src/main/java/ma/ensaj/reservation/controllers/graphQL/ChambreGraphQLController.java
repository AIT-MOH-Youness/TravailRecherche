package ma.ensaj.reservation.controllers.graphQL;

import ma.ensaj.reservation.entities.Chambre;
import ma.ensaj.reservation.services.ChambreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ChambreGraphQLController {

    @Autowired
    private ChambreService chambreService;

    // READ: Récupérer toutes les chambres
    @QueryMapping
    public List<Chambre> getAllChambres() {
        try {
            return chambreService.getAllChambres();
        } catch (Exception e) {
            throw new RuntimeException("Une erreur s'est produite lors de la récupération des chambres", e);
        }
    }

    // READ: Récupérer une chambre par son identifiant
    @QueryMapping
    public Chambre getChambreById(@Argument Long id) {
        try {
            return chambreService.getChambreById(id)
                    .orElseThrow(() -> new RuntimeException("Chambre non trouvée"));
        } catch (Exception e) {
            throw new RuntimeException("Une erreur s'est produite lors de la récupération par Id", e);
        }
    }

    // CREATE: Ajouter une nouvelle chambre
    @MutationMapping
    public Chambre createChambre(@Argument Chambre chambre) {
        try {
            return chambreService.createChambre(chambre);
        } catch (Exception e) {
            throw new RuntimeException("Une erreur s'est produite lors de la création des chambres", e);
        }
    }

    // UPDATE: Mettre à jour une chambre existante
    @MutationMapping
    public Chambre updateChambre(@Argument Long id, @Argument Chambre chambreDetails) {
        try {
            return chambreService.getChambreById(id)
                    .map(chambre -> {
                        chambre.setDisponible(chambreDetails.getDisponible());
                        chambre.setType(chambreDetails.getType());
                        chambre.setPrix(chambreDetails.getPrix());
                        return chambreService.createChambre(chambre);
                    }).orElseThrow(() -> new RuntimeException("Chambre non trouvée"));
        } catch (Exception e) {
            throw new RuntimeException("Une erreur s'est produite lors de la mise à jour des chambres", e);
        }
    }

    // DELETE: Supprimer une chambre
    @MutationMapping
    public Boolean deleteChambre(@Argument Long id) {
        try {
            return chambreService.getChambreById(id)
                    .map(chambre -> {
                        chambreService.deleteChambre(id);
                        return true;
                    }).orElseThrow(() -> new RuntimeException("Chambre non trouvée"));
        } catch (Exception e) {
            throw new RuntimeException("Une erreur s'est produite lors de la suppression des chambres", e);
        }
    }
}
