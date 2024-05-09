package org.ieslosremedios.daw1.prog.UT6.ejerciciosClaseRecursividad;

public class Ejercicio2Recursividad {
    public static void main(String[] args) {
        /**
         * Enunciado: Calcula la suma de los primeros n números naturales
         * usando la recursividad
         *
         * */
        System.out.println("La suma de los numeros naturales es igual a "+sumaNumerosNaturales(5));
    }
    private static int sumaNumerosNaturales(int x){
        if(x==1){
            return 1;
        }else
        return x+(sumaNumerosNaturales(x-1));
    }
}
