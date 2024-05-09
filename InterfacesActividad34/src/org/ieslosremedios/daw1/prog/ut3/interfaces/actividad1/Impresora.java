package org.ieslosremedios.daw1.prog.ut3.interfaces.actividad1;

public class Impresora implements Imprimible, Borrable{
    String pagina="";

    public Impresora() {
        this.pagina = TEXTO_POR_DEFECTO;
    }

    @Override
    public void imprime() {
        System.out.println(pagina);
    }

    @Override
    public void establecerContenido(String a) {
        this.pagina=a;
        System.out.println(pagina);
    }

    @Override
    public void borrar() {
        pagina="";
        //System.out.println("");
    }
}
