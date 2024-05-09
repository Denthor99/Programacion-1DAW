package org.ieslosremedios.daw1.prog.UT5.EjerciciosClase;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class EjemploConjuntos {
    public static void main(String[] args) {
        // Tipo de elementos que tendrá un conjunto (un string vacio)
        Set <String> conjunto= new HashSet<>();

        // Comprobamos si está vacío
        System.out.println(conjunto.isEmpty());

        // Añadiremos contenido, y comprobamos ahora otra vez si está vacío
        conjunto.add("El 1");
        System.out.println(conjunto.isEmpty());

        // Imprimimos el contenido
        System.out.println(conjunto);

        // Introduciremos 5 elementos, y uno de ellos repetido. Al ejecutar
        conjunto.add("El 2");
        conjunto.add("El 3");
        conjunto.add("El 4");
        conjunto.add("El 5");
        System.out.println(conjunto);
        conjunto.add("El 4");
        System.out.println(conjunto);

        // Añadimos un elemento null en conjunto
        conjunto.add(null);
        System.out.println(conjunto);

        // Iterator es una clase con una serie de metodos
        String er;
        Iterator<String> it=conjunto.iterator();
        while (it.hasNext()){
            er=it.next();
            System.out.print(er + " ");
        }
        System.out.println("");

        // Eleminar un elemento del cojunto
        conjunto.remove(null);
        System.out.println(conjunto);

        //
        Set <String> conjunto2=new HashSet<>();
        conjunto2.add("El 2");
        conjunto2.add("El 3");
        conjunto.removeAll(conjunto2);
        System.out.println(conjunto);

        // Introducimos un Integer en el conjunto
        //conjunto.add((String)32);
    }
}
