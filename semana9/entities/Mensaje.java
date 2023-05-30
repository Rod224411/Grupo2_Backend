package pe.edu.upc.semana9.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity

@Table(name = "mensajes")

public class Mensaje {
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMensaje;

    @Column(name = "descripcion",length = 200, nullable = false)
    private String descripcion;

    @ManyToOne
    @JoinColumn(name="idDamnificado")
    private Damnificado damnificado;

    @ManyToOne
    @JoinColumn(name="idDonador")
    private Donador donador;

    public Mensaje() {
    }
    public Mensaje(int idMensaje, String descripcion, Damnificado damnificado, Donador donador) {
        this.idMensaje = idMensaje;
        this.descripcion = descripcion;
        this.damnificado = damnificado;
        this.donador = donador;
    }

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
