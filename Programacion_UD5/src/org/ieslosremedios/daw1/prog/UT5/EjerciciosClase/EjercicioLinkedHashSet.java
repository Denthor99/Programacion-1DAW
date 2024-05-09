package org.ieslosremedios.daw1.prog.UT5.EjerciciosClase;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class EjercicioLinkedHashSet {
    public static void main(String[] args) {
        // Crea un conjunto vacío de cadenas--> Declara usando la interfaz
        LinkedHashSet<String>empty=new LinkedHashSet<>();

        // Agrega los nombres de varios alumnos al conjunto--> Usa los métodos de la interfaz
        empty.add("Jorge");
        empty.add("Antonio Jesus");
        empty.add("Juan Manuel");
        empty.add("Ricardo");
        empty.add("Adrian");

        // Imrpime el conjunto para ver su contenido--> ¿Imprime referencia o valor?
        // Nos imprime el contenido de forma ordenada(de la misma forma como se introdujeron)
        System.out.println(empty);

        //Añade un nombre repetido--> ¿Permite duplicados?
        empty.add("Jorge");
        // No nos permite duplicados
        System.out.println(empty);

        //Añade un null
        empty.add(null);
        // Acepta nulos
        System.out.println(empty);

        // Recorre un conjunto imprimiendo cada uno de sus elementos en orden, del primero
        // que fue insertado al último.
        Iterator<String>it=empty.iterator();
        System.out.print("[");
        while (it.hasNext()){
            System.out.print(it.next()+", ");
        }
        System.out.print("]");
    }
}
