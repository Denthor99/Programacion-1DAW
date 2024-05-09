package org.ieslosremedios.daw1.prog.ut3.actividad63;

import java.util.*;
public class Actividad63Main {
    public static void main(String[] args) {

        /**
         * Ejercicio 1
         * Realiza un algoritmo que dado un conjunto de números, encuentre el número más grande.
         * */

        // Como en el enunciado se comenta un conjunto de números, crearemos un conjunto de tipo hashset, por los motivos
        // que comentaré más tarde. Añadimos posteriormente varios elementos.
        Set<Integer> ejer1Conjunto=new HashSet<>();
        ejer1Conjunto.add(14);
        ejer1Conjunto.add(35);
        ejer1Conjunto.add(2);
        ejer1Conjunto.add(1);
        ejer1Conjunto.add(29);
        ejer1Conjunto.add(23);
        ejer1Conjunto.add(8);


        metodoConjunto(ejer1Conjunto);

        // Intento de ejercicio 4
        int[] ejer4={1,2,5,3,4,6,9,7};
        misterioso(ejer4);
    }
    private static void metodoConjunto(Set<Integer> a){
        Integer masGrande=0;
        for (Integer e:
             a) {
            if(e>masGrande){
                masGrande=e;
            }
        }
        System.out.println("El número más grande es "+masGrande);
    }
    private static void misterioso(int[] array){
        for (int i = 0; i < array.length; i++) {
            int indiceMenor=i;
            for (int j = i+1; j < array.length ; j++) {
                if (array[j]< array[indiceMenor]){
                    indiceMenor=j;
                }
            }
            int temp=array[i];
            array[i] = array[indiceMenor];
            array[indiceMenor]=temp;
        }
    }
}