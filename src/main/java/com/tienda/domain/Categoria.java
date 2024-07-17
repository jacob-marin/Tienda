package com.tienda.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;
import lombok.Data;

/**
 *
 * @author jacob
 */
@Data // para utomaticamente crear los get and set
@Entity
@Table(name = "categoria")
public class Categoria implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    private long idCategoria;
    private String descripcion;
    private String rutaImagen; //Hibernate lo trasforma en Ruta_imagen
    private boolean activo;

    @OneToMany
    @JoinColumn(name = "id_categoria", insertable = false, updatable = false)
    List<Producto> productos;

    public Categoria() {
    }

    public Categoria(String descripcion, String rutaImagen, boolean activo) {
        this.descripcion = descripcion;
        this.rutaImagen = rutaImagen;
        this.activo = activo;
    }
}
