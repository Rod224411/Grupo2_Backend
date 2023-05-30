package pe.edu.upc.semana9.dtos;

import pe.edu.upc.semana9.entities.Damnificado;
import pe.edu.upc.semana9.entities.Donador;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class MensajeDTO {
    private int idMensaje;

    private String descripcion;

    private Damnificado damnificado;

    private Donador donador;

    public int getIdMensaje() {
        return idMensaje;
    }

    public void setIdMensaje(int idMensaje) {
        this.idMensaje = idMensaje;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Damnificado getDamnificado() {
        return damnificado;
    }

    public void setDamnificado(Damnificado damnificado) {
        this.damnificado = damnificado;
    }

    public Donador getDonador() {
        return donador;
    }

    public void setDonador(Donador donador) {
        this.donador = donador;
    }
}
