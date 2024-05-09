package org.ieslosremedios.daw1.prog.ut6.actividad62.ejer2;

public class Actividad622Main {
    public static void main(String[] args) {
    int x=5;
        System.out.print("sumaNaturales("+x+") = ");
        System.out.print(" = "+sumaNumerosNaturales(x));
        System.out.println();
    }
    public static int sumaNumerosNaturales(int x){
        if(x==1){
            System.out.print(x);
            return 1;
        }else
            System.out.print(x+" + ");
            return x+(sumaNumerosNaturales(x-1));
    }
}
