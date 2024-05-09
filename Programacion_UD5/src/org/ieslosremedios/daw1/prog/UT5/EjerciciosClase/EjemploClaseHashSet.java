package org.ieslosremedios.daw1.prog.UT5.EjerciciosClase;

import java.util.HashSet;
import java.util.Set;

public class EjemploClaseHashSet {
    public static void main(String[] args) {
        HashSet<Integer> numeros=new HashSet<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        System.out.println("HashSet: "+numeros);

        HashSet<Integer> numeros2=new HashSet<>();
        numeros.add(3);
    }
}
