package pe.edu.upc.semana9.services;

import pe.edu.upc.semana9.entities.Mensaje;

import java.util.List;

public interface IMensajeService {
    public void insert(Mensaje mensaje);
    List<Mensaje> list();
    List<Mensaje> find(Integer id);
}
