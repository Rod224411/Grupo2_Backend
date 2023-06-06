package pe.edu.upc.trabajof.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.trabajof.entities.Donacion;

@Repository
public interface DonacionRepository extends JpaRepository<Donacion, Integer> {

}
