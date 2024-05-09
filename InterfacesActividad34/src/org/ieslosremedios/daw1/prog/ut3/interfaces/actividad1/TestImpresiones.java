package org.ieslosremedios.daw1.prog.ut3.interfaces.actividad1;

public class  TestImpresiones {
    public static void main(String[] args) {
        // Objetos de la Clase Impresora
        Imprimible print1 = new Impresora();
        print1.imprime(); // Imprime el valor por defecto
        print1.borrar(); // Borra el valor por defecto
        print1.imprime(); // Imprimir tras borrado
        print1.establecerContenido("Esto es un test");

        // Separador entre ejercicios
        System.out.println("");

        // Objetos de la Clase Consola
        Imprimible print2 = new Consola();
        print2.imprime(); // Imprime el valor por defecto
        print2.borrar(); // Borra (sustituye por asteriscos)
        print2.establecerContenido("Esto es un test"); // Reestablece el valor de pantalla por un valor distinto al por defecto

        // No podemos generar objetos directamente desde una interfaz ya que no se puede instanciar un objeto desde ellas, solo podemos generar campos y metodos para que lo implenten varias clases.
        //Imprimible nueve1 = new Imprimible();
    }
}