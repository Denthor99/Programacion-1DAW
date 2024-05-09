package org.ieslosremedios.daw1.prog.UT3.Ejer1Interfaces;

public class Impresora implements Imprimible, Borrable{
    String pagina="Hola que tal";
    @Override
    public void imprime() {
        System.out.println(pagina);
    }

    @Override
    public void borrar() {
        this.pagina="";
        System.out.println(pagina);
    }
}
