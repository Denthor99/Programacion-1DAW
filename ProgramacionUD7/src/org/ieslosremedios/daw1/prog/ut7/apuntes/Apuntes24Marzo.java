package org.ieslosremedios.daw1.prog.ut7.apuntes;

public class Apuntes24Marzo {
    /**
     * Interfaces de entrada y salida
     * Los programas deben comunicarse con otros programas o bien con el usuario utilizando algún dispositivo
     * Se deberán usar, entonces, dos interfaces para conseguir la comunicación: entrada y salida
     * Las aplicaciones emplean los formularios para que el usuario introduzca información
     * Los formularios son realmente una interfaz de entrada de datos
     *
     * Entrada y salida de información
     * Cualquier programa que desee interactuar o trabajar con datos debe tener la capacidad de leer y/o escribir datos.
     * Ejemplo:
     * Cuando creamos un metodo, deberemos introducir una serie de parametros para realizar operaciones
     * realmente es una simulación de una interfaz de entrada
     * En este caso la salida de la información sería por ejemplo un "sout"
     *
     * Flujo de datos
     * En Java la entrada y salida de datos se lleva a cabo mediante flujos de datos --> Streams
     *
     * Flujo de datos --> Secuencia ordenada de datos que se transmite desde un origen hasta un destino
     *
     * Tipos de flujo de datos
     * Flujo de entrada --> Se lee la información
     * Flujo de salida --> Se escribe la información
     * "" de acceso directo --> se accede directamente al elemento deseado
     * "" de acceso secuencial --> accedemos al elemento deseado debemos pasar por varias
     * "" de caracteres --> datos codificados en caracteres. UNICODE o ASCII
     * "" de bytes --> serián los ficheros binarios, ya que los datos no se han codificado
     *
     * Flujos estándar o predeterminados
     * Mientras se ejecuta un programa, se mantienen abiertos algunos flujos de datos para ser usados sin
     * necesidad de crearlos
     * System.out --> Salida estandar
     * System.err --> Salida estandar de los errores
     *
     * System.out.write(byte)
     *
     * System.out.flush() --> vuelca el flujo de datos
     * */
}