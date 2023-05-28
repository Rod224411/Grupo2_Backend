package tf.huaycosos.upc.tfhuaycosos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tf.huaycosos.upc.tfhuaycosos.entities.TipoDeCaso;

@Repository
public interface ITipoDeCasoRepository extends JpaRepository<TipoDeCaso,Integer> {
}
