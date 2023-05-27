package pe.edu.upc.trabajof.services;

import pe.edu.upc.trabajof.entities.Donador;

import java.util.List;

public interface DonadorService {
    public void insert(Donador donador);
    List<Donador> list();

    public void delete(int idDonador);
    public Donador listId(int idDonador);
}
