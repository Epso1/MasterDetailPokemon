package com.example.masterdetailpokemon;

import java.io.Serializable;

public class Pokemon implements Serializable{
    private String nombre;
    private String descripcion;

    private int imagenResId; // ID del recurso de la imagen del Pokemon



    public Pokemon(String nombre, String descripcion, int imagenResId) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imagenResId = imagenResId;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getImagenResId() {
        return imagenResId;
    }
    @Override
    public String toString() {
        return nombre;
    }
}