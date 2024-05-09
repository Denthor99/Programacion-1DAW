package org.ieslosremedios.daw1.prog.ut4.practica4.ejer2;

import java.util.Arrays;

public class Ejercicio2 {
    public static void main(String[] args) {
        /**
         * Enunciado: Escribe un programa que sea capaz de contar el número de palabras diferentes que hay en un texto
         * que se le pasa por argumento, sin tener en cuenta si están escritas en mayúsculas o minúsculas.
         * */
        // Creamos un texto para la realización de la actividad
        String texto="Hace 44 años un monje shaolin se enfrentó a las fuerzas de norte del Shao-geon: un grupo de monjes gobernado por el gran monje";

        // Invocación de metodo
        System.out.println(cuentaPalabrasDiferentes(texto));
    }

    /**
     * Con este método comprobaremos el número de palabras que contiene la palabra, y más concretamente, aquellas que no
     * sean repetidas
     * */
    public static int cuentaPalabrasDiferentes(String texto){
        int difWords=0;
        String []text=texto.toLowerCase().split(" |,|;|\\.|:");
        String [] palabrasDiferentes=new String[text.length];

        for (String palabraActual:
             text) {
            if(!palabrasRepetidas(palabrasDiferentes,difWords,palabraActual)){
                palabrasDiferentes[difWords] = palabraActual;
                difWords++;
            }
        }
        return difWords;
    }
    /**
     * Con este metodo iremos comprobando si las palabras ya existen dentro del array. Una vez encontrada, se saldría al encontrar una repetida
     * */
    private static boolean palabrasRepetidas(String[] arrayDeTexto, int pos, String palabra){
        boolean seRepite = false;
        for (int i = 0; i < pos; i++){
            if (arrayDeTexto[i].equals(palabra)){ // Si la palabra es igual, se sale del bucle, por lo que esa palabra no contaría.
                seRepite = true;
                break;
            }
        }
        return seRepite;
    }
}
