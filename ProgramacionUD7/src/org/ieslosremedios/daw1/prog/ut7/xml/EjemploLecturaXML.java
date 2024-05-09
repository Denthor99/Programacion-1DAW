package org.ieslosremedios.daw1.prog.ut7.xml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class EjemploLecturaXML {
    public static void main(String[] args) {
        // Cargamos el fichero xml
        File file = new File("org\\ieslosremedios\\daw1\\prog\\ut7\\xml\\ejemplo.xml");
        try{
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document=builder.parse(file);

            // Nodo raíz
            System.out.println(document.getDocumentElement().getNodeName());
            System.out.println(document.getDocumentElement().getNodeType());

            // Accedemos a todos los nodos con el tag "estudiante"
            NodeList estudiantes=document.getElementsByTagName("estudiante");

            for (int i = 0; i < estudiantes.getLength(); i++) {
                Node nodeEstudiante=estudiantes.item(i);
                if (nodeEstudiante.getNodeType()==Node.ELEMENT_NODE){
                    Element elementEstudiante = (Element) nodeEstudiante;
                    System.out.println("Nombre del estudiante: "+ elementEstudiante.getTextContent());
                }
            }

        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (SAXException e) {
            throw new RuntimeException(e);
        }
    }
}
