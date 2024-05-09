package org.ieslosremedios.daw1.prog.ut4.practica4.ejer4;

import java.util.regex.Pattern;

public class Ejercicio4 {
    public static void main(String[] args) {
        /**
         * Implementa un programa que reciba un DNI y responda si se trata de un DNI válido. El cálculo de la letra
         * correspondiente a los dígitos se realiza mediante el algoritmo descrito en https://www.interior.gob.es
         * /opencms/ca/servicios-al-ciudadano/tramites-y-gestiones/dni/calculo-del-digito-de-control-del-nif-nie/
         * Utiliza expresiones regulares.
         * */
        //Lo primero que vamos a hacer es definir la estructura del ejercicio, que sería la siguiente
        //1. Crear un String donde almacenaremos el DNI
        String dni="32899601X";

        // Invocamos el metodo que nos dirá si el DNI introducido es valido o no
        validadorDni(dni);
    }

    /**
     * En mi caso he realizado un conjunto de condicionales para poder realizar la operación que se pide.
     * Lo primero que quiero comprobar es el tamaño de caractares. Si se cumple la condición va a la siguiente condicion:
     * "¿Tiene un formato correcto?". Usamos el metodo matches de la clase string para comprobar si tiene la sintaxis correcta, es decir
     * que cuenta con ocho numeros y una letra.
     * Despues realizamos una serie de operaciones que comento directamente en el método
     * */
    public static void validadorDni(String dni){
        if (dni.length()==9){ // Comprobación de longitud
            if (dni.matches("[0-9]{8}[A-Z]")) { //Comprobación usando expresiones regulares
                char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'}; // Array de caracteres, lo usaremos para el calculo de la letra del dni
                int numDNI = Integer.parseInt(dni.substring(0, 8)); // Convertimos los caracteres númericos en un entero
                char letraDNI = dni.charAt(8); // Extraemos el caracter de esa posición
                char letraCalculada = letras[numDNI % 23]; // El resultado de esta operación nos devuelve un número. Este número representa una posición dentro del array de caracteres anterior.

                if (letraDNI == letraCalculada) { // Comparamos si la letra del DNI pasado como parametro coincide con la posición del array. De serlo, sería un DNI 100% válido
                    System.out.println("El DNI " + dni + " es válido.");
                } else {
                    System.out.println("El DNI " + dni + " es inválido.");
                }
            } else {
                System.out.println("El formato del DNI es inválido.");
            }
        }  else {
            System.out.println("Introduce un DNI que contenga 9 caracteres");
        }
    }
}
