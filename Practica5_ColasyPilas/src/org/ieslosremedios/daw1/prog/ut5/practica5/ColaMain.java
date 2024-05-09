package org.ieslosremedios.daw1.prog.ut5.practica5;

public class ColaMain {
    public static void main(String[] args) {
        // Primero probaremos de la clase TAD cola, por lo que creamos un objeto de dicha clase.
        TADCola colaCine=new TADCola();
        // En este caso, haremos una especie de "roleplay" sobre la cola de un cine donde esperan varias
        // personas. Empiezan a llegar las primeras personas.
        colaCine.encolar("Javier");
        colaCine.encolar("Roberto");
        colaCine.encolar("Francisco");
        colaCine.encolar("Maria");
        colaCine.encolar("Lucia");

        // Al llegar con mucho margen de tiempo la cola estaria formada por...
        colaCine.longitud();

        // Como Javier tiene ganas de usar los servicios del cine, decide comprar la entrada ya, y entrar
        // mientras el resto se queda todavía en la cola porque no tienen prisa, por lo que....
        colaCine.desencolar();

        // hay una nueva cabeza de la cola.
        colaCine.frente();

        // Actualmente detrás del "lider" de la cola tenemos a:
        colaCine.resto();

        // Muy bien, día de cine tranquilo, porque en la cola actualmente hay:
        colaCine.longitud();

        // Ha pasado un tiempo y como estaban de chachara, no se han dado cuenta de que la hora de proyección estaba cerca
        // por lo que deciden ir a pagar, pero surge un problema: Nadie tiene cambio suficiente, por lo que la primera persona
        // paga con un billete de 50 y entran todas las personas restantes, quedando la cola vaciá
        colaCine.limpiar();
        System.out.println();

        // Antes de cerrar la taquilla para esa sesión, el trabajador de ese turno decide esperar a ver si viene alguien más
        //, así que se hace la siguiente pregunta:
        System.out.println("La cola que pasó anteriormente, ¿erán las unicas personas interesadas por ver la pelicula?");
        System.out.println(colaCine.esVacia());

    }
}