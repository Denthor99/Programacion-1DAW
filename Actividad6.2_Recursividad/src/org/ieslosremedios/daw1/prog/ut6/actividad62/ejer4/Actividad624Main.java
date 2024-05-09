package org.ieslosremedios.daw1.prog.ut6.actividad62.ejer4;

public class Actividad624Main {
    public static void main(String[] args) {
    int x=6;
    int y=8;
        System.out.println(euclidea(x,y));
    }
    public static int euclidea(int x, int y){
        if (y==0){
            return 0;
        }else
            return euclidea(y,x%y);
    }
}
