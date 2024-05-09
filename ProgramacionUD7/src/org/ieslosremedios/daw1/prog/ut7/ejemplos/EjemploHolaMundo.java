package org.ieslosremedios.daw1.prog.ut7.ejemplos;

import java.io.IOException;
import java.util.*;


public class EjemploHolaMundo {
    public static void main(String[] args) throws IOException {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Intrduzca un nombre");
        String nombre= entrada.nextLine();
        System.out.println(nombre);
        /*
        System.out.println("Introduzca aquí su nombre: ");
        int nombre1=System.in.read();
        int nombre2=System.in.read();
        int nombre3=System.in.read();
        int nombre4=System.in.read();

        System.out.write("Hola: ".getBytes());
        System.out.write(nombre1);
        System.out.write(nombre2);
        System.out.write(nombre3);
        System.out.write(nombre4);
        System.out.flush();

        */
        /*
        String outputStream="Hola";
        byte[] byteOutStream=outputStream.getBytes();
        System.out.write(byteOutStream);
        System.out.flush();
        */

        /*System.out.write(72);
        System.out.write(79);
        System.out.write(76);
        System.out.write(65);
        System.out.write("\n"+byteOutStream);
        System.out.flush();

        String nombre="Daniel Alfonso";
        if (args.length < 0) {
            System.out.println("Hola " + nombre);
        } else{
            System.err.println("Error: zisquito tu quien ere identifificate, me zuenas");
        }
         */
    }
}
