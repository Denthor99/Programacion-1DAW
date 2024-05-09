import java.sql.SQLOutput;
import java.util.Arrays;

public class ClaseString {
    public static void main(String[] args) {
        // Un String es una cadena de caracteres. Es un tipo objeto, a diferencia de char, que es un tipo primitivo
        // Para añadir valores a un objeto String usamos comillas dobles, y en char usamos comillas simples.
        // String no es más que un array de tipo chars (char []), es decir, un tipo de dato envoltorio que en su interior contiene un conjunto de caracteres
        // String se almacena en una parte distinta de la memoria, por eso no usamos el "new" para introducir valores, si no comillas dobles
        // String realmente funciona como una constante, pues cualquier operación que hagamos sobre un String genera otro nuevo
        // Clase String Base y String Builder: se usan para modificar string y así evitamos la inmutabilidad que tiene esa clase

        // Vamos a crear un string a partir de un array de caracteres
        char[] ejemplo1={'P','a', 'c', 'o'};
        String ejemplo2=new String(ejemplo1);
        String ejemplo3="Hola";
        String saludo=ejemplo3 +" "+ ejemplo2;
        System.out.println(saludo);

        // Anteriormente mencionamos que un String no era más que una cadena de caracteres, aunque si entramos a la documentación de Java
        // sobre la clase String, podemos observar que internamente trabaja con cadenas de Byte []. Esto tiene sentido, pues si depuramos, por ejemplo, char[] ejemplo1
        // observaremos que cada caracter tiene un valor. "P", por ejemplo, tiene un valor de 80. Y realmente por eso trabaja con Byte, pues el byte es un valor que va del 0 al 255,
        // y como java trabaja con unicode (estandar de codificación de caracteres), a cada valor que tenga byte va asociado a un caracter

        // Ejercicio: creamos un array de caracteres cualquiera, y vamos a imprimir por consola la longitud. Hay que hacerlo con un metodo aparte
        char[] cualquiera={'H','e','l','l','o',' ','f','e','l','l','a','!'};
        longitudCadena(cualquiera);

        // Lo mismo que lo anterior, pero con objeto tipo String
        String cadena="Hola, me llama Roberto";
        longitudString(cadena);

        // El metodo anterior tambien funciona añadiendo directamente valores. Este tipo de string se le conoce como anonimos
        // pues no tiene un nombre definido. Este tipo de strings se usan para las funciones lambdas
        longitudString("Mateo");

        // Metodo que, dada una cadena de texto y dado tambien un numero te diga el caracter que haya en esa posición
        posicionCaracter(cadena,7);

        // Metodo que nos cuenta todas las ocurrencias de un caracter
        ocurrenciasCaracter(cadena,'z');

        // Metodo que nos ordena (en orden alfabetico) un array de caracteres
        char[] arrayChar={'h','p','o','b','a'};
        ordenAlfabeticoArray(arrayChar);

        // Metodo parecido al anterior pero con array de cadenas (Strings)
        String[] paco={"hola","que tal", "miralmar", "albacete","valencia", "Barcelona"};
        ordenAlfabeticoString(paco);

        // Creamos un metodo que, dado un pequeño texto, nos devuelva un array de cadenas con el texto codificado, de modo
        // que todas las vocales se sustituyan por un número: a-->4, e--> 3, i-->1, o-->0, u-->v.
        // Cada vez que aparezca un punto, la frase se corta y se mete en una posición de un array.
        // No debe de haber espacios al inicio y al final de cada frase, es decir, en cada posición del array
        String texto="Me comi una salchipapa. Ay que cosa tan sabrosa!. Pasa que esta muy cara. Puto Putin";
        codificacionCadena(texto);

        // En la actividad 4.6, nos dan un array de numeros enteros, y lo pasaremos a un array de cadena. Posteriormente ordenarlos
        int[]numbers={2,1,11,10};
        String []hey;
        hey=intAStringOrdenarMenorMayor(numbers);
        System.out.println(Arrays.toString(hey));
        // El resultado es correcto, a pensar que no pueda parecerlo.

    }
    public static void longitudCadena(char[] a){
        int longitud=a.length;
        System.out.println("La longitud de la cadena es de "+ longitud +" caracteres");
    }

    public static void longitudString(String a){
        System.out.println("La longitud de este tipo String es de "+a.length()+ " caracteres");
    }
    public static void posicionCaracter(String a, int b){
        System.out.println("En la posicion " + b+" se encuentra el caracter "+ a.charAt(b-1));
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

    public static void ordenAlfabeticoArray(char[]a){
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
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
                .replaceAll("u","v");
        String[] stringArray=vocalChanges.split("\\.");
        String sinEspacios=vocalChanges.trim();
        System.out.println(Arrays.toString(stringArray));
    }
    public static String [] intAStringOrdenarMenorMayor(int []a){
        String[] hey=new String[a.length];
        //Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            hey[i]=String.valueOf(a[i]);
        }
        Arrays.sort(hey);
        return hey;
    }
}
