package ma.ensaj.reservation.services;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import ma.ensaj.reservation.entities.Chambre;
import ma.ensaj.reservation.repositories.ChambreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class ChambreService {

    @Autowired
    private ChambreRepository chambreRepository;

    public List<Chambre> getAllChambres() {
        return chambreRepository.findAll();
    }

    public Optional<Chambre> getChambreById(Long id) {
        return chambreRepository.findById(id);
    }

    public Chambre createChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    public Chambre updateChambre(Long id, Chambre chambre) {
        if (chambreRepository.existsById(id)) {
            chambre.setId(id);
            return chambreRepository.save(chambre);
        }
        throw new RuntimeException("Chambre non trouvé");
    }

    public void deleteChambre(Long id) {
        if (chambreRepository.existsById(id)) {
            chambreRepository.deleteById(id);
        } else {
            throw new RuntimeException("Chambre non trouvé");
        }
    }

}
