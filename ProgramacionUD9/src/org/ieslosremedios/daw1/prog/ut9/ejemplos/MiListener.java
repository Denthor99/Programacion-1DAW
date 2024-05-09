package org.ieslosremedios.daw1.prog.ut9.ejemplos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MiListener implements ActionListener {
    // Creamos una composicion con la clase donde tenemos el boton definido
    // Crearemos un constructor para vincularlo
    MiComponenteAWT componente;
    public MiListener(MiComponenteAWT componente) {
        this.componente=componente;
    }

    //usamos el metodo dispose para cerrar la ventana
    @Override
    public void actionPerformed(ActionEvent e) {
        componente.dispose();
    }
}
