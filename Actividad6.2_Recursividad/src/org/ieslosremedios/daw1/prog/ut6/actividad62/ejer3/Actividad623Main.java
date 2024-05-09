package org.ieslosremedios.daw1.prog.ut6.actividad62.ejer3;

public class Actividad623Main {
    public static void main(String[] args) {
        int x=7;
        System.out.println(fibonnaci(x));
    }
    public static int fibonnaci (int x){
        if((x==0) || (x==1)){
            return x;
        }else
            return fibonnaci(x-1)+fibonnaci(x-2);
    }
}