package pe.edu.upc.semana9.services;

import pe.edu.upc.semana9.entities.Cuentabancaria;

import java.util.List;

public interface ICuentabancariaService {
    public void insert(Cuentabancaria cuentabancaria);
    List<Cuentabancaria> list();
    public void delete(int idCuentabancaria);
    public Cuentabancaria listId(int idCuentabancaria);
}
