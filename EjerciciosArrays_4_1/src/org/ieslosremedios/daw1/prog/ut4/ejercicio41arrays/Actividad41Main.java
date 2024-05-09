package org.ieslosremedios.daw1.prog.ut4.ejercicio41arrays;

import java.util.Arrays;

public class Actividad41Main {
    // 1. Creamos un metodo main
    public static void main(String[] args) {
       // 2. Declara una variable x de tipo int con valor 1
        int x=1;

        /**
         * 3. Crea un método m que no devuelva nada y reciba un parámetro de nombre x y tipo int. El método incremantará
         * en una unidad el valor del parámetro.
         *
         * 4. Invoca el método m desde main enviando x como argumento. Comprueba si la variable x cambia de valor después
         * de ejecutar el método. Para eso puedes imprimir la variable antes de invocar al método y después.
         * */
        // Impresion de la variable x antes de invocar el metodo
        System.out.println(x);

        // Invocacion de metodo
        m(x);

        // Impresioon de la variable despues de invocar el metodo
        System.out.println(x);
        System.out.println("");

        /**
         * 5. Haz lo mismo para una variable s de tipo String. Tendrás cambiar la declaración del método para que acepte
         * un parámetro int y otro String. ¿Serías capaz de hacerlo mediante sobrecarga en lugar de modificando el
         * método? (principio de pogramación: open-close). Comprueba igualmente si el valor de s cambia después de
         * invocar el método. Lo que hará el método con el parámetro de tipo String será ponerlo en mayúsculas.
         * */
        String name="Daniel Alfonso";
        //Imprimir la cadena antes de invocar el metodo
        System.out.println(name);
        m(x,name);
        System.out.println(name);
        System.out.println("");

        /**
         * 6. Ahora vamos a incluir como parámetro una variable a de tipo array unidimensional de elementos tipo Double
         * inicializada a los valores que  desemos. Probamos igualmente si cambia tras la invocación del método o no.
         * El cambio que realizará el método sobre el parámetro tipo array será el de incrementar en 1 las posiciones
         * primera (no la 1, sino la primera), última y la que ocupe la posición de en medio (redondeando hacia abajo.
         * p.ej. Si tiene 4 posiciones la de en medio será la segunda).
         */
        //Declaramos un array llamado a con elementos de tipo double
        Double[]a={1d,2.5d,3.21d,4d,5.01d};
        //Mostramos el contenido del array de double
        System.out.println(Arrays.toString(a));
        //Invocamos al metodo y mostramos el contenido del array
        m(x,name,a);
        System.out.println(Arrays.toString(a));
        System.out.println("");

        /**
         * 7. Cambiamos el método (¿o seguimos sobrecargando?) para que devuelva un array bidimensional de tipo int,
         * formando una matriz de N x M, donde N ese el tamaño del array de Doubles del parámetro de entrada y M es
         * igual a 2. Vamos a copiar el array de entrada al de salida: para cada posición del array de salida guardaremos
         * primero la parte entera correspondiente a la misma posición del array de entrada y el redondeo en la segunda
         * posición del array de salida.
         * */
        Double[] b = {1d, 2.5d,34.56d,null,0d};
        m2(x,name,b);

        //Imprimimos el resultado del array
        int[][]copiaEjer7=m2(x,name,b);
        for (int i = 0; i < copiaEjer7.length; i++) {
            for (int j = 0; j < copiaEjer7[i].length; j++) {
                System.out.print(copiaEjer7[i][j]);
                System.out.print(" ");

            }
        }
    }
    // Metodo del ejercicio 3
    public static void m (int x){
        x++;
    }
    public static void m (int x, String s){
        s=s.toUpperCase();
        m(x);
    }
    public static void m (int x, String s, Double[]a){
        a[0]+=1;
        a[(a.length-1)/2]+=1;
        a[a.length-1]+=1;
        m(x,s);
    }
    public static int[][] m2(int x, String s, Double[]a){
        int n=a.length;
        int m=2;
        m(x,s);
        int[][]salida=new int[n][m];
        salida[0][0]=(int)Math.floor(a[0]);
        salida[0][1]=(int)Math.round(a[0]);

        salida[1][0]=(int)Math.floor(a[1]);
        salida[1][1]=(int)Math.round(a[1]);

        salida[2][0]=(int)Math.floor(a[2]);
        salida[2][1]=(int)Math.round(a[2]);

        salida[3][0]=(int)0;
        salida[3][1]=(int)0;

        salida[4][0]=(int)Math.floor(a[4]);
        salida[4][1]=(int)Math.round(a[4]);

        return salida;
    }
    public static int[][] m2(Double[]a){
        int n=a.length;
        int m=2;
        int[][]salida=new int[n][m];
        salida[0][0]=(int)Math.floor(a[0]);
        salida[0][1]=(int)Math.round(a[0]);

        salida[1][0]=(int)Math.floor(a[1]);
        salida[1][1]=(int)Math.round(a[1]);

        salida[2][0]=(int)Math.floor(a[2]);
        salida[2][1]=(int)Math.round(a[2]);

        salida[3][0]=(int)Math.floor(a[3]);
        salida[3][1]=(int)Math.round(a[3]);

        salida[4][0]=(int)Math.floor(a[4]);
        salida[4][1]=(int)Math.round(a[4]);

        return salida;
    }
}