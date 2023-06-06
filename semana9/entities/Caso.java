package tf.huaycosos.upc.tfhuaycosos.entities;

import javax.persistence.*;

@Entity
@Table(name = "caso")
public class Caso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCaso;
    @Column(name = "titulo", length = 30, nullable = false)
    private String titulo;
    @Column(name = "argumento", length = 200, nullable = false)
    private String argumento;
    @ManyToOne
    @JoinColumn(name = "idDamnificado")
    private Damnificado idDamnificado;
    @ManyToOne
    @JoinColumn(name = "idTipoDeCaso")
    private TipoDeCaso idTipoDeCaso;
    @ManyToOne
    @JoinColumn(name = "idUbicacion")
    private Ubicacion idUbicacion;

    public Caso(){

    }

    public Caso(int idCaso, String titulo, String argumento, Damnificado idDamnificado, TipoDeCaso idTipoDeCaso, Ubicacion idUbicacion) {
        this.idCaso = idCaso;
        this.titulo = titulo;
        this.argumento = argumento;
        this.idDamnificado = idDamnificado;
        this.idTipoDeCaso = idTipoDeCaso;
        this.idUbicacion = idUbicacion;
    }

    public int getIdCaso() {
        return idCaso;
    }

    public void setIdCaso(int idCaso) {
        this.idCaso = idCaso;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArgumento() {
        return argumento;
    }

    public void setArgumento(String argumento) {
        this.argumento = argumento;
    }

    public Damnificado getIdDamnificado() {
        return idDamnificado;
    }

    public void setIdDamnificado(Damnificado idDamnificado) {
        this.idDamnificado = idDamnificado;
    }

    public TipoDeCaso getIdTipoDeCaso() {
        return idTipoDeCaso;
    }

    public void setIdTipoDeCaso(TipoDeCaso idTipoDeCaso) {
        this.idTipoDeCaso = idTipoDeCaso;
    }

    public Ubicacion getIdUbicacion() {
        return idUbicacion;
    }

    public void setIdUbicacion(Ubicacion idUbicacion) {
        this.idUbicacion = idUbicacion;
    }
}
