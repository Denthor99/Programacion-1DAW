package org.ieslosremedios.daw1.prog.ut7.ejercicios;
import java.util.*;
public class EjercicioMediaClaseScanner {
    public static void main(String[] args) {
        // Declaramos el objeto de la clase scanner
        Scanner escaneador=new Scanner(System.in);

        // declaramos e inicializamos las dos variables númericas
        int suma = 0, contador=0;

        while (escaneador.hasNextInt()){
            int numeroIntroducido = escaneador.nextInt();
            suma += numeroIntroducido;
            contador++;
        }
        int media = suma / contador;
        System.out.println("La media de las valores introducidos es de: "+media);

    }
}
