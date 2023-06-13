package pe.edu.upc.semana9.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.semana9.entities.Cuentabancaria;
@Repository
public interface ICuentabancariaRepository extends JpaRepository<Cuentabancaria,Integer>{
}
