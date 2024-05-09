package org.ieslosremedios.daw1.prog.UT3.Ejer1Interfaces;

public class Main {
    public static void main(String[] args) {
        Imprimible print=new Impresora();
        print.imprime();
        Imprimible dere=new Consola();
        dere.imprime();
        Borrable delPrint=new Impresora();
        delPrint.borrar();
        Borrable delConsole=new Consola();
        delConsole.borrar();

    }
}