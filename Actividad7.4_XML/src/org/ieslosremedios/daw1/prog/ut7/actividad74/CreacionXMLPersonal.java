package org.ieslosremedios.daw1.prog.ut7.actividad74;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class CreacionXMLPersonal {
    public static void main(String[] args) {
        try {
            Document document = DocumentBuilderFactory.newDefaultInstance().newDocumentBuilder().newDocument();

            // Creación del nodo raíz
            Element listaContactos = document.createElement("contactos");
            document.appendChild(listaContactos);

            // Creamos el primer nodo contacto
            Element primerContacto = document.createElement("contacto");
            listaContactos.appendChild(primerContacto);

            // Creamos el primer nodo nombre
            Element primerNombre = document.createElement("nombre");
            primerContacto.appendChild(primerNombre);

            // Creamos el primer nodo de texto
            Text nombre = document.createTextNode("Daniel Alfonso Rodriguez Santos");
            primerNombre.appendChild(nombre);

            // Creamos el nodo de dirección
            Element primeraDireccion = document.createElement("direccion");
            primerContacto.appendChild(primeraDireccion);

            // Creamos el nodo texto de dirección
            Text direccion = document.createTextNode("Calle Pedro Lopez Nº27, Arcos de la Frontera, Cádiz");
            primeraDireccion.appendChild(direccion);

            // Creamos el nodo de teléfono
            Element telefono = document.createElement("telefono");
            primerContacto.appendChild(telefono);

            // Creamos el segundo nodo de texto
            Text tlfno = document.createTextNode("697667252");
            telefono.appendChild(tlfno);

            // Clases necesarias para la transformación del fichero
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(document);
            StreamResult result = new StreamResult(new File("C:\\Users\\usuario\\Desktop\\Repaso XML\\contactos.xml"));

            // Se realiza la transformación de document a fichero
            transformer.transform(source, result);

            System.out.println("Archivo XML creado exitosamente.");
        } catch (ParserConfigurationException | TransformerConfigurationException e) {
            throw new RuntimeException(e);
        } catch (TransformerException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Hello world!");
    }
}
