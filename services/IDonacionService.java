package pe.edu.upc.semana9.services;

import pe.edu.upc.semana9.entities.Donacion;

import java.util.List;

public interface IDonacionService {
    public void insert(Donacion donacion);
    List<Donacion> list();
}
