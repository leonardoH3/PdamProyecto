package com.example.proyectopdam.Entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Curso {
    private String nombre;
    private List<Usuario> usuarios;
    private String descripcion;
    private String hora;
    private Date fecha;

    public Curso(String nombre, List<Usuario> usuarios, String descripcion, String hora, Date fecha) {
        this.nombre = nombre;
        if (usuarios!=null) {
            this.usuarios = usuarios;
        }
        else{
            this.usuarios = new ArrayList<Usuario>();
        }
        this.descripcion = descripcion;
        this.hora = hora;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

}
