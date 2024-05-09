package org.ieslosremedios.daw1.prog.UT5.EjerciciosClase;

import java.util.TreeMap;

public class EjemploTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer,String>notas=new TreeMap<>();
        notas.put(1,"Suspenso Gravisimo");
        notas.put(7,"Notable bajo");
        notas.put(2,"Suspenso Grave");
        notas.put(3,"Suspenso");
        notas.put(5,"Suficiente");
        notas.put(4,"Insuficiente");
        notas.put(6,"Bien");
        notas.put(10,"Matrícula de Honor");
        notas.put(9,"Sobresaliente");
        notas.put(8,"Notable");

        //Comprobamos que, aunque insertamos valores desordenado, TreeMap lo ordena en el correspondiente
        //orden natural
        System.out.println(notas.values());

        //Obtenemos el primer elemento, sin saber el indice
        System.out.println(notas.get(notas.firstKey()));
        System.out.println(notas.firstEntry().getValue());
        System.out.println(notas.get(notas.lowerKey(7)));
    }
}
