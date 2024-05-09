package org.ieslosremedios.daw1.prog.UT6.ejerciciosClase;

import java.util.LinkedList;
import java.util.List;

public class EjercicioExcepcionNoValoresRepetidos {
    public static void main(String[] args) {
        // Metodo que meta un numero en una lista y si ya existe un valor lanza una excepcion
        // Metodo main + metodo con un throw

        //Creamos la lista
        List<Integer> listaInt = new LinkedList<>();

        //Invocación al metodo (lanzamiento. Añadimos varios valores)
        listaRepetido(listaInt, 12);
        listaRepetido(listaInt, 9);
        listaRepetido(listaInt, 5);

        //Propagación
        System.out.println("Introdución de elementos nuevos y comprobación de duplicados");
        try {
            System.out.println("Añadimos valores:");
            listaRepetido(listaInt, 5);
        } catch (ExcepcionNoValoresRepetidos ilex) {
            ilex.printStackTrace();
            System.out.println(ilex.getMessage());
        } finally {
            System.out.println("Finalización de proceso");
        }
    }
    private static void listaRepetido(List<Integer>a,Integer b){
        if (a.contains(b)){
            throw new ExcepcionNoValoresRepetidos("No se puede añadir un valor duplicado");
        } else {
            a.add(b);
            System.out.println("Se ha añadido el valor "+b+ " correctamente en a lista");
        }
    }
}
