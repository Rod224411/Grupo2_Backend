package pe.edu.upc.semana9.entities;

import javax.persistence.*;

@Entity
@Table(name="usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuario;
    @Column(name="username", length=200, nullable=false)
    private String username;
    @Column(name="password", length=200, nullable=false)
    private String password;

    @Column(name="enabled",nullable=false)
    private boolean enabled;
    @Column(name="nombres", length=200, nullable=false)
    private String nombres;
    @Column(name="apellidos", length=200, nullable=false)
    private String apellidos;
    @Column(name="edad",nullable=false)
    private int edad;
    @Column(name="telefono",nullable=false)
    private int telefono;
    @Column(name="correo", length=200, nullable=false)
    private String correo;

    public Usuario() {
    }

    public Usuario(int idUsuario, String username, String password, boolean enabled, String nombres, String apellidos, int edad, int telefono, String correo) {
        this.idUsuario = idUsuario;
        this.username = username;
        this.password = password;
        this.enabled = enabled;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.telefono = telefono;
        this.correo = correo;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
