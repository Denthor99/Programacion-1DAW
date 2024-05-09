package org.ieslosremedios.daw1.prog.ut9.ejercicios;

import java.awt.*;

public class LoginFrame extends Frame {
    public LoginFrame() {
        // Creamos el Frame
        setTitle("Creedenciales de Acceso");
        // Crearemos un fondo, para que no queda tan soso
        setBackground(Color.decode("#A9CCE3"));
        // Hacemos que sea visible
        setLayout(null);
        setVisible(true);

        // Indicamos el tamaño
        setSize(350,450);

        // Creamos las etiquetas
        Label lab1=new Label("Nombre de usuario:");
        Label lab2=new Label("Password:");


        // Creamos un "textfield"
        TextField text1=new TextField("Escribe aquí....");
        TextField text2=new TextField("Escribe aqui....");

        // Creamos los botones
        Button cancel=new Button("Cancelar");
        Button acceso=new Button("Acceder");

        // Añadimos label 1 y textField 1
        add(lab1);
        lab1.setBounds(115,120,115,25);
        lab1.setBackground(Color.white);
        lab1.setVisible(true);
        add(text1);
        text1.setBounds(110,160,125,23);
        text1.setVisible(true);

        // Añadimos label2 y textField2
        add(lab2);
        lab2.setBackground(Color.WHITE);
        lab2.setBounds(115,240,115,25);
        lab1.setVisible(true);
        add(text2);
        text2.setBounds(110,280,125,23);

        // Añadimos botones
        add(cancel);
        cancel.setVisible(true);
        cancel.setBackground(Color.LIGHT_GRAY);
        cancel.setBounds(40,365,125,35);
        add(acceso);
        acceso.setVisible(true);
        acceso.setBackground(Color.LIGHT_GRAY);
        acceso.setBounds(180,365,125,35);
    }

    public static void main(String[] args) {
        LoginFrame ejemplo1=new LoginFrame();
    }
}
