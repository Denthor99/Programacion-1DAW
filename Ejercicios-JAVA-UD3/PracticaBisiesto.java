public class PracticaBisiesto {//Clase publica (con el mismo nombre que el archivo .java)
    /**
     * @author Daniel Alfonso Rodriguez Santos
     * @param args
     * @version 1.0
     */
    public static void main(String[] args) {
        int anyo=2020;//declaramos una variable de tipo entero, donde almacenaremos el año
        if (anyo%4==0&&anyo%100!=0||anyo%400==0){//usamos un condicional (if) para realizar el correspondiente filtro (divisible entre 4, no divisible entre 100 o divisible entre 400)
            System.out.println(anyo+" es bisiesto");//Si se cumple la condición, se imprime el siguiente mensaje por pantalla/terminal
        } else {
            System.out.println(anyo+ " no es bisiesto");//Si no se cumple la condición, se imprime el siguiente mensaje por pantalla/terminal
        }
    }//Cierre de Metodo
}//Cierre de clase
