package org.ieslosremedios.daw1.prog.UT5.EjerciciosClase;

import java.util.Iterator;
import java.util.TreeSet;

public class EjercicioTreeSet {
    public static void main(String[] args) {
        //Crea un conjunto implementado por un árbol binario
        TreeSet<Integer> arbolBi=new TreeSet<>();

        //Añade tres números enteros en orden aleatorio
        arbolBi.add(5);
        arbolBi.add(1);
        arbolBi.add(14);

        //Recorrelo e imprime su contenido ordenado de menor a mayor
        Iterator<Integer>it=arbolBi.iterator();
        System.out.print("[");
        while (it.hasNext()){
            System.out.print(it.next()+", ");
        }
        System.out.print("]");

        // Haz lo mismo utilizando nombre de alumnos
        TreeSet<String>arbolString=new TreeSet<>();
        arbolString.add("Paco");
        arbolString.add("Matias");
        arbolString.add("Pedro");
        arbolString.add("Adrian");

        Iterator<String> iter=arbolString.iterator();
        System.out.println("");
        System.out.print("[");
        while (iter.hasNext()){
            System.out.print(iter.next()+", ");
        }
        System.out.print("]");
        System.out.println("");

        // Haz lo mismo con objetos de la clase persona
        TreeSet<Persona>arbolPersona=new TreeSet<>();
        Persona dani=new Persona("Dani",20);
        Persona roberto=new Persona("Roberto",12);
        Persona jorge=new Persona("Jorge",23);
        Persona fran=new Persona("Fran",40);
        arbolPersona.add(dani);
        arbolPersona.add(roberto);
        arbolPersona.add(jorge);
        arbolPersona.add(fran);
        for (Persona e:
             arbolPersona) {
            System.out.println(e);
        }
        System.out.println("");
        Iterator<Persona> personas= arbolPersona.iterator();
        while (personas.hasNext()){
            System.out.println(personas.next());
        }


    }
}
