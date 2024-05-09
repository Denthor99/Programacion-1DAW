package org.ieslosremedios.daw1.prog.UT6.ejerciciosClaseRecursividad;

public class factorialIterativo {
    public static void main(String[] args) {
        factorial(5);
    }
    private static void factorial(int x){
        System.out.print("factorial("+x+")=");
        int resultado=1;
        while (x > 1) {
                System.out.print(x + "*");
                resultado *= x;
                x -= 1;
        }
        System.out.print(x);
        System.out.print("="+resultado);
    }
}
