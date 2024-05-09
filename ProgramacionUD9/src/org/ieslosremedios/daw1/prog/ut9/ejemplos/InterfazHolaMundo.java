package org.ieslosremedios.daw1.prog.ut9.ejemplos;
import java.awt.*;
public class InterfazHolaMundo {
    public static void main(String[] args) {
        // Creamos un contenedor
        Frame frame=new Frame("Saludos");
        // Definimos el fondo
        frame.setBackground(Color.LIGHT_GRAY);
        // Configuramos un layout
        frame.setLayout(null);
        // Configuramos el tamaño de la ventana
        frame.setSize(350,400);
        // Tenemos que indicar que sea visible
        frame.setVisible(true);
        // Creamos botones
        Button boton = new Button("Salir");
        boton.setBounds(150,75,50,25);
        // Añadimos el botón al frame
        frame.add(boton);
        boton.setVisible(true);
    }
}
