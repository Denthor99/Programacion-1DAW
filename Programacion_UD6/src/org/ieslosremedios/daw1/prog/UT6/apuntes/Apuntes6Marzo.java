package org.ieslosremedios.daw1.prog.UT6.apuntes;

public class Apuntes6Marzo {
    /**
     * Excepciones
     * Evento producido durante la ejecución de un programa que altera el flujo normal de ejecución.
     * Flujo normal: programa funcionando correctamente
     * Flujo alternativo de la excepción: salta una excepción
     *
     * JERARQUÍA DE EXCEPCIONES
     * Todas heredan de Java.lang.Object
     * Todas heredan de Throwable
     * Se dividen en dos ramas principales:
     * Errores de entorno (JVM)
     * Errores que no tienen que ver con nuestro código, son errores de Java
     * Error hereda de las dos anteriores
     * VirtualMachineError
     * OutOfMemoryError
     * StackOverflowError
     *
     *  Exception: errores en nuestro código. Se dividen en dos
     *  No verificadas: errores humanos (de código) Ej: NullPointerException
     *  Verificadas: código sin errores
     *
     *  Clasificación de Excepciones
     *  - Checked: dependen del uso del programa. Puede continuar, pero debemos de especificarle el nuevo flujo que debe
     *  tomar
     *      -
     *
     * Miembros de una excepción
     * Métodos Constructores
     * crear una excepción con un mensaje, con la causa o vacía
     * -toString, getClass: , getMessage: devuelve el mensaje, printStackTrace: imprime traza de error
     *
     * Captura de excepciones
     * El código susceptible a errores lo introducimos dentro de un try
     * Añadimos los tipos de excepciones con catch
     * Con finally introducimos el código que siempre se ejecutará. Usado para liberar recursos.
     * Ej: trabajamos en una base de datos
     *
     * Manejo de excepciones: propagacion
     * metodo creado + throws <nombre_excepcion>
     * Toda excepcion checked tiene que ser capturada o propagada
     *
     * ¿capturar o propagar?
     * Si no vamos ha realizar nada con la excepcion, mejor propagar
     * Nunca se debe ocultar una excepcion (malas prácticas)
     *
     * Lanzamiento de excepciones
     * Podemos lanzar de forma manual (explicita) una excepción usando el keyword throw, y a continuación creamos un
     * objeto de la excepción
     * Puede ser relanzada despues de ser capturada
     * */
}