package org.ieslosremedios.daw1.prog.UT6.ejerciciosClase;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EjemploPropagacionExcepciones {
    public static void main(String[] args) {
        System.out.println("Lectura del fichero");
        try {
            FileReader fileReader = new FileReader("hola.txt");
            System.out.println(fileReader.read());
        } catch (FileNotFoundException pe){
            pe.printStackTrace();
        }catch (IOException fer){
            System.out.println(fer.getMessage());
            fer.printStackTrace();
        }finally {
            System.out.println("Fin lectura");
        }
    }
}
