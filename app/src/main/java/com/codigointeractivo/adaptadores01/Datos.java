package com.codigointeractivo.adaptadores01;

import java.io.Serializable;

/**
 * Created by usuario on 24/2/17.
 */

public class Datos implements Serializable {

    private int Id;
    private String Titulo;
    private String Detalle;
    private int Imagen;

    public Datos(String detalle, int id, int imagen, String titulo) {
        Detalle = detalle;
        Id = id;
        Imagen = imagen;
        Titulo = titulo;
    }

    public String getDetalle() {
        return Detalle;
    }

    public void setDetalle(String detalle) {
        Detalle = detalle;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getImagen() {
        return Imagen;
    }

    public void setImagen(int imagen) {
        Imagen = imagen;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }
}
