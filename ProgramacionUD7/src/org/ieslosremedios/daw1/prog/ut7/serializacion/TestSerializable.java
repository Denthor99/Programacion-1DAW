package org.ieslosremedios.daw1.prog.ut7.serializacion;

import java.io.*;

public class TestSerializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Creamos un objeto que serializaremos
        ObjetoSerializable os1 = new ObjetoSerializable(5,5,0);

        //Creamos un fichero
        FileOutputStream fos = new FileOutputStream("C:\\Users\\1DAW_2223_04\\Downloads\\objeto.bin");
        ObjectOutputStream obs = new ObjectOutputStream(fos);

        //Creamos serializacion
        obs.writeObject(os1);

        // Cerramso el flujo para que se escriba el fichero
        obs.close();

        // Leemos el fichero
        FileInputStream fis = new FileInputStream("C:\\Users\\1DAW_2223_04\\Downloads\\objeto.bin");
        ObjectInputStream ous = new ObjectInputStream(fis);

        // Deserializamos el contenido del fichero
        ObjetoSerializable ogt=(ObjetoSerializable)ous.readObject();

        System.out.println("Atributo 1: "+ogt.atributo1);
        System.out.println("Atributo 2: "+ogt.atributo2);
        System.out.println("Atributo 3: "+ogt.atributo3);
        ous.close();
    }
}
