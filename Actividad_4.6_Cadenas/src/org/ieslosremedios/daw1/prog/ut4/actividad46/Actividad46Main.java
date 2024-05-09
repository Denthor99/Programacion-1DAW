package org.ieslosremedios.daw1.prog.ut4.actividad46;

import java.util.Arrays;

public class Actividad46Main {
    public static void main(String[] args) {

        System.out.println("                   Actividad 4.6: Cadenas");
        System.out.println("___________________________________________________________");
        System.out.println();

        System.out.println("Ejercicio 1: Metodo que imprima la Longitud de la cadena");
        String ejer1="El mundo de la programación pinta muy interesante";
        longitudCadena(ejer1);
        System.out.println();

        System.out.println("Ejercicio 2: Dada una posición, devuelve el caracter que ocupa esa posicion (usaremos el " +
                "mismo String del ejercicio anterior)");
        posicionCaracter(ejer1,5);
        System.out.println();

        System.out.println("Ejercicio 3: Cuenta las ocurrencias de un caracter en una cadena");
        ocurrenciasCaracter(ejer1,'e');
        System.out.println();

        System.out.println("Ejercicio 4: imprimeCadenasEnOrdenAlfabético imprime en orden alfabético las cadenas dadas por un array de cadenas," +
                "\n sin tener en cuenta si son mayúsculas o minúsculas.");
        String[] cadenas={"Paco","Roberto","Valencia","Canada","Venezuela","Spiderman","Manue","Vaper","Bolillon"};
        ordenAlfabeticoString(cadenas);
        System.out.println();

        System.out.println("Ejercicio 5: Un método que dado un pequeño texto devuelva un array de cadenas codificando el texto, de modo que:\n" +
                " todas las vocales se sustituyan por un número: o --> 0, i --> 1, a --> 4, e --> 3, salvo la u que se cambia por v.\n" +
                " cada vez que aparezca el caracter punto (.) se corte esa frase y se meta en una posición del array.\n" +
                " la frase que se mete en cada posición del array tiene que estar sin espacios al principio ni al final. ");
        System.out.println();
        String ejer5="Los científicos comenzaron a examinar la muestra con microscopios y realizar pruebas químicas. Descubrieron que la planta contenía una sustancia química única que nunca antes se había encontrado en la naturaleza. Con más pruebas, determinaron que esta sustancia tenía propiedades antibióticas potentes.";
        codificacionCadena(ejer5);
        System.out.println();

        System.out.println("Ejercicio 6: Convertir los siguientes números a String y posteriormente ordenarlos alfabéticamente de menor a mayor\n" +
                "int[] numbers = {2,1,11,10};");
        int[] numbers={2,1,11,10};
        System.out.println("Antes de ejecutar el metodo: "+Arrays.toString(numbers));
        System.out.println("Una vez usado el metoodo: "+Arrays.toString(intAStringOrdenarMenorMayor(numbers)));
        System.out.println();

    }
    static void longitudCadena(String ejer1){
        System.out.println("La longitud de la cadena es de "+ejer1.length());
    }
    public static void posicionCaracter(String ejer2, int posicion){
        System.out.println("En la posicion " + posicion+" se encuentra el caracter "+ ejer2.charAt(posicion-1));
    }
    public static void ocurrenciasCaracter (String a,char b){
        int ocurrencia=0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == b){
                ocurrencia++;
            }
        }
        System.out.println("El caracter " + b+ " aparece " + ocurrencia +" veces en la cadena");
    }
    public static void ordenAlfabeticoString(String[] a){
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            if (a[i].equalsIgnoreCase(a[i])) {
                System.out.println(a[i]);
            }
        }
    }
    public static void codificacionCadena(String texto){
        System.out.println("Texto Original");
        System.out.println(texto);
        System.out.println("");
        System.out.println("Tras la codificación: ");
        String vocalChanges= texto.replaceAll("a","4").replaceAll("e", "3")
                .replaceAll("i","1").replaceAll("o","0")
                .replaceAll("u","v").replaceAll("í","1").replaceAll("á","4")
                .replaceAll("é","3").replaceAll("ó","0").replaceAll("ú","v");
        String[] stringArray=vocalChanges.split("\\.");
        String sinEspacios=vocalChanges.trim();
        System.out.println(Arrays.toString(stringArray));
    }
    public static String [] intAStringOrdenarMenorMayor(int []a){
        String[] salida=new String[a.length];
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            salida[i]=String.valueOf(a[i]);
        }
        return salida;
    }
}