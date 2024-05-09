package org.ieslosremedios.daw1.prog.UT6.apuntes;

public class Apuntes15Marzo {
    /**
     * INCONVENIENTES RECURSIVIDAD
     * - Consume más recursos (CPU y memoria), ya que cada llamada a una función supone
     * crear un nuevo contexto
     *
     * CONVENIENTES RECURSIVIDAD
     * - Más intuitivo
     * - Más elegante, ya que requiere menos lineas de código y resulta más legible
     *
     * COMPLEJIDAD ALGORITMICA
     * Medir el rendimiento de los algoritmos
     *
     * Sirve para valorar que solución es más apropiada en términos de eficiencia
     * los parametros que debemos comprobar son el tiempo (CPU) y el espacio (memoria)
     *
     * Usaremos la notación Big-O para ello
     *
     * Órdenes de complejidad
     * O(1): tambien llamada Constante, tarda lo mismo independiente del tamaño de entrada
     * O(log n): logaritmica, el tiempo aumenta a un ritmo menor que los datos de entrada (busqueda binaria y
     * algoritmo de euclides)
     * O(n): linear, es proporcional a los datos de entrada (for, while, busqueda lineal)
     *
     * Reglas de cálculo
     * Habrá que ir sumando todas las órdenes o pasos que realizaría el algoritmo:
     * - Sentencias: aritméticas, asignaciones, lógicas, acceso a un array, comparación, etc --> Constante
     * - Selectivas: sumamos las operaciones de la condición y la mayor de las alternativas: if-else -->
     * - Iterativas: se multiplican el número de operaciones dentro del bucle por el número de iteraciones: for-while
     * - Recursivas: caso base + caso recursivo
     * Cuando usamos operaciones como dividir y multiplicar, los recursos necesarios aumentan exponencialmente
     *
     * Ejemplos:
     * for (int i=0; i<K; i++){
     *     algo_de_O(1);
     * }
     *
     * O(k) --> Constante
     * K es la representación de un número conocido
     *
     * for (int i=0; i<N; i++)
     *  for (int j=0; j<N; j++)
     *      algo_de_0(1);
     *
     * Sería n*n=n^2. Esto quiere decir que es complejidad polinomica cuadratica
     *
     * Nota: Anidar más de 3 cosas sería una mala práctica, tanto por complejidad del código como rendimiente
     *
     * for (int i=0; i<N; i++)
     *       for (int j=0; j<i; j++)
     *          algo_de_0(1);
     *
     * Sería 1+2+3+.....N = N*(1+n)/2 --> 0(n^2)
     *
     * APUNTES EJERCICIO 6.2
     *
     *
     * */
}
