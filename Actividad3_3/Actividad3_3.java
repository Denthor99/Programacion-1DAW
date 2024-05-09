public class Actividad3_3 {
    public static void main(String[] args){
        //Imprimir hola
        String saludo="Hola";
        System.out.printf("%s",saludo);
        //Imprimir Hola + <tu nombre>
        String nombre="Daniel Alfonso Rodríguez Santos";
        System.out.printf("\nHola %s",nombre);
        //Imprimir Hola, me llamo <tu nombre> y tego <tu edad> años
        int edad=23;
        System.out.printf("\nHola, me llamo %s y tengo %d años",nombre,edad);
        /*Nombre:<tu nombre>
         * Edad: <tu edad>
         */
        System.out.printf("\nNombre: %s\nEdad: %d",nombre,edad);
        //"Primero\Segundo\Tercero"
        System.out.printf("\n\"Primero\\Segundo\\Tercero\"");
        //3/2=1.5
        int tres=3;
        int dos=2;
        float deci=(float)3/2;
        System.out.printf("\n%d/%d = %.1f",tres,dos,deci);

    }    
}
