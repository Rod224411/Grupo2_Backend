package tf.huaycosos.upc.tfhuaycosos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tf.huaycosos.upc.tfhuaycosos.entities.Caso;

public interface ICasoRepository extends JpaRepository<Caso,Integer> {
    //Query
}
