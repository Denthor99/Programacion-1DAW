package org.ieslosremedios.daw1.prog.UT5.apuntes;

public class Apuntes15Febrero {
    /**
     * SortedSet
     * Es recomendable, a la hora de crear una variable, definir la interfaz y la clase
     * EJ: SortedSet x=new TreeSet();
     * Implementada por TreeSEt
     * Implementa Comparable (compareTo para ordenar)
     * Admite comparator
     * No valores nulos
     * Tiene menos métodos que TreeSet
     * Es mejor programar con interfaces que con implementaciones
     *
     * Interfaz List
     * List hereda de collection
     * Collection<---List
     * ArrayList, LinkedList, Stack, Vector
     * List admite ordenacion, duplicados y nulos
     *
     * Clase ArrayList
     * Son arrays dínamicos(tamañó se adapta al contenido)
     * Admite Nulos
     * Acceso aleatorio--> Es la implementación más eficiente para listas
     * en operaciones de lectura
     * Añade algunos métodos a los heredados de collection. Metodos que admiten posiciones
     * Indices empiez por 0
     * Pueden ser multidimensionales
     * eje: List<List<List<>>
     *
     * Interfaz ListIterator
     * Eliminar elementos usando tanto un bucle for o un bucle for-each no funciona corerctamente
     * porque la colección cambia de tamaño al mismo tiempo que el código intenta hacer un bucle.
     * Tendriamos que usar iteradores
     * Las listas tienen ListIterator, que nos permite iterar en ambas direcciones
     *
     *
     * */
}
