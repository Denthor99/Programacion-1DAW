package org.ieslosremedios.daw1.prog.UT6.apuntes;

public class Apuntes9Marzo {
    /**
     * EXCEPCIONES DE USUARIO
     * Podemos crear nuestras propias excepciones, para poder usarlas en cualquier programa.
     * Crearemos una nueva clase, donde deberemos extender a la clase de excepcion necesaria.
     * Si extendemos de RuntimeException será unchecked, y si lo hace de alguna de Exception será checked
     * public class ExceptionEdadInvalida extends IllegalArgumentsException {
     *     public ExceptionEdadInvalidad (String mensaje){
     *         super(mensaje);
     *     }
     * }
     *
     * BUENAS PRÁCTICAS EN LAS EXCEPCIONES
     * - Evitar bloques catch vacíos
     * - Liberar recursos usando el bloque finally o try-with-resources
     * - Evitar excepciones genericas, ya que no aportan información. Debemos ser lo más preciso posible
     * - Evitar excepciones personalizadas, ya que debemos usar el lenguaje más estandar posible, ya que es
     * más sencillo de interpretar por otros desarrolladores
     * - No abusar de excepciones
     * */
}
