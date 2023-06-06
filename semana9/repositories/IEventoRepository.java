package pe.edu.upc.demoubicacion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demoubicacion.entities.Evento;

@Repository
public interface IEventoRepository extends JpaRepository<Evento,Integer> {
}
