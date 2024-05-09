package org.ieslosremedios.daw1.prog.ut4.ejercicio41arrays;

public class Main {
    public static void main(String[] args) {
        // Declara una variable x de tipo int con valor 1
        int x=1;
        String s="Ejemplo";

        // Invoca el método m desde main enviando x como argumento. Comprueba si la variable x cambia de valor después de ejecutar el método. Para eso puedes imprimir la variable antes de invocar al método
        // Variable antes de la invocacion
        System.out.println(x);
        // Invocacion del metodo creado (incrementa el valor de la variable)
        m(x);
        // Comprobacion de la variable una vez invocado el metodo
        System.out.println(m(x));

        // Hemos creado la variable String s, con un valor por defecto. Vamos a imprimirla
        System.out.println(s);
        // Vamos a invocar el metodo, que nos pondrá por mayuscula lo que se encuentra dentro del string
        m(s);
        // Vamos a imprimir la variable String, dando el resultado esperado
        System.out.println(m(s));


    }
    // Crea un método m que no devuelva nada y reciba un parámetro de nombre x y tipo int. El método incremantará en una unidad el valor del parámetro.
    static int m (int x){
        return x + 1;
    }
     static String m (String s){
        return s.toUpperCase();
    }
}