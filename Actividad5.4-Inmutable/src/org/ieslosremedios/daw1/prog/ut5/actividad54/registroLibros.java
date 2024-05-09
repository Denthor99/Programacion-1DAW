package org.ieslosremedios.daw1.prog.ut5.actividad54;

import org.ieslosremedios.daw1.prog.ut5.actividad54.Libros;

import java.util.*;
import java.time.LocalDate;
public class registroLibros {
    private final List<Libros> libros;


    public registroLibros() {

        this.libros = new ArrayList<>();

    }


    public void addBook(String titulo, String autor, LocalDate fechaPublicacion) {

        Libros nuevoLibro = new Libros(titulo, autor, fechaPublicacion);

        libros.add(nuevoLibro);

        System.out.println("Libro nuevo añadido al registroo: " + nuevoLibro.getTitulo());

    }


    public List<Libros> busquedaPorTitulo(String titulo) {

        List<Libros> matchingBooks = new ArrayList<>();

        for (Libros libro : libros) {

            if (libro.getTitulo().equals(titulo)) {

                matchingBooks.add(libro);

            }

        }

        return matchingBooks;

    }
}