package org.ieslosremedios.daw1.prog.ut6.actividad62.ejer1;

public class Actividad621Main {
    public static void main(String[] args) {
        int x=5;
        System.out.print("Para "+x+" = "+x+" --> ");
        ejer1(x);
        System.out.println();
    }
    public static void ejer1(int x){
        if(x>1) {
            System.out.print(x+", ");
            ejer1(x - 1);
        }else
            System.out.print(x);
    }
}
