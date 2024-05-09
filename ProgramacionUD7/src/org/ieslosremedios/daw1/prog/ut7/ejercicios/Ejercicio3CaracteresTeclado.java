package org.ieslosremedios.daw1.prog.ut7.ejercicios;

import java.io.IOException;
import java.io.OutputStream;

public class Ejercicio3CaracteresTeclado {
    public static void main(String[] args) throws IOException {
        /**
         *  Pide al usuario tres caracteres por teclado y vamos a imprimirlos concatenados
         *         1. Usando el write
         *         2. Usando el print
         *         3. Usando el println
         */

        // Usando el write
        System.out.println("Introduce tres caracteres jovenzuelo:");
        int primer=System.in.read();
        int segun=System.in.read();
        int tercer=System.in.read();

        System.out.write(primer);
        System.out.write(segun);
        System.out.write(tercer);
        System.out.flush();
        System.out.println();

        // Usando el print
        System.out.print((char)primer+""+(char)segun+(char)tercer);
        System.out.println();

        // Usando println
        System.out.println((char)primer+""+(char)segun+(char)tercer);
    }
}
