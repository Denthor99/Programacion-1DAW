package org.ieslosremedios.daw1.prog.ut7.ejercicios;

import java.util.*;
public class Ejercicio2Scanner {
    public static void main(String[] args) {
        /**
         * Permitir al usuario introducir un número indeterminado de caracteres.
         *
         * Primero habrá que imprimri las instrucciones para el usuario: "Introduzca varios caracteres"
         *
         * Luego habrá que añadir qué condición debe introducir el usuario para indicar que ya ha terminado de
         * introducir caracteres, con lo que quedaría algo asi: "Introduzca varios caracteres y después pulse intro para
         * finalizar.
         *
         * Lo último que haremos es un hola mundo donde se pida el nombre al usuario
         *
         * */

        Scanner captura = new Scanner(System.in);
        System.out.println("Introduzca varios caracteres");
        /*/int a=0;
        while(!caracteres.equals('\n')){
            caracteres=captura.next().charAt(i);
        }
         */
        System.out.println("Introduzca su nombre");
        String nombre = captura.nextLine();
        System.out.println("Hola "+ nombre);
    }
}
