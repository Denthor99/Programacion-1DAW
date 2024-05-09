package org.ieslosremedios.daw1.prog.UT5.EjerciciosClase;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class EjemploLinkedList {
    public static void main(String[] args) {
        //Constructor vacio de un LinkedList
        //List<Integer> linkedlist=new LinkedList<>();
        List<Integer>numeros=new LinkedList<>();
        numeros.add(4);
        numeros.add(9);
        numeros.add(1);
        numeros.add(28);
        numeros.add(15);
        System.out.println("ArrayList: "+numeros);

        List<Integer> Linkedlist=new LinkedList<>(numeros);
        Linkedlist.add(7);
        Linkedlist.add(2);
        Linkedlist.add(10);
        System.out.println("LinkedList: "+Linkedlist);

        //Imprimimos la lista en orden inverso
        //Para ello, deberemos indicar a la hora de declarar el operador, el indice
        //de la lista. Usamos Size(), para sacar la longitud de la lista
        //Entre el 23 y 15, metemos un 11
        ListIterator<Integer> listit= Linkedlist.listIterator(Linkedlist.size());
        Integer rp;
        System.out.print("[");
        while (listit.hasPrevious()){
            rp= listit.previous();
            if(rp.equals(15)) {
                listit.remove();
            }
            if(rp.equals(7)){
                listit.add(11);
            }
            if(!listit.hasPrevious()){
                System.out.print(rp);
            }else{
                System.out.print(rp+", ");
            }
        }
        System.out.print("]");
        System.out.println("");

        //Imprime el tercer elemento de la lista
        System.out.println(Linkedlist.get(2));

        //Modificamos el 4º elemento para que valga 22
        Linkedlist.set(4,22);
        System.out.println(Linkedlist);

        //Comprobamos si el 22 se encuentra dentro de la lista
        System.out.println(Linkedlist.contains(22));

        //¿En que posición se encuentra el elemento 22?
        System.out.println(Linkedlist.indexOf(22));

        //Eleminamos el elemento 22. Hay que realizar casting para poder realizar
        Linkedlist.remove((Integer) 22);
        System.out.println(Linkedlist);

        //Añadir un elemento al inicio de la lista
        Linkedlist.add(0,31);
        System.out.println(Linkedlist);


    }
}
