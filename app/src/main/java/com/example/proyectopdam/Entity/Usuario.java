package com.example.proyectopdam.Entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 2107262 on 10/25/2018.
 */

public class Usuario {

    private String nombre;
    private String username;
    private String correo;
    private int id;
    private List<Receta> recetas;
    private List<Curso> cursos;

    public Usuario() {
    }

    public Usuario(String nombre, String username, String correo, List<Receta> recetas,int id) {
        this.nombre = nombre;
        this.username = username;
        this.correo = correo;
        this.recetas=new ArrayList<>();
        this.setId(id);
    }

    public Usuario(String nombre, String username, String correo,int id) {
        this.nombre = nombre;
        this.username = username;
        this.correo = correo;
        this.setId(id);
    }

    public Usuario(String nombre, String username, String correo, List<Receta> recetas, List<Curso> cursos,int id) {
        this.nombre = nombre;
        this.username = username;
        this.correo = correo;
        this.setRecetas(recetas);
        this.setCursos(cursos);
        this.setId(id);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre=nombre;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username=username;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public List<Receta> getRecetas() {
        return recetas;
    }

    public void setRecetas(List<Receta> recetas) {
        this.recetas = recetas;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
