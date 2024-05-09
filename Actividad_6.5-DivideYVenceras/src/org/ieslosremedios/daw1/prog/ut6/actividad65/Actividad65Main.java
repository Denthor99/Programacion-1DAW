package org.ieslosremedios.daw1.prog.ut6.actividad65;

import java.util.Arrays;

public class Actividad65Main {
    public static void main(String[] args) {
        // Crearemos un array de enteros ordenado de, por ejemplo hasta el número 30
        int[] a={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};

        // Creamos e inicializamos una variable de tipo entero, que será el elemento que vamos a buscar dentro del
        // array creado anteriormente
        int parametro=16;

        // Invocación al método creado. El resultado será un entero, por lo que lo introducimos en una variable. El
        // resultado será un entero
        int pos=dyv(a,parametro);

        // Imprimiremos donde se encuentra ese elemento (la posición)
        System.out.println("El elemento "+parametro+" se encuentra en la posición "+pos);

    }
    /**
     * Explicación del metodo dyv (Acronimo de divide y venceras)
     * Como queremos que nos devuelva la posición, declaramos el metodo de forma que nos devuelva un entero.
     * El funcionamiento de este método consiste en ir dividiendo el array hasta que encontremos el elemento deseado, es
     * decir, este método realiza lo que conocemos como "busqueda binaria". Para que el código no quede tan "embarrado",
     * comento aquí paso a paso el funcionamiento:
     * 1. Creamos una variable que almacenará un entero. Este entero será el resultado de dividir el array por la mitad.
     * 2. Se comprueba si el parametro es igual al elemento en la posición pos del array a. Si es así, entonces se devuelve pos como resultado.
     * 3. Si parametro es mayor que el elemento en la posición pos, entonces se realiza una llamada recursiva al método dyv pero pasando una copia
     *  del subarray que se encuentra desde la posición pos + 1 hasta el final del array.
     *  4. Si parametro es menor que el elemento en la posición pos, entonces se realiza una llamada recursiva al método dyv pero pasando una copia
     *  del subarray que se encuentra desde el principio del array hasta la posición pos.
     */
    private static int dyv(int[] a, int parametro){
        int pos=a.length/2; // 1.*
        if(parametro==a[pos]){ // 2.*
            return pos;
        } else if (parametro>a[pos]){ // 3.*
            return pos +1+dyv(Arrays.copyOfRange(a,pos+1,a.length),parametro);
        } else
            return dyv(Arrays.copyOfRange(a,0,pos),parametro); // 4.*
    }
}