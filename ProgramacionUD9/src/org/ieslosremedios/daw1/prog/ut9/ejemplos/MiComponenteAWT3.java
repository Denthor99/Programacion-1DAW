package org.ieslosremedios.daw1.prog.ut9.ejemplos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MiComponenteAWT3 extends Frame {

    MiComponenteAWT3(){
        setTitle("Mi componente");
        setVisible(true);
        setLayout(null);
        // Tambien podriamos usar el metod size
        setBounds(200,200,400,400);

        Button boton=new Button("Salir");
        boton.setBounds(50,100,72,32);
        add(boton);

        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((Frame)boton.getParent()).dispose();
            }
        });

    }

    public static void main(String[] args) {
        new MiComponenteAWT3();
    }
}
