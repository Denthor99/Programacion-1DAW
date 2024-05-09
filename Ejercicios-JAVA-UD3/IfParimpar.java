public class IfParimpar {
    public static void main(String[] args){
        int edad=31; //Declaramos la variable int llamada edad
        int num=edad%2; //Declaramos otra variable int llamada num, donde realizaremos una operación (mod)
        if (num == 0) {
            System.out.println(edad + " es par");//Si el resultado de la operación num es igual a 0
        }else{ 
            System.out.println(edad + " es impar");//Si el resultado de la operación num es distinto a 0
        }
    }
   
}