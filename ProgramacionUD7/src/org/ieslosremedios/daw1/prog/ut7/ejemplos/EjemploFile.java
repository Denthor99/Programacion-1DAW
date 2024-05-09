package org.ieslosremedios.daw1.prog.ut7.ejemplos;
import java.io.*;
public class EjemploFile {
    public static void main(String[] args) throws IOException{
        // Creacion de directorio
        File miArchivo = new File("C:\\Users\\1DAW_2223_04\\Documents\\CarpetaPrueba");
        miArchivo.mkdir();

        // Creacion de un fichero
        File archive = new File("C:\\Users\\1DAW_2223_04\\Documents\\CarpetaPrueba\\fichero.txt");
        archive.createNewFile();

        // Eliminacion de un fichero
        archive.delete();

        // Eliminaciín de una carpeta (se debe borrar normalmente el contenido)
        miArchivo.delete();
    }
}
