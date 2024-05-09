package org.ieslosremedios.daw1.prog.ut7.apuntes;

public class Apuntes17Abril {
    /**
     * SERIALIZACIÓN
     *
     * Proceso mediaante el cual convertimos objetos en secuencia de bytes para así poder transmitirlos y luego poder
     * volver a transformarlo en un objeto mediante un proceso de deserialización.
     * También se le llama parseo
     *
     * IMPLEMENTACIÓN
     *
     *  - Debe implementar la interfaz Serializable
     *  - Sus atributos deben ser primitivos o que implementen Serializable
     *  - Declarar el atributo estático privado serialVersionUID.
     *
     *  Cuando queramos que un atributo no se incluya en la serializacion se añade "trasient"
     *  Las clases estaticas no se serializaon
     *
     *  Serializar (ObjectOutputStream) --> writeObject
     *  Deserializar ()
     * */
}
