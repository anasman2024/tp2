package ma.enset.tp2.repository;

import ma.enset.tp2.entities.Medecin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedecinRepository extends JpaRepository<Medecin,Long> {
    Medecin findByNom(String nom);
}
