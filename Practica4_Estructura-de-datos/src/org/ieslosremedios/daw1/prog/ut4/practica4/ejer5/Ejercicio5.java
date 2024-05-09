package org.ieslosremedios.daw1.prog.ut4.practica4.ejer5;

import java.util.Objects;

public class Ejercicio5 {
    public static void main(String[] args) {
        /**
         * Escribe el código de un programa que dado el contenido de un texto y una determinada palabra, realice
         * búsquedas de la palabra dentro de él. La secuencia de ejecución será: crear un texto, crear una palabra,
         * invocar al método con estos parámetros, buscar número de ocurrencias de la palabra en texto, obtener la
         * salida del método y mostrar por pantalla el número de apariciones de la palabra.
         * */

        String texto="La programación es como construir un rompecabezas gigante. Cada pieza de código es como una pieza del rompecabezas, y cuando se ensamblan correctamente, el resultado final es una hermosa obra de arte funcional. Pero a veces, encontrar la pieza correcta puede ser una tarea difícil y requiere mucha paciencia y perseverancia.";
        String palabra="rompecabezas";
        System.out.println(numOcurrencias(texto,palabra));
    }
    public static int numOcurrencias(String s, String word){
        String[] s2=s.split(" |,|;|\\.|:");
        int count=0;
        for (int i = 0; i < s2.length; i++) {
            if(s2[i].equalsIgnoreCase(word)){
                count++;
            }
        }
        return count;
    }
}
