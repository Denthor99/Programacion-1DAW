import java.util.Arrays;
import java.util.Random;

public class Actividad47Main {
    public static void main(String[] args) {
        // Declaramos un Array de enteros, cuyo contenido será los nombres de los compañeros de clase
        String[] alumnos={"John", "Jorge", "Victor", "David", "Jonathan", "Pablo", "Juan Manuel Saborido", "Julián", "José", "Juan Maria","Adrian", "Juan Manuel Herrera", "Jossie", "Diego", "Antonio Tellez", "Ricardo", "Daniel Alfonso"};

        // Podríamos hacer un array de valores boooleanos
        Boolean[] repetido=new Boolean[alumnos.length];

        // Invocamos al método
        alumnoAleatorio(alumnos,repetido);


    }
    public static void alumnoAleatorio (String[] a, Boolean[] b){
        Random aleatorio=new Random();
        int alumnoRandom;
        int i =0;
        while (i<a.length){
            alumnoRandom=aleatorio.nextInt(a.length);
            if (b[alumnoRandom]==null || !b[alumnoRandom]){
                b[alumnoRandom]=true;
                i++;
                System.out.println("Alumno seleccionado= "+a[alumnoRandom]);
            }
        }
    }


}