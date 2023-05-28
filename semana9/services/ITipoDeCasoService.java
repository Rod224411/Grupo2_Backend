package tf.huaycosos.upc.tfhuaycosos.services;

import tf.huaycosos.upc.tfhuaycosos.entities.TipoDeCaso;

import java.util.List;

public interface ITipoDeCasoService {
    public void insert(TipoDeCaso typeCase);

    List<TipoDeCaso> list();

    public void delete(int idTipoDeCaso);

    public TipoDeCaso listId(int idTipoDeCaso);
}
