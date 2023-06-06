package pe.edu.upc.trabajof.services;

import pe.edu.upc.trabajof.entities.Donacion;
import pe.edu.upc.trabajof.entities.Donador;

import java.util.List;

public interface DonacionService {
    public void insert(Donacion donacion);
    List<Donacion> list();

}
