package tf.huaycosos.upc.tfhuaycosos.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tf.huaycosos.upc.tfhuaycosos.entities.Caso;
import tf.huaycosos.upc.tfhuaycosos.repositories.ICasoRepository;
import tf.huaycosos.upc.tfhuaycosos.services.ICasoService;

import java.util.List;
@Service
public class CasoServiceImplement implements ICasoService {
    @Autowired
    private ICasoRepository cR;
    @Override
    public void insert(Caso caso) {
        cR.save(caso);
    }

    @Override
    public List<Caso> list() {
        return cR.findAll();
    }

    @Override
    public void delete(int idCaso) {
        cR.deleteById(idCaso);
    }

    @Override
    public Caso listId(int idCaso) {
        return cR.findById(idCaso).orElse(new Caso());
    }
}
