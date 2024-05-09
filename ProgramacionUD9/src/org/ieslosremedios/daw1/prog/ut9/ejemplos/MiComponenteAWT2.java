package org.ieslosremedios.daw1.prog.ut9.ejemplos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MiComponenteAWT2 extends Frame implements ActionListener {
    Button boton;
    MiComponenteAWT2(){
        setTitle("Mi componente");
        setVisible(true);
        setLayout(null);
        // Tambien podriamos usar el metod size
        setBounds(200,200,400,400);

        boton=new Button("Salir");
        boton.setBounds(50,100,72,32);
        add(boton);

        boton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ((Frame)boton.getParent()).dispose();
    }

    public static void main(String[] args) {
        new MiComponenteAWT2();
    }
}
