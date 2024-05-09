package org.ieslosremedios.daw1.prog.ut7.actividad73;

import java.io.Serializable;

public class Persona implements Serializable {
    private static final long serialVersionUID=123L;
    private String nombre;
    private int edad;
    private Persona padre;
    private Direcciones direccion;

    public Persona() {
    }

    public Persona(String nombre, int edad, Direcciones direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }

    public Persona(String nombre, int edad, Persona padre, Direcciones direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.padre = padre;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Persona getPadre() {
        return padre;
    }

    public void setPadre(Persona padre) {
        this.padre = padre;
    }

    public Direcciones getDireccion() {
        return direccion;
    }

    public void setDireccion(Direcciones direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", padre=" + padre +
                ", direccion=" + direccion +
                '}';
    }
}

