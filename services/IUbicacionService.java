package pe.edu.upc.semana9.services;
import pe.edu.upc.semana9.entities.Ubicacion;

import java.util.List;
public interface IUbicacionService {
    public void insert(Ubicacion ubicacion);
    List<Ubicacion> list();
    public void delete(int idUbicacion);
    public Ubicacion listId(int idUbicacion);
}