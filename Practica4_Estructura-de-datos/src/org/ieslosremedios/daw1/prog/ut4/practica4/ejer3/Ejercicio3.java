package org.ieslosremedios.daw1.prog.ut4.practica4.ejer3;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio3 {
    public static void main(String[] args) {
        // Creamos array de 100 numeros
        int[] centNums=new int[100];
        // Ahora llenamos el array con numeros aleatorios, para ellos usaremos un metodo
        aleatoriosNum(centNums);
        //Vamos a comprobar si el metodo anterior ha introducido valores numericos aleatorios
        System.out.println(Arrays.toString(centNums));
        //Creamos un metodo para conocer cual de los valores aleatorios introducidos anteriormente es el mayor
        System.out.println("El numero mayor es el "+numeroAleatorioMayor(centNums));
        //Ahora haremos lo contrario, queremoos buscar el numero más pequeño
        System.out.println("El numero menor es el "+numeroAleatorioMenor(centNums));
        //Ahora queremos saber la suma de todos los numeros del array
        System.out.println("La suma de todos los valores es "+sumaNumerosAleatorios(centNums));
        //Calculamos la media de todos los valores del array
        System.out.println("La media de todos los valores es "+mediaNumerosAleatorios(centNums));
        //Sustituimos un valor de un elementoo por otro número dadoo
        System.out.println(Arrays.toString(sustituirNumero(centNums,20,69)));
    }
    public static int[] aleatoriosNum(int[] a){
        Random aleatorio=new Random();
        for (int i = 0; i < a.length; i++) {
            a[i]=aleatorio.nextInt(200);
        }
        return a;
    }
    public static int numeroAleatorioMayor(int[]a){
        int numMayor=a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i]>numMayor){
                numMayor=a[i];
            }
        }
        return numMayor;
    }
    public static int numeroAleatorioMenor(int[]a){
        int numMenor=200;
        for (int i = 0; i < a.length; i++) {
            if(a[i]<numMenor){
                numMenor=a[i];
            }
        }
        return numMenor;
    }
    public static int sumaNumerosAleatorios(int[] a){
        int suma=0;
        for (int i = 0; i < a.length; i++) {
            suma+=a[i];
        }
        return suma;
    }

    public static int mediaNumerosAleatorios(int []a){
        int suma=0;
        for (int i = 0; i < a.length; i++) {
            suma+=a[i];
        }
        return suma/a.length;
    }
    public static int[] sustituirNumero(int[]a,int num,int sus){
        int[] salida=a.clone();
        for (int i = 0; i < salida.length; i++) {
            if(salida[i]==num){
                salida[i]=sus;
            }
        }
        return salida;
    }
}
