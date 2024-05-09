package org.ieslosremedios.daw1.prog.ut7.ejercicios;
import java.util.*;
public class EjercicioFormularioScanner {
    public static void main(String[] args) {
        Scanner datos=new Scanner(System.in);
        System.out.println("Formulario para la beca 2k23");
        System.out.println("Introduce un nombre: ");
        String nombre=datos.nextLine();
        System.out.println("Introduce tu edad: ");
        int edad=datos.nextInt();
        System.out.println("Introduce tu genero");
        char genero=datos.next().charAt(0);
        System.out.println();
        System.out.println("Introduce un numero de telefono: ");
        Long tlfno=datos.nextLong();
        System.out.println();
        System.out.println("------------------------------------");
        System.out.println();
        System.out.println("|    Nombre completo: "+nombre);
        System.out.println("|    Genero: "+genero);
        System.out.println("|    Edad: "+edad);
        System.out.println("|    Número de telefono: "+tlfno);
        System.out.println("|");
        System.out.println("-----------------------------------");
    }
}
