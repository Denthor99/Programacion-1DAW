package org.ieslosremedios.daw1.prog.UT5.EjerciciosClase;

import java.util.*;

public class EjemploArrayList {
    public static void main(String[] args) {
        // Crear ArrayList y añadir elementos
        List<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add(null);
        System.out.println(cars);

        //Acceder a un elemento
        System.out.println(cars.get(2));

        //Cambiar elemento 1 por Renault
        cars.set(1,"Renault");

        //Eliminar "Mazda"
        cars.remove("Mazda");

        //Entre Renault y Ford, añadimos un Opel
        cars.add(2,"Opel");
        System.out.println(cars);

        //Vaciamos la lista, comprobamos que está vacío, y comprobamos
        // que el tamaño es 0
        cars.clear();
        System.out.println(cars.size());
        System.out.println(cars);

        //Creamos un conjunto donde estén Mitsubichi y Toyota
        //y lo añadimos a la lista anterior
        SortedSet<String>coches2=new TreeSet<>();
        coches2.add("Mitsubichi");
        coches2.add("Toyota");
        cars.addAll(coches2);
        System.out.println(cars);

        //ListIterator
        ListIterator it= cars.listIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        //while (it.hasPrevious()){
        //   System.out.println(it.hasPrevious());
        //}

        // Creamos una lista con varios numeros
        List<Integer>nums=new ArrayList<>();
        nums.add(4);
        nums.add(2);
        nums.add(9);
        nums.add(1);
        nums.add(78);
        nums.add(10);
        ListIterator<Integer> itnum=nums.listIterator();

        // Recorrido elementos
        while (itnum.hasNext()){
            Integer i= itnum.next();
            if(i<6){
                itnum.remove();
            }

        }
        System.out.println(nums);

        //Recorremos los elementos de una nueva lista, pero esta vez al reves
        List<Integer>numeros=new ArrayList<>();
        numeros.add(4);
        numeros.add(2);
        numeros.add(9);
        numeros.add(1);
        numeros.add(28);
        numeros.add(15);
        ListIterator<Integer> itnumeros=numeros.listIterator();
        //Añadimos el elemento 10 despues del 9
        while(itnumeros.hasPrevious()){
            Integer r= itnumeros.previous();
            if (r>20){
                itnumeros.remove();
            }
            if (r==2){
                itnumeros.add(10);
            }
        }
        System.out.println(numeros);
    }
}
