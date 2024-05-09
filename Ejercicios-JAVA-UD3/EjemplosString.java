public class EjemplosString {
    public static void main(String[] args){
        //Creamos una variable String
        String nombre="Daniel Alfonso";
        String apellido="Rodriguez Santos";
        char c;
        float edad=23;
        //Imprimimos el valor de la variable
        System.out.println("Hola " + nombre + apellido);
        /*Imprimimos con formato lo siguiente:
        Hola Daniel Alfonso, tengo 18 años*/
        System.out.printf("Hola %s %s, tengo %.2f años \nSoy desarrolador web, \"bueno\", en proceso. \nManejo bien linux mira, toma ",nombre,apellido,edad);
    }
    
}
