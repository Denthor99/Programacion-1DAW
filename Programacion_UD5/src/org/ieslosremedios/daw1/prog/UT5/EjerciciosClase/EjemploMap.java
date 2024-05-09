package org.ieslosremedios.daw1.prog.UT5.EjerciciosClase;

import java.util.*;

public class EjemploMap {
    public static void main(String[] args) {
        // Con esto podemos crear un map con varios elementos, si queremos uno exclusivo de enteros
        // deberemos modificarlo
        Map ejemplo=new HashMap<>();
        ejemplo.put(1,"Alvaro");

        // Diccionario para las primeras letras del alfabeto
        Map<Integer,Character> abecedario=new HashMap<>();
        abecedario.put(1,'A');
        abecedario.put(2,'B');
        abecedario.put(3,'C');
        abecedario.put(4,'D');
        abecedario.put(5,'E');

        // Para imprimir el resultado, usaremos el metodo get
        System.out.println(abecedario.get(3));

        // Remplazamos la "D" por una f
        System.out.println("Antes de la modificacion= " +abecedario);
        abecedario.replace(4,'F');
        System.out.println("Despues de la modificación= "+abecedario+'\n');

        // Eliminamos el elemento 4
        System.out.println("Antes de la eliminación: "+abecedario);
        abecedario.remove(4);
        System.out.println("Despues de la eliminación: "+abecedario);

        if(!abecedario.containsValue('A')){
            System.out.println("La letra especificada no se encuentra");
        }else{
            System.out.println("La letra especificada se encuentra");
        }

        // Realizaremos un recorrido del diccionario. Como Map no tiene iterador propio, tendremos que hacer lo siguiente
        Collection<Character> abcCollection=abecedario.values();
        Iterator iter=abcCollection.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }

        iter=abecedario.keySet().iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }

        //Comprobamos si está vacio
        System.out.println(abecedario.isEmpty());

        //Tamaño del mapa
        System.out.println("En el mapa tenemos " + abecedario.size()+" elementos");

        //Añadimos en el conjunto un elemento nuevo que sea clave null y z
        //Solo se puede usar una vez. Si volvemos a usar null sobreescribe
        abecedario.put(null,'Z');
        System.out.println(abecedario.get(null));

    }
}
