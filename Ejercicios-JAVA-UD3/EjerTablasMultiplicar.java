public class EjerTablasMultiplicar {
    public static void main(String[] args) {
        //imprime por pantalla las tablas de multiplicar del 1 al 10
        int i=1; //declaramos una variable, que representa al numero de la tabla de multiplicar
        int j=0; //declaramos una variable, que representa al numero que multiplicaremos 
        for (i=1;i<=10;i++){ //He decidido usar un for dentro de otro for. El primer bucle indica el numero de la tabla de multiplicar, y el segundo los numeros por los que se multiplicará. 
            System.out.println("\n"+" Tabla del " + i + "  ");
            System.out.println("_____________");
            for (j=0;j<=10;j++)
                System.out.println("| " + i + " x " + j +" = "+(i*j)+" |");
                System.out.println("|______________|");
        }
        System.out.println("");
    }
}