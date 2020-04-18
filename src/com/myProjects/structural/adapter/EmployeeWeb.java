package com.myProjects.structural.adapter;

public class EmployeeWeb {

    public String cc;
    public String nombre;
    public String apellido;
    public String correo;

    public EmployeeWeb(String cc, String nombre, String apellido, String correo) {
        this.cc = cc;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
    }

    public String getCc() {
        return cc;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCorreo() {
        return correo;
    }
}
