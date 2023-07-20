package com.example.apphappydays.Entidad;



public class Huesped {

    private Integer id;

    private String nombre;

    private String apellido;
    private String password;
    private String documento;
    private String correo;

    private String telefono;

    private Boolean estado;




    public Huesped() {
    }

    public Huesped(String password, String correo) {
        this.password = password;
        this.correo = correo;
    }


    public Huesped(String nombre, String apellido, String password, String correo, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.password = password;
        this.correo = correo;
        this.documento = dni;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }



}
