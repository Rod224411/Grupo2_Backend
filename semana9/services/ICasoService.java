package tf.huaycosos.upc.tfhuaycosos.services;

import tf.huaycosos.upc.tfhuaycosos.entities.Caso;

import java.util.List;

public interface ICasoService {
    public void insert(Caso caso);
    List<Caso> list();
    public void delete(int idCaso);
    public Caso listId(int idCaso);
}
