package pe.edu.upc.semana9.dtos;

public class DamnificadoDTO {
    private int idDamnificado;
    private int dni;
    private String nombres;
    private String apellidos;
    private int edad;
    private int peso;
    private int telefono;
    private int contrasena;
    private int correo;

    public int getIdDamnificado() {
        return idDamnificado;
    }

    public void setIdDamnificado(int idDamnificado) {
        this.idDamnificado = idDamnificado;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
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

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getContrasena() {
        return contrasena;
    }

    public void setContrasena(int contrasena) {
        this.contrasena = contrasena;
    }

    public int getCorreo() {
        return correo;
    }

    public void setCorreo(int correo) {
        this.correo = correo;
    }
}
