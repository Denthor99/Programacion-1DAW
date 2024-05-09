package org.ieslosremedios.daw1.prog.UT5.EjerciciosClase;

import java.util.Objects;

public class Persona implements Comparable{
    private String nombre;
    private Integer edad;

    public Persona() {
    }

    public Persona(String nombre){
        this.nombre=nombre;
    }

    public Persona(String nombre, Integer edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(Integer edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

   @Override
    public String toString(){
        return this.nombre;
    }

    @Override
    public int compareTo(Object otro){
        // Tambien podriamos hacer esto
        Persona otherPersona=(Persona)otro;
        if (this.edad==otherPersona.edad){
            return 0;
        }
        if (this.edad>otherPersona.edad){
            return 1;
        }

        return -1;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        Persona persona = (Persona) o;
        return nombre.equals(persona.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
}
