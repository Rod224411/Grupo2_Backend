package tf.huaycosos.upc.tfhuaycosos.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tf.huaycosos.upc.tfhuaycosos.entities.TipoDeCaso;
import tf.huaycosos.upc.tfhuaycosos.repositories.ITipoDeCasoRepository;
import tf.huaycosos.upc.tfhuaycosos.services.ITipoDeCasoService;

import java.util.List;

@Service
public class TipoDeCasoServicesImplement implements ITipoDeCasoService {
    @Autowired
    private ITipoDeCasoRepository tcR;

    @Override
    public void insert(TipoDeCaso typeCase) {
        tcR.save(typeCase);
    }

    @Override
    public List<TipoDeCaso> list() {
        return tcR.findAll();
    }

    @Override
    public void delete(int idTipoDeCaso) {
        tcR.deleteById(idTipoDeCaso);
    }

    @Override
    public TipoDeCaso listId(int idTipoDeCaso) {
        return tcR.findById(idTipoDeCaso).orElse(new TipoDeCaso());
    }
}
