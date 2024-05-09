package org.ieslosremedios.daw1.prog.UT6.ejerciciosClase;

public class Persona {
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws IllegalArgumentException{
        if(edad<0){
            throw new IllegalArgumentException("No existe edad negativa");
        }
        this.edad = edad;
    }

    private int edad;
}
