package org.ieslosremedios.daw1.prog.ut9.ejemplos;

import java.awt.*;

public class EjemploBorderLayout extends Frame {
    EjemploBorderLayout(){
        // Creación de Frame
        setTitle("El borde de capas");
        setBackground(Color.LIGHT_GRAY);
        setVisible(true);
        setLayout(new BorderLayout());
        setBounds(0,0,400,300);
        // Creamos los cincos botones
        Button primero=new Button("El primero");
        primero.setVisible(true);
        Button segundo=new Button("El segundo");
        segundo.setVisible(true);
        Button tercero=new Button("El tercero");
        tercero.setVisible(true);
        Button cuarto=new Button("El cuarto");
        cuarto.setVisible(true);
        Button quinto=new Button("El quinto");
        add(primero,BorderLayout.NORTH);
        add(segundo,BorderLayout.WEST);
        add(tercero,BorderLayout.EAST);
        add(cuarto,BorderLayout.CENTER);
        add(quinto,BorderLayout.SOUTH);

    }

    public static void main(String[] args) {
        new EjemploBorderLayout();
    }
}
