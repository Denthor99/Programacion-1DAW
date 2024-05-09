package org.ieslosremedios.daw1.prog.UT6.ejerciciosClase;

public class EjemploNullPointer {
    public static void main(String[] args) {
        extracted();
    }

    private static void extracted() {
        Integer a=null;
        Integer b=a+2;
        System.out.println(b);
    }
}
