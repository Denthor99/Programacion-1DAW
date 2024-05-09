package org.ieslosremedios.daw1.prog.ut7.actividad73;
import java.io.*;
public class Actividad73Main {
    public static void main(String[] args) throws IOException {
        /**
         * Enunciado de la actividad 7.3 - Serialización
         * Vamos a ir ampliando la clase Persona de unidades previas. Le añadimos un campo tipo Persona llamado padre y otro campo tipo Direccion de nombre dirección, siendo Direccion un tipo creado por ti (puedes usar el que ya tenías en unidades previas).
         * Crea un código donde se serialize un objeto de la clase Persona y se escriba en un fichero. Esta persona deberá tener el nombre de algún personaje famoso.
         * Pasa el fichero a tu compañero para que intente deserializarlo y desvelar de qué personaje se trata.
         * */

        // Creamos el objeto de tipo persona, direcciones, etc.
        Direcciones charlie=new Direcciones("Avenue St Road",133,7559,"Los Angeles","California");
        Persona padre = new Persona("Martin Sheen",82,charlie);
        Persona hijo = new Persona("Charlie Sheen",57,padre,charlie);

        // Serializaremos el objeto Persona. El archivo se almacenará en una carpeta en el escritoria llamada "people".
        FileOutputStream fiout = new FileOutputStream("C:\\Users\\1DAW_2223_04\\Desktop\\People\\persona1.bin");
        ObjectOutputStream oout = new ObjectOutputStream(fiout);
        oout.writeObject(hijo);
        oout.close();
        fiout.close();
    }
}