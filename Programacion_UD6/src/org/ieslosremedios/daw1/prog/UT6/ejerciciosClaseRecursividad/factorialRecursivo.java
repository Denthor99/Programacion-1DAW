package org.ieslosremedios.daw1.prog.UT6.ejerciciosClaseRecursividad;

public class factorialRecursivo {
    public static void main(String[] args) {
        System.out.print("factorial("+6+")=");
        System.out.println(factorial(6));
    }
    public static int factorial(int x){
        if(x<=1){
            return 1;
        }else
        return x*factorial(x-1);
    }
}
