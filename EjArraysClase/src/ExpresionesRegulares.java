import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpresionesRegulares {
    public static void main(String[] args) {
        // Las expresiones regulares definen un patron para las cadenas. Ej: pa.*
        // Usadas para realizar tanto busquedas como validaciones.
        // Manejamos dos clases en java: Pattern y Matcher. La clase String tambien tiene un método (matches)
        //Pattern.compile va a buscar todos los patrones que concuerden con el filtro que le indiquemos.
        //^Pa.*" Le dice que busque cualquier patrón que empiece por "Pa". El punto significa "cualquier caracter" y
        //el '*' significa que se repita ese último caracter (por eso hace falta el '.'). Si fuera "Pa*" solo buscaría las
        //palabras como "Paaaaaa", porque la 'a' se encuentra antes del '*'.
        // Le indicamos que el patron empieza por Pa y que no tenga caracteres en mayuscula
        Pattern p = Pattern.compile("^Pa![A-Z]*");
        Matcher m = p.matcher("PaQuito");
        // Con esto, indicamos si se ha encontrado ese patron o no
        System.out.println(m.matches());

        // String matches. Dividimos una cadena por palabras (jugamos con los espacios)
        System.out.println(Arrays.toString("Vendo Opel Corsa Razón Aquí".split(" ")));

        // Ahora dividiremos todos los caracteres de la cadena
        System.out.println(Arrays.toString("Vendo Opel Corsa Razón Aquí".split("")));

        System.out.println(Arrays.toString("Vendo Opel Corsa Razón Aquí".split("Opel Corsa")));


    }


}
