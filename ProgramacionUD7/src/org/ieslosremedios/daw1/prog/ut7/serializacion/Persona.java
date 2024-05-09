package org.ieslosremedios.daw1.prog.ut7.serializacion;

import java.io.Serializable;

public class Persona implements Serializable {

    private static final long serialVersionUID = 1L;
    String nombre;
    int edad;


    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona() {
        this.nombre="";
        this.edad=0;
    }
}