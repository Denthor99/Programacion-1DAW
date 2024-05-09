package org.ieslosremedios.daw1.prog.UT5.EjerciciosClase;

import java.util.LinkedHashMap;

public class EjemploLinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<Integer,Character>abecedarioLinked=new LinkedHashMap<>();
        //abecedarioLinked.putAll();
        abecedarioLinked.put(1,'A');
        abecedarioLinked.put(2,'B');
        abecedarioLinked.put(3,'C');
        abecedarioLinked.put(5,'E');
        abecedarioLinked.put(4,'D');
        System.out.println(abecedarioLinked.values());

    }
}
