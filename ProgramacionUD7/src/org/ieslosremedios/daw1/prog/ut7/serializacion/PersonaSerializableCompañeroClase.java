package org.ieslosremedios.daw1.prog.ut7.serializacion;

import java.io.*;

public class PersonaSerializableCompañeroClase {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Abrimos el archivo
        FileInputStream pefi = new FileInputStream("C:\\Users\\1DAW_2223_04\\Downloads\\PersonaFamosa.bin");
        ObjectInputStream ois = new ObjectInputStream(pefi);

        //
        Persona plr = (Persona) ois.readObject();
        System.out.println("Nombre: " + plr.nombre);
        System.out.println("Edad: "+plr.edad);
        ois.close();
    }
}
