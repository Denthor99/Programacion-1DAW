package org.ieslosremedios.daw1.prog.ut4.actividad45;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /**
         * 1. Un método que recibe un array de enteros, un elemento entero y una posición. Devuelve otro array que será
         * una copia del array de entrada pero insertando un nuevo elemento (el indicado en los parámetros) en la
         * posición indicada. Ahora sobrecarga el método para que reciba en lugar de un elemento entero un elemento que
         * sea otro array de enteros. Habrá que insertar los elementos de este array empezando desde la posición.
         * */
        // Declaramos un array de enteros
        int[] arrayA={8,4,3,9};
        System.out.println("1.1. Mostramos el array original");
        System.out.println(Arrays.toString(arrayA));
        System.out.println();
        System.out.println("1.2. Mostramos el array con un nuevo elemento");
        System.out.println(Arrays.toString(insercionArray(arrayA,12,2)));
        System.out.println();

        //Creamos nuevo array
        int[] arrayB={10,11,12,14};
        System.out.println("1.3. Mostramos el nuevo array");
        System.out.println(Arrays.toString(arrayB));
        System.out.println();
        System.out.println("1.4. Mostramos el nuevo array junto al anterior");
        System.out.println(Arrays.toString(insercionArray(arrayA,3,arrayB)));
        System.out.println();

        /**
         * 2. Un método que recibe un array de enteros, un elemento entero y un booleano. Devuevle un nuevo array que
         * será una copia del array de entrada pero eliminado el elemento si existe. Para ello deberá de buscarlo
         * previamente. La eliminación podrá ser lógica o física, esto es, si el boleano es true, se hará el borrado
         * lógico, con lo que se pondrá el valor del elemento en el array a 0, mientras que si el boleano es false, se
         * hará borrado físico, eliminado el elemento del array quedando el array con una posición menos.
         * */
        int[] arrayC={7,8,9,5,6,10,11,12};
        System.out.println();
        System.out.println("2.1. Array antes del ejercicio 2.2");
        System.out.println(Arrays.toString(arrayC));
        System.out.println();
        System.out.println("2.2.1. Impresión del array si el valor del booleano es false");
        System.out.println(Arrays.toString(eliminarElementoArray(arrayC,9,false)));
        System.out.println("2.2.2. Impresión del array si el valor del booleano es true");
        System.out.println(Arrays.toString(eliminarElementoArray(arrayC,9,true)));
        System.out.println();

        /**
         * 3. Un método que reciba un array de enteros como parámetro de entrada y salida, de modo que intercambie todas
         * las posiciones pares por las impares.
         * */
        //Creamos un nuevo array para el ejercicio
        int[] arrayD={10,11,12,13,14,15,16,17,18,19,20};
        System.out.println("3.1. Imprimimos el array que usaremos en el ejercicio");
        System.out.println(Arrays.toString(arrayD));
        System.out.println();
        System.out.println("3.2. Imprimimos el array una vez intercambiadas las posiciones pares a impares");
        System.out.println(Arrays.toString(paresPorImparesArray(arrayD)));


    }
    static int[] insercionArray(int[] original, int elemento, int posicion){
        int[] salida=new int[original.length+1];
        System.arraycopy(original,0,salida,0,posicion);
        salida[posicion]=elemento;
        System.arraycopy(original,posicion,salida,posicion+1,original.length-posicion);
        return salida;
    }
    static int[] insercionArray(int[] original, int posicion, int[]arrayInsertar){
        int[] salida=new int[original.length + arrayInsertar.length];
        for (int i = 0; i < posicion; i++) {
            salida[i] = original[i];
        }
        for (int i = 0; i < arrayInsertar.length; i++ ){
            salida[posicion + i] = arrayInsertar[i];
        }
        for (int i = posicion + arrayInsertar.length; i < salida.length; i++) {
            salida[i] = original[i - arrayInsertar.length];
        }
        return salida;
    }
    static int[] eliminarElementoArray(int[] original,int borrar, boolean borrado){
        if (borrado == true){
            for (int i = 0; i < original.length; i++){
                if (original[i] == borrar){
                    original[i] = 0;

                }
            }
            return original;
        } else if (borrado==false){
            int[]copiaOriginal=new int[original.length-1];
            int posicion=0;
            for (int i = 0; i < original.length; i++) {
                if(original[i]==borrar){
                    posicion=i;
                    break;
                }
            }
            System.arraycopy(original,0,copiaOriginal,0,posicion);
            System.arraycopy(original,posicion+1,copiaOriginal,posicion,(original.length-posicion-1));
            return copiaOriginal;
        }

        return original;
    }
    static int[] paresPorImparesArray(int[] original){
        for (int i = 0; i < original.length; i++) {
            if(i%2==0 && i+1 < original.length){
                int aux=0;
                aux=original[i];
                original[i]=original[i+1];
                original[i+1]=aux;
            }
        }
        return original;
    }

}