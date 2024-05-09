package org.ieslosremedios.daw1.prog.ut7.actividad74;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class ImportacionOtrosXML {
    public static void main(String[] args) {
        try {
            // Ruta del archivo XML original
            String rutaArchivoOriginal = "C:\\Users\\usuario\\Desktop\\Repaso XML\\contactos.xml";

            // Ruta del archivo XML de tu amigo
            String rutaOtroXML = "C:\\Users\\usuario\\Desktop\\contactos\\contactosDePablo.xml";

            // Crear un DocumentBuilder para parsear el archivo XML original
            DocumentBuilder originalBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document originalDocument = originalBuilder.parse(new File(rutaArchivoOriginal));

            // Crear un DocumentBuilder para parsear el archivo XML de tu amigo
            DocumentBuilder amigoBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document amigoDocument = amigoBuilder.parse(new File(rutaOtroXML));

            // Obtener el elemento raíz del documento XML original
            Element listaContactos = originalDocument.getDocumentElement();

            // Obtener la lista de nodos "contacto" del documento XML de tu amigo
            Element amigoRootElement = amigoDocument.getDocumentElement();
            NodeList contactoNodes = amigoRootElement.getElementsByTagName("contacto");

            // Iterar sobre los nodos "contacto" y agregarlos al documento original
            for (int i = 0; i < contactoNodes.getLength(); i++) {
                Node contactoNode = contactoNodes.item(i);
                Node importedContacto = originalDocument.importNode(contactoNode, true);
                listaContactos.appendChild(importedContacto);
            }

            // Clases necesarias para la transformación del fichero
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(originalDocument);
            StreamResult result = new StreamResult(new File("C:\\Users\\usuario\\Desktop\\contactos\\contactos.xml"));

            // Se realiza la transformación de document a fichero
            transformer.transform(source, result);

            System.out.println("Contactos importados exitosamente.");
        } catch (ParserConfigurationException | TransformerConfigurationException e) {
            throw new RuntimeException(e);
        } catch (TransformerException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
