package com.example.apphappydays.Entidad;

public class Estacionamiento {
    Long id;
    String nombre;

    public Estacionamiento(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Estacionamiento() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
