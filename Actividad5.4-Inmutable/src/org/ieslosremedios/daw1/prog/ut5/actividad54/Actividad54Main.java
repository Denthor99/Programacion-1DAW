package org.ieslosremedios.daw1.prog.ut5.actividad54;

import java.time.LocalDate;
import java.util.*;
public class Actividad54Main {
    public static void main(String[] args) {
        registroLibros registro = new registroLibros();
        // Añadimos al registro unos cuantos libros (la información la extraeremos de internet)
        registro.addBook("De vuelta a casa","Máximo Sáex Escribano", LocalDate.of(2023,03,14));
        registro.addBook("Cómo hacer que te pasen cosas buenas","Marian Rojas", LocalDate.of(2018,10,9));
        registro.addBook("La isla de las tormentas","Ken Follet",LocalDate.of(2018,12,11));
        System.out.println();

        List<Libros> matchingBooks = registro.busquedaPorTitulo("La isla de las tormentas");
        System.out.println("org.ieslosremedios.daw1.prog.ut5.actividad54.Libros que coinciden con ese nombre: ");
        int i=1;
        for (Libros libro: matchingBooks){
            i++;
            System.out.println("Libro encontrado: "+libro.getTitulo() + ". Este libro se encuentra en la posición numero "+i);

        }
    }
}