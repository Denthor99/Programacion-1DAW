package org.ieslosremedios.daw1.prog.UT5.apuntes;

public class Apuntes22Febrero {
    /**
     * INTERFAZ MAP
     * Es un diccionario,es decir, un tipo de dato que sirve para asociar pares de valores de la forma: clave-valor.
     * Un map en java representa a un diccionario
     * En la clase Map no contamos con el metodo add, porque no hereda de Collection
     * Si queremos añadir un elemento, usaremos el metodo put
     * Estructura metodo put para añadir elemento:
     * public V put (K key, V value)
     * k--> clave
     * v--> valor
     *
     * Lectura
     * public V get
     *
     * Modificar
     * public v replace
     *
     * Eliminar
     * public V remove
     *
     * Clase HashMap
     * Es la más común, debido a su rendimiento
     * No realizar ningún tipo de ordenación
     * Como bien dice el nombre de la clase, emplea una tabla hash
     * Si es nulo, el hashCode será 0
     *
     * Sintaxis:
     * HashMap<Integer, String> mapeado=new HashMap<>;
     * ma.put(1,1);
     *
     * Si queremos recorrer un mapa, no contamos con un iterado directo. Lo que deberemos hacer es usar el metodo Set
     *
     * CLASE LINKEDHASHMAP
     * Implementa Map mediante una combinación de lista enlazada y tabla hash
     * Se mantiene el orden de inserción
     * Sintaxis:
     * LinkedHashMap<K,V> lhm
     *
     * CLASE TREEMAP
     * Respeta el oreden natural de las claves (se debe implementar comparable)
     * No admite null
     * Mas lento que el resto de clases
     * Añade algunos métodos más
     * Implementa SortedMap
     * */
}
