package tf.huaycosos.upc.tfhuaycosos.dtos;

import tf.huaycosos.upc.tfhuaycosos.entities.Damnificado;
import tf.huaycosos.upc.tfhuaycosos.entities.TipoDeCaso;
import tf.huaycosos.upc.tfhuaycosos.entities.Ubicacion;

public class CasoDTO {
    private int idCaso;
    private String titulo;
    private String argumento;
    private Damnificado damnificado;
    private TipoDeCaso tipoDeCaso;
    private Ubicacion ubicacion;

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

    public Damnificado getDamnificado() {
        return damnificado;
    }

    public void setDamnificado(Damnificado damnificado) {
        this.damnificado = damnificado;
    }

    public TipoDeCaso getTipoDeCaso() {
        return tipoDeCaso;
    }

    public void setTipoDeCaso(TipoDeCaso tipoDeCaso) {
        this.tipoDeCaso = tipoDeCaso;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }
}
