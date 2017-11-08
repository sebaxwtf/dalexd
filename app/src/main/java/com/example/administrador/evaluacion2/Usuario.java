package com.example.administrador.evaluacion2;

import android.widget.EditText;

/**
 * Created by Administrador on 31/10/2017.
 */

public class Usuario {
    private String nombre;
    private String apellido;
    private String correo;
    private String password;
    private int fecha;


    public Usuario(String nombre, String apellido, String correo, String password, int fecha) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.password = password;
        this.fecha = fecha;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Usuario usuario = (Usuario) o;

        return correo.equals(usuario.correo);

    }

    @Override
    public int hashCode() {
        return correo.hashCode();
    }
}
