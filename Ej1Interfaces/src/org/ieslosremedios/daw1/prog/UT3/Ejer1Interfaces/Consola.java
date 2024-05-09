package org.ieslosremedios.daw1.prog.UT3.Ejer1Interfaces;

public class Consola implements Imprimible, Borrable{
    String Pagina="Hola";
    String Color="Rojo";

    @Override
    public void imprime() {
        System.out.println(Pagina + " "+ Color);
    }

    @Override
    public void borrar() {
        this.Pagina="";
        this.Color="Blanco";
        System.out.println(Pagina + " "+ Color);
    }
}
