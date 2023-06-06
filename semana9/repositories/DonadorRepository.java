package pe.edu.upc.trabajof.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.trabajof.entities.Donador;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface DonadorRepository extends JpaRepository<Donador, Integer> {
    @Query("from Donador d where d.idDonador=:id")
        List<Donador> buscarDonador(@Param("id")int id);
}
