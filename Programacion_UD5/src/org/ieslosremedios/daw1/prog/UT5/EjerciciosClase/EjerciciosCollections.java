package org.ieslosremedios.daw1.prog.UT5.EjerciciosClase;

import java.util.*;

public class EjerciciosCollections {
    public static void main(String[] args) {
        // Ejercicio 1: Creamos un par de colecciones que contengan integer
        ArrayList<Integer>arrayInt=new ArrayList<>();
        arrayInt.add(1);
        arrayInt.add(3);
        arrayInt.add(8);
        arrayInt.add(10);
        System.out.println(arrayInt);

        Set<Integer>hashInt=new HashSet<>();
        hashInt.add(5);
        hashInt.add(9);
        hashInt.add(11);
        System.out.println(hashInt);

        // Ejercicio 2:desordenamos las colecciones
        Collections.shuffle(arrayInt);
        System.out.println(arrayInt);

        //Convertimos el conjunto en lista para ordenarlo aleatoriamente
        ArrayList<Integer>listInt=new ArrayList<>(hashInt);
        Collections.shuffle(listInt);
        System.out.println(listInt);

        //Ejercicio 3. Ordena las lista en orden ascendente según el orden natural
        Collections.sort(arrayInt);
        System.out.println(arrayInt);
        Collections.sort(listInt);
        System.out.println(listInt);

        //Ejercicio 4. Da la vuelta a la lista
        Collections.reverse(arrayInt);
        System.out.println(arrayInt);
        Collections.reverse(listInt);
        System.out.println(listInt);

        //Ejercicio 5. Realiza la busqueda de un elemento
        //Debemos ordenar la lista
        Collections.sort(arrayInt);
        Collections.sort(listInt);
        int list1= Collections.binarySearch(arrayInt,1);
        int list2= Collections.binarySearch(listInt,9);
        System.out.println("Posición del elemento: "+list1);
        System.out.println("Posición del elemento: "+list2);

        //Ejercicio 6. Crea un array a partir de una lista
        //Podemos utilzar toArray
        Integer[] array=new Integer[arrayInt.size()];
        array=arrayInt.toArray(array);
        System.out.println(Arrays.toString(array));

        //Crea una lista a partir de un array
        Integer[] a={1,2,3,4,9,5};
        List<Integer>aList=new ArrayList<>();
        aList=Arrays.asList(a);
        System.out.println(aList);







    }
}
