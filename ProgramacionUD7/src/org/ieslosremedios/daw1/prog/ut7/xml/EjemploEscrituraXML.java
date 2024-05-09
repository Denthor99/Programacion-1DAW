package org.ieslosremedios.daw1.prog.ut7.xml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

public class EjemploEscrituraXML {
    public static void main(String[] args) throws ParserConfigurationException {
        // Creamos el documento vacio para añadirlo a continuación los nodos
        // En este caso lo hago en una sola linea
        Document document = DocumentBuilderFactory.newDefaultInstance().newDocumentBuilder().newDocument();

        // Creamos el nodo raíz
        Element estudiantes = document.createElement("estudainte");
        estudiantes.appendChild(estudiantes);

        // Creamos un nodo de texto que será el valor del elemento anterior



    }
}
