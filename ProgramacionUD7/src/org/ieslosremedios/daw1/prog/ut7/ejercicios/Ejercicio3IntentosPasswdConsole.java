package org.ieslosremedios.daw1.prog.ut7.ejercicios;

import java.io.*;
public class Ejercicio3IntentosPasswdConsole {
    static final String DENPSW="den_2022";
    static final Integer INTENTO=3;
    public static void main(String[] args) {
        /**
         * Enunciado: Escribe un programa que pida al usuario su nombre y contraseña y los compare
         * con la valor de una constante. En caso de que se introduzca mal sus credenciales, permite 3 intentos
         * */


        Console consola = System.console();
        System.out.println("\tLOGIN\t");
        if (consola == null) {
            System.out.println("Introduce algo");
        }else {

            System.out.println("Introduce tu nombre ");
            String nombre = consola.readLine();
            System.out.println("Hola "+nombre);

            System.out.println("Introduce una contrasñea");
            for (int i = 0; i < INTENTO; i++) {
                String password = String.valueOf(consola.readPassword());
                if(!password.equals(DENPSW)){
                    System.out.println("Error de contraseña, vuelva a introducirla");
                }else{
                    System.out.println("Contraseña correcta: "+password);
                    break;
                }
            }

        }
    }
}
