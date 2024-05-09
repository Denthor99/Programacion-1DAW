package org.ieslosremedios.daw1.prog.ut3.interfaces.actividad1;

public class Consola implements Imprimible, Borrable{
    String pantalla="$virsh start bullseye";
    @Override
    public void imprime() {
        System.out.printf("%S",pantalla);
        System.out.println("");
    }

    @Override
    public void establecerContenido(String a) {
        this.pantalla=a;
        System.out.println(pantalla);
    }


    @Override
    public void borrar() {
    pantalla.length();
    String asteriscos="";
    for (int i=1; i<=pantalla.length();i++){
        asteriscos="*";
        System.out.print(asteriscos);
    }
        System.out.println("");
    }
}
