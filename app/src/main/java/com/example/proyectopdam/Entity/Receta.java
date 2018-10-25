package com.example.proyectopdam.Entity;

import java.util.List;

/**
 * Created by 2107262 on 10/25/2018.
 */

public class Receta {
    private String nombre;
    private List<String> ingredientes;
    private String descripcion;
    private String usuario;
    private String pasos;

    public Receta(String nombre, List<String> ingredientes, String descripcion, String usuario, String pasos) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
        this.descripcion = descripcion;
        this.usuario = usuario;
        this.pasos = pasos;
    }
}
