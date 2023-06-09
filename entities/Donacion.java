package pe.edu.upc.semana9.entities;


import javax.persistence.*;

@Entity
@Table(name="donaciones")
public class Donacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDonacion;
    @Column(name="tipo", length=200, nullable=false)
    private String tipo;
    @Column(name="viveres", length=200, nullable=false)
    private String viveres;
    @Column(name="cantidad", nullable=false)
    private float cantidad;

    @ManyToOne
    @JoinColumn(name="dni")
    private Donador donador;

    @ManyToOne
    @JoinColumn(name="idCaso")
    private Caso caso;

    public Donacion() {
    }

    public Donacion(int idDonacion, String tipo, String viveres, float cantidad, Donador donador, Caso caso) {
        this.idDonacion = idDonacion;
        this.tipo = tipo;
        this.viveres = viveres;
        this.cantidad = cantidad;
        this.donador = donador;
        this.caso = caso;
    }

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
