package org.ieslosremedios.daw1.prog.UT5.apuntes;

public class ApuntesSeisFebrero {
    public static void main(String[] args) {
        /**
         * UNIDAD 5: Tipo abstracto de datos (TAD)
         * int x=1; (valor)
         * Integer x=1 (referencia, puesto que es un envoltorio)
         * int[]a={1,2,3,.....};
         * object[] b=new Object[23];

         * Tipo de dato abstracto
         * Pila (Stack)--> Parecido a un array, cuyos datos se encuentra apilados usando el metod LIFO (LAST IN FIRST OUT)
         * Como ya sabemos, una clase no es más que un tipo de dato.
         * Java define sus tipos abstractos de datos.

         * Interfaz Collection
         * Una colección es un conjunto de elementos donde iremos colocando objetos sin un tamaño determinado, es decir
         * irá creciendo según el contenido que le introduzcamos.
         * Debemos entender que cada colección tiene un funcionamiento distinto, según nuestras necesidades. Las más usadas son:
         * - Listas
         * - Conjuntos
         * - Colas
         *
         * METODO ADD
         * introduce un elemento en esa colección
         * Se implementa dependiendo de la interfaz que estamos implementando
         *
         * METODO ADDALL
         * Añadimos todos los elementos de una colección a esta colección
         *
         * METODO CLEAR
         * Eliminamos todos los elementos de esta colección
         *
         * METODO CONTAINS
         * Devuelve un valor booleano si una coleccion contiene un elemento
         *
         * METODO EQUALS
         * Comparamos colecciones (Ej: )
         *
         * METODO ISEMPTY
         * Comprueba si una coleccion tiene contenido
         *
         * METODO REMOVE
         * Elimina un elemento especificado
         *
         * METODO SIZE
         * Elementos de una coleccion
         *
         * METODO toArray
         * Convierte una coleccion en un array (pasamos a un objeto estatico)
         *---------------------------------------------------------------------------------------
         * Un conjunto no permite datos duplicados. Si por ejemplo, en una colección tenemos tres elementos
         * (P1,P3,P4) y queriamos añadir P2, nos dejaría. Pero si ya existe, no nos deja, puesto que no permite duplicacion
         * El codigo hash es una funcion que nos devuelve un codigo hexadecimal, facil de convertir pero extremadamente dificil
         * para volver a convertirla
         *
         * SET
         * Representa un conjunto sin elementos repetidos
         * Una de sus implementaciones es HashSet.
         * HashSet tiene acceso directo a los arrays
         *
         * Para las colecciones, usaremos el foreach, pues no tenemos un indice
         */



    }
}