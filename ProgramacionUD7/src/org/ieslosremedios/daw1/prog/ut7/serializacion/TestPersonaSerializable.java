package org.ieslosremedios.daw1.prog.ut7.serializacion;

import java.io.*;

public class TestPersonaSerializable {
    public static void main(String[] args) throws IOException, NotSerializableException, ClassNotFoundException {
        /*
        // Creamos objeto
        Persona ppl = new Persona("El Fary",69,24000L,"20/08/1937",true);

        // Creamos archivo
        FileOutputStream pefo=new FileOutputStream("C:\\Users\\1DAW_2223_04\\Downloads\\personaMisteriosa.bin");
        ObjectOutputStream oos = new ObjectOutputStream(pefo);

        //Creamos serializacion
        oos.writeObject(ppl);
        oos.close();

        // Abrimos el archivo
        FileInputStream pefi = new FileInputStream("C:\\Users\\1DAW_2223_04\\Downloads\\personaMisteriosa.bin");
        ObjectInputStream ois = new ObjectInputStream(pefi);

        // Deserializmos
        Persona ppr = (Persona)ois.readObject();
        System.out.println("Nombre del famoso: "+ppr.getNombre());
        System.out.println("Edad: "+ppr.getEdad());
        System.out.println("Fortuna: "+ppr.getFortuna());
        System.out.println("Fecha de Nacimiento: "+ppr.getFechaNacimiento());
        System.out.println("Es pareja?: "+ppr.isPareja());
        ois.close();

         */
    }
}
