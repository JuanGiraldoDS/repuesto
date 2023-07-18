package co.com.repuestos.ps.modelo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
@Table
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Data
public class Repuestos {
    public Repuestos() {

    }

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    @Column(name="color", nullable=false)
    private int color;
    @Column(name="nombre", nullable=false)
    private String nombre;
    @Column(name="marca", nullable=false)
    private String marca;
    @Column(name="modelo", nullable=false)
    private String modelo;
    @Column(name="precio", nullable=false)
    private double precio;
    @Column(name="fechainventario", nullable=false)
    private Date fechaInventario;
    @Column(name="venceelproducto", nullable=false)
    private boolean venceElProducto;

}


