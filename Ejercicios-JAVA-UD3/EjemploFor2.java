public class EjemploFor2 {
    public static void main(String[] args) { //declarar una variable dentro del FOR, nos permite generar una variable que se definira solo dentro de esa variable
        for (int i= 5; i>0; i--) {
            System.out.println("i: " +i);
        }
        int i=1;
        do{
            System.out.println("i: "+ i);
            i++;
        } while (i<=5);
    }
}
//enunciado ejercicio tarea dia 04/11/2022 mostrar todos los numeros impares que hay del uno al diez