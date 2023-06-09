package pe.edu.upc.semana9.dtos;

import pe.edu.upc.semana9.entities.Caso;
import pe.edu.upc.semana9.entities.Donador;
import javax.persistence.ManyToOne;
public class DonacionDTO {
    private int idDonacion;
    private String tipo;
    private String viveres;
    private float cantidad;
    private Donador donador;
    private Caso caso;

    public int getIdDonacion() {
        return idDonacion;
    }

    public void setIdDonacion(int idDonacion) {
        this.idDonacion = idDonacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getViveres() {
        return viveres;
    }

    public void setViveres(String viveres) {
        this.viveres = viveres;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public Donador getDonador() {
        return donador;
    }

    public void setDonador(Donador donador) {
        this.donador = donador;
    }

    public Caso getCaso() {
        return caso;
    }

    public void setCaso(Caso caso) {
        this.caso = caso;
    }
}