package org.ieslosremedios.daw1.prog.ut7.ejemplos;
import java.io.*;
public class EjemploFicheroDeTexto {
    public static void main(String[] args)throws FileNotFoundException,IOException {
        //Creamos un fichero de texto, donde volcaremos información codificada en "lenguaje humano"
        FileWriter fileW=new FileWriter("D:\\Programacion\\prueba.txt",true);
        fileW.write("\nDl");
        fileW.close();

        // FileReader
        FileReader leerFilo=new FileReader("D:\\Programacion\\prueba.txt");
        int caracteres;
        while ((caracteres = leerFilo.read())!=-1){
            System.out.print((char) caracteres);
        }
        leerFilo.close();
        System.out.println();

        // FileInputStream
        FileInputStream fileFlujo = new FileInputStream("D:\\Programacion\\prueba.txt");
        int caracteresFlujo=fileFlujo.read();
        while ((caracteresFlujo!=-1)){
            System.out.print((char) caracteresFlujo);
            caracteresFlujo=fileFlujo.read();
        }
        fileFlujo.close();
        System.out.println();

        // FileOutputStream
        FileOutputStream escribeFlujo = new FileOutputStream("D:\\Programacion\\prueba2.txt");
        String saludos="Hola que tal? Soy el chico de las poesias";
        char[] caract=saludos.toCharArray();
        for (int i = 0; i < caract.length; i++) {
            escribeFlujo.write(caract[i]);
        }
        escribeFlujo.close();
    }
}
