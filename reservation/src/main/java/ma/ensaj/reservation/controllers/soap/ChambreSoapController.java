package ma.ensaj.reservation.controllers.soap;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import ma.ensaj.reservation.dto.ChambreInput;
import ma.ensaj.reservation.entities.Chambre;
import ma.ensaj.reservation.services.ChambreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@WebService(serviceName = "hotelSoap")
@Component
public class ChambreSoapController {

    @Autowired
    private ChambreService chambreService;

    @WebMethod(operationName = "getAllChambres")
    public List<Chambre> getAllChambres() {
        return chambreService.getAllChambres();
    }

    @WebMethod(operationName = "getChambreById")
    public Chambre getChambreById(@WebParam(name = "id") Long id) {
        return chambreService.getChambreById(id)
                .orElseThrow(() -> new RuntimeException("Chambre non trouvée"));
    }

    @WebMethod(operationName = "createChambre")
    public Chambre createChambre(@WebParam(name = "chambre") Chambre chambre) {
        return chambreService.createChambre(chambre);
    }

    @WebMethod(operationName = "updateChambre")
    public Chambre updateChambre(@WebParam(name = "id") Long id, @WebParam(name = "chambreDetails") ChambreInput chambreDetails) {
        return chambreService.getChambreById(id)
                .map(chambre -> {
                    chambre.setDisponible(chambreDetails.getDisponible());
                    chambre.setType(chambreDetails.getType());
                    chambre.setPrix(chambreDetails.getPrix());
                    return chambreService.createChambre(chambre);
                })
                .orElseThrow(() -> new RuntimeException("Chambre non trouvée"));
    }

    @WebMethod(operationName = "deleteChambre")
    public void deleteChambre(@WebParam(name = "id") Long id) {
        chambreService.getChambreById(id)
                .ifPresentOrElse(
                        chambre -> {
                            if (chambre.getDisponible()==false) {
                                throw new RuntimeException("Chambre reservée : impossible de la supprimer");
                            }
                            chambreService.deleteChambre(id);
                        },
                        () -> {
                            throw new RuntimeException("Chambre non trouvée");
                        }
                );
    }


}
