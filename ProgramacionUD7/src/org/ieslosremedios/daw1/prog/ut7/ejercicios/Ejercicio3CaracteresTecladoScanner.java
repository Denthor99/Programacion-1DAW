package org.ieslosremedios.daw1.prog.ut7.ejercicios;

import java.util.*;

public class Ejercicio3CaracteresTecladoScanner {
    public static void main(String[] args) {
        Scanner caract=new Scanner(System.in);
        System.out.println("Introduce tres caracteres");
        char text1=caract.next().charAt(0);
        char text2=caract.next().charAt(0);
        char text3=caract.next().charAt(0);
        System.out.println(""+text1+text2+text3);
    }
}
