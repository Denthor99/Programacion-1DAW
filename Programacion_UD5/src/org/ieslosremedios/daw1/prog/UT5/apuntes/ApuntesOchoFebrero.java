package org.ieslosremedios.daw1.prog.UT5.apuntes;

public class ApuntesOchoFebrero {
    public static void main(String[] args) {
        /**
         Cada vez modelamos problemas más complejos, es decir, más reales
         Las características de los tad:
         Se especifica mediante una interfaz
         Se definen mediante la implementaciónn de esas interfaces
         Contienen datos y operaciones (POO)

         EJEMPLOS DE USO
         FIFO y LIFO son formas de gestionar la memoria

         INTERFAZ COLLECTION
         Como comentamos el anterior día, la interfaz Collection representa una colección de elementos
         Set--> no tiene orden, no se puede duplicar y acepta nulos
         SortedSet--> si permite ordenacion, no admite duplicados y acpeta nulos
         List--> admite ordenacion, admite duplicados y acepta nulos.
         No tiene constructor, pues es una interfaz

         SET
         Implementa un conjunto de elementos
         Hereda de Collection
         Añade restricciones para que no tenga duplicados
         Según la implementación puede estar o no ordenado
         El funcionamiento de la resctriccion de duplicado no borra ni sobreescribre,
         simplemente no lo tiene en cuenta.

         CLASE HASHSET
         Almacena elementos en una tabla hash (usando HashMap)
         Acceso rápido y aleatorio a los elementos

         ITERADORES
         Utilidad para recorrer colecciones
         Para las colecciones usamos el Foreach
         Java ha implementado un TAD especifico para esta tarea: Iterator
         it.hasNext() se usa como condición en un bucle. Itera si tiene un elemento
         it.next() nos muestra el siguiente elemento.
         La intergaz Iterable provee a todas las colecciones la capacidad de obtener un iterador

         TIPOS PARAMETRIZADOS O GENÉRICOS
         El compilador no acepta que se agregue ningun tipo de dato distinto al especificado
         con lo que evitaremos poner castings y errores en tiempo de ejecución

                Set<String> conjunto = new HashSet<>();

         CLASE LINKEDHASHSET
         Almacena elementos en una tabla hash pero:
         Los elementos se ordenan por orden de inserción

         CLASE TREESET
         Utiliza estructura de árbol binario
         Elementos ordenados de forma ascendente según sus valores
         Es más lenta que HashSet, pero ofrece más funcionalidades
         No admite nulos
         Usaremos la implementación en lugar de interfaz para acceder a los métodos adicionales


        */
    }
}
