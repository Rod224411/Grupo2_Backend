package pe.edu.upc.demoubicacion.services;

import pe.edu.upc.demoubicacion.entities.Evento;
import pe.edu.upc.demoubicacion.entities.Ubicacion;

import java.util.List;

public interface IEventoService {
    public void insert(Evento evento);
    List<Evento> list();
    public Evento listId(int idEvento);

}
