package org.ieslosremedios.daw1.prog.ut9.apuntes;

public class Apuntes24Mayo {
    /**
     * Cuando usamos el metodo setBounds, lo que estamos haciendo es añadir la posición absoluta de ese elemento.
     * Podemos usar un layout para poder distribir los componentes en la interfaz GUI
     *
     * EVENTOS
     * Cualquier acción que realiza el usuario al interactuar con la interfaz, es decir, un cambio en el estado de un
     * objeto por el usuario (o el sistema).
     * Ejemplos:
     * - Cerrar ventana
     * - Click del ratón
     * - Cambiar el foco de un elemento a otro (ir de una ventana a otra)
     *
     * Eventos - Conceptos
     * Se registra un listener para cada tipo de evento que queramos atender.
     * Se sobreescriben/implementan métodos que nos interesen en función de qué queramos hacer
     * para responder al evento
     * Ej
     *  Pulso tecla ----> Genera un objeto de evento -------> Es capturado y manejado por el listener -
     *                                                                                                |
     *                                  <--------------    Devuelve algo (callback)     <-------------|
     *
     * La clase EventObject
     * java.util.EventObject <---------- java.awt.AWTEvent
     *
     * ActionEvent: Presionar un botón, escribir en un TextField, etc.; Listener: ActionListener
     * WindowEvent: Cualquier acción relevante sobre el componente "Window": Listener: WindowListener
     *
     * Evento - Registrar listeners
     * Debemos registrar los listeners que queramos asociar a un evento, registrandolos en el componente
     * para que sean notificados cada vez que se cumpla una acción
     * - Añadir listener: .addXXListener
     * - Eliminar listener: . removeXXListener
     *
     * */
}
