package org.ieslosremedios.daw1.prog.ut9.ejercicios;

import java.awt.*;
import java.awt.event.*;

public class Ejercicio2 extends Frame {
    Ejercicio2(){
        setTitle("my login window");
        setSize(400,350);
        setVisible(true);
        setLayout(null);

        // Ahora crearemos los distintos componentes label necesarios
        Label nombre=new Label("nombre: ");
        nombre.setBounds(90,100,50,32);
        nombre.setBackground(Color.white);
        nombre.setVisible(true);
        add(nombre);

        Label contrasena=new Label("contraseña: ");
        contrasena.setBounds(80,170,70,32);
        contrasena.setBackground(Color.white);
        contrasena.setVisible(true);
        add(contrasena);

        // Ahora crearemos varios componenetes de tipo TextField
        TextField nombre2=new TextField("");
        nombre2.setBounds(170,105,70,22);
        nombre2.setVisible(true);
        add(nombre2);

        TextField contrasena2=new TextField("");
        contrasena2.setBounds(170,175,70,22);
        contrasena2.setVisible(true);
        add(contrasena2);

        // Terminaremos la creación de este login
        Button acceder=new Button("Acceso");
        acceder.setBounds(90,255,70,22);
        acceder.setVisible(true);
        add(acceder);
        acceder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Frame f=new Frame();
                f.setTitle("Buenas que tal?");
                f.setBounds(100,120,300,200);
                f.setLayout(null);
                f.setVisible(true);
                Label saludo=new Label("Bienvenido a la " +
                        "DeepWeb");
                saludo.setVisible(true);
                saludo.setBounds(80,50,150,85);
                f.add(saludo);
                f.addWindowListener(new WindowListener() {
                    @Override
                    public void windowOpened(WindowEvent e) {

                    }

                    @Override
                    public void windowClosing(WindowEvent e) {
                    f.dispose();
                    }

                    @Override
                    public void windowClosed(WindowEvent e) {

                    }

                    @Override
                    public void windowIconified(WindowEvent e) {

                    }

                    @Override
                    public void windowDeiconified(WindowEvent e) {

                    }

                    @Override
                    public void windowActivated(WindowEvent e) {

                    }

                    @Override
                    public void windowDeactivated(WindowEvent e) {

                    }
                });
            }
        });

        // Creamos el componente dialog, para asociarlo al boton "acceder"



        Button cancel=new Button("Cancelar");
        cancel.setBounds(190,255,70,22);
        cancel.setVisible(true);
        add(cancel);
        cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nombre2.setText(null);
                contrasena2.setText(null);
            }
        });
        // Cerramos ventana
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        Ejercicio2 f=new Ejercicio2();
    }
}
