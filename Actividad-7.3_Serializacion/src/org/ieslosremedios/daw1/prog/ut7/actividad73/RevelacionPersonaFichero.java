package org.ieslosremedios.daw1.prog.ut7.actividad73;
import java.io.*;
public class RevelacionPersonaFichero {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Vamos a deserializar a esta persona "misteriosa"
        FileInputStream foout=new FileInputStream("C:\\Users\\1DAW_2223_04\\Desktop\\People\\persona1.bin");
        ObjectInputStream objout=new ObjectInputStream(foout);

        Persona prub=(Persona) objout.readObject();
        System.out.println("\tPERSONA MISTERIOSA");
        System.out.println("Nombre: " + prub.getNombre());
        System.out.println("Edad: " + prub.getEdad());
        System.out.println("Padre: " + prub.getPadre());
        System.out.println("Dirección: " + prub.getDireccion());
        objout.close();
    }
}
