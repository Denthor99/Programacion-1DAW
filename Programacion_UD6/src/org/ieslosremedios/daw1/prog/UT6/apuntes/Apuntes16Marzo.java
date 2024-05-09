package org.ieslosremedios.daw1.prog.UT6.apuntes;

public class Apuntes16Marzo {
    /**
     * ALGORITMIA AVANZADA
     * - Algoritmos voraces
     * - Divide y Vencerás
     * - Programación dinamica
     * - Backtracking
     * - Ramificación y Acotación
     * Son algoritmos ampliamente estudiados
     *
     * ALGORITMO VORAZ
     * Busca la mejor solución a un problema
     * Esta solución se construye por etapas, que son ordenes de complejidad bajos (n^2)
     * En cada etapa se decide la solución optima en ese momento, no en general
     * Puede ser que el problema tenga solución pero el algoritmo voraz no la encuentre
     *
     * En la programación existen los patrones de diseño/design patterns, que se llevan implementando desde los 60`s
     * y siguen vigentes día de hoy.
     * - Patrón estrategia: define un esquema general que nos permite definir una familia de
     * algoritmos comunes.
     *
     * Especificación (que se define): interfaces, clases abstractas
     * Implementación (como se define): clases
     *
     * // Ejercicio del cambio de moneda
     *
     *         Imaginemos que vamos comprar a una tienda con un billete de 50€
     *
     *
     *           Ejemplo 1
     *           m={50,20,10,5,1};
     *           cambio=38 euros
     *           candidato:
     *           38-50= negativo
     *           38-20= 18 (candidato)
     *           18-20= negativo
     *           18-10= 8 (candidato)
     *           8-5=3 (candidato)
     *           3-1-1-1=0 (candidato y cambio resuelto)
     *
     *           Numero de billetes/monedas Candidatos={0,1,1,1,3};
     *
     *           Ejemplo 2
     *            m={10,8,7,3};
     *            cambio= 15
     *            ETAPA 1= 15-10= 5 Candidato
     *            ETAPA 2= 5-8= NEGATIVO
     *            ETAPA 3= 5-7 negativo
     *            ETAPA 4= 5-3 Candidato
     *            Se quedan dos euros en el aire, por lo que la mejor opción sería:
     *            ETAPA 1 = NO SE USA EL 10
     *            ETAPA 2 = 15-8= 7
     *            ETAPA 3 = 7-7= 0
     *
     *
     * ALGORITMO VORAZ - ESQUEMA GENERAL
     *
     * */
}
