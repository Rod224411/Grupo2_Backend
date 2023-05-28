package tf.huaycosos.upc.tfhuaycosos.entities;

import javax.persistence.*;

@Entity
@Table(name="tipodecaso")
public class TipoDeCaso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipoDeCaso;
    @Column(name = "name", length = 100, nullable = false)
    private String name;
    @Column(name="description", length = 200, nullable = false)
    private String description;

    public TipoDeCaso() {
    }

    public TipoDeCaso(int idTipoDeCaso, String name, String description) {
        this.idTipoDeCaso = idTipoDeCaso;
        this.name = name;
        this.description = description;
    }

    public int getIdTipoDeCaso() {
        return idTipoDeCaso;
    }

    public void setIdTipoDeCaso(int idTipoDeCaso) {
        this.idTipoDeCaso = idTipoDeCaso;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
