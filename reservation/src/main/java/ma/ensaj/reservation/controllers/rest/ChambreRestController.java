package ma.ensaj.reservation.controllers.rest;

import ma.ensaj.reservation.entities.Chambre;
import ma.ensaj.reservation.services.ChambreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotelRest")
public class ChambreRestController {

    @Autowired
    private ChambreService chambreService;

    // READ: Récupérer toutes les chambres
    @GetMapping("/chambres")
    public List<Chambre> getAllChambres() {
        try {
            return chambreService.getAllChambres();
        } catch (Exception e) {
            throw new RuntimeException("Une erreur s'est produite lors de la récupération des chambres", e);
        }
    }

    // READ: Récupérer une chambre par son identifiant
    @GetMapping("/chambres/{id}")
    public ResponseEntity<Chambre> getChambreById(@PathVariable Long id) {
        try {
            return chambreService.getChambreById(id)
                    .map(chambre -> ResponseEntity.ok().body(chambre))
                    .orElse(ResponseEntity.notFound().build());
        } catch (Exception e) {
            throw new RuntimeException("Une erreur s'est produite lors de la récupération by Id", e);
        }
    }

    // CREATE: Ajouter une nouvelle chambre
    @PostMapping("/chambres")
    public Chambre createChambre(@RequestBody Chambre chambre) {
        try {
            return chambreService.createChambre(chambre);
        } catch (Exception e) {
            throw new RuntimeException("Une erreur s'est produite lors de la création des chambres", e);
        }
    }

    // UPDATE: Mettre à jour une chambre existante
    @PutMapping("/chambres/{id}")
    public ResponseEntity<Chambre> updateChambre(@PathVariable Long id,
                                                 @RequestBody Chambre chambreDetails) {
        try {
            return chambreService.getChambreById(id)
                    .map(chambre -> {
                        chambre.setDisponible(chambreDetails.getDisponible());
                        chambre.setType(chambreDetails.getType());
                        chambre.setPrix(chambreDetails.getPrix());
                        Chambre updatedChambre = chambreService.createChambre(chambre);
                        return ResponseEntity.ok().body(updatedChambre);
                    }).orElse(ResponseEntity.notFound().build());
        } catch (Exception e) {
            throw new RuntimeException("Une erreur s'est produite lors de la mise a jour des chambres", e);
        }
    }

    // DELETE: Supprimer une chambre
    @DeleteMapping("/chambres/{id}")
    public ResponseEntity<Void> deleteChambre(@PathVariable Long id) {
        try {
            return chambreService.getChambreById(id)
                    .map(chambre -> {
                        chambreService.deleteChambre(id);
                        return ResponseEntity.ok().<Void>build();
                    })
                    .orElse(ResponseEntity.notFound().build());
        } catch (Exception e) {
            throw new RuntimeException("Une erreur s'est produite lors de la suppression des chambres", e);
        }
    }
}
