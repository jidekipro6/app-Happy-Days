package com.example.apphappydays.Entidad;

public class TipoHabitacion {
    private Integer id;

    private String nombre;

    private Integer nroCamas;

    private Integer precio;

    public TipoHabitacion() {
    }

    public TipoHabitacion(Integer id, String nombre, Integer nroCamas, Integer precio) {
        this.id = id;
        this.nombre = nombre;
        this.nroCamas = nroCamas;
        this.precio = precio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNroCamas() {
        return nroCamas;
    }

    public void setNroCamas(Integer nroCamas) {
        this.nroCamas = nroCamas;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }
}
