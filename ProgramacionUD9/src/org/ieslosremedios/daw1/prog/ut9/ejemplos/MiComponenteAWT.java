package org.ieslosremedios.daw1.prog.ut9.ejemplos;

import java.awt.*;

public class MiComponenteAWT extends Frame {
    MiComponenteAWT(){
        setTitle("Mi componente");
        setVisible(true);
        setLayout(null);
        // Tambien podriamos usar el metod size
        setBounds(200,200,400,400);

        Button boton=new Button("Salir");
        boton.setBounds(50,100,72,32);
        add(boton);

        // Vamos a crear un ActionListener
       boton.addActionListener(new MiListener(this));
    }
    public static void main(String[] args) {
        new MiComponenteAWT();
    }
}
