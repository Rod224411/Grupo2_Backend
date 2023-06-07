package pe.edu.upc.trabajof.services;

import pe.edu.upc.trabajof.entities.Usuario;

import java.util.List;

public interface IUsuarioService {
    public void insert(Usuario usuario);
    List<Usuario> list();
    public void delete(int idUsuario);
    public Usuario listId(int idUsuario);
}
