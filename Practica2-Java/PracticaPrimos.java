/**
 * Clase publica llamada PracticaPrimos. Hay que tener en cuenta que siempre la clase tiene que tener el mismo nombre que el archivo .java
 * @author Daniel Alfonso Rodriguez Santos
 * @version 1.0
 */
public class PracticaPrimos {
//Campos de la clase
    final static int MAX=100;//declaramos una constante, donde ira almacenado el numero maximo con el que trabajaremos (100), y lo usaremos principalmente para generar un valor aleatorio empleando una serie de metodos de la clase Math del paquete java.lang
    final static int MIN=1;//declaramos una constante, donde almacenaremos el numero minimo con el que trabajaremos (1 en este caso). La usaremos en mi caso dentro del FOR
    
    /** 
     * Metodo Main
     * @param args
     * @param randomNumber Variable que almacena el numero aleatorio generado por la clase Math de Java y sus metodos correspondientes
     *  @param divisor Variable que almacena por cada iteracción si se cumple la condicion establecida
    * @param i variable que será creada y tendra solo visibilidad dentro del bucle for, el resto de variables están declaradas fuera de ese bloque porque tienen que tener visibilidad
     */
    public static void main(String[] args) {
        int randomNumber=(int)Math.floor(Math.random()*MAX);/*declaramos una variable llamada randomNumber, que almacenará el resultado del metodo floor (redondea el numero generado por Math.random) y 
        random de la clase Math (que genera un numero aleatorio). Hay que tener en cuenta tambien que hemos tenido que convertir el resultado en entero debido a que ambos metodos de math generan un Double */
        int divisor=0;//declaramos una variable que será un "contenedor", ya que por cada x iteracciones, y si se cumple la condicion, el valor aumentará.
        for (int i=MIN;i<=randomNumber;i++){ /*Bucle FOR cuyo funcionamiento es muy sencillo: 1. Indicamos que empezará por 1 (valor de la constante MIN)
            2. La iteración terminará en el momento en el que i tenga el mismo valor que la variable randomNumber
            3. Por cada iteración, i incrementará un valor*/
            if (randomNumber%i==0){/*Un numero divisible se sobreentiende que es aquel que, cuando realizamos una division empleando el operador modulo, el resultado es 0. Con este bucle por lo tanto lo que estamos
                haciendo es averiguar por cuantos numeros se puede dividir el numero generado aleatoriamente, y una vez terminada las interacciones comprobar si es primo (solo tiene dos divisores) o no*/
                divisor++; //Si se cumple la condicion, el valor de la variable divisor se incrementa
            }
        }
        if (divisor!=2){//Despues de realizar todas las iteracciones, tenemos una estructura condicional (if) donde si el valor almacenado en divisor no es igual a dos, nos encontrariamos ante un numero no primo
            System.out.println(randomNumber+" no es un numero primo");
        } else {
            System.out.println(randomNumber+" es un numero primo");//Se imprime por pantalla/terminal que el numero es primo, debido a que el valor de divisor es igual a dos
        }
    }//Cierre de metodo
}//Cierre de clase