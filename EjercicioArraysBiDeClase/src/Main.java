public class Main {
    public static void main(String[] args) {
        // Generamos variables
        int x=1;
        String s="Buenass";
        Double [] a={1d, 2.5d, 34.56d, null, 0d};
        // Invocacion variable int x
        // System.out.println(x);
        // m(x);
        // System.out.println(x);

        // Invocacion array
        m(x,s,a);
        System.out.println(a[0]);
        System.out.println(a[a.length-1]);
        System.out.println(a[(a.length-1)/2]);

        // Invocacion array bidimensional
        // m2(x,s,a);
    }
    // Creamos un metodo de tipo void que incremente el valor de x
    static void m(int x){
        x=x+1;
    }
    // Reutilizamos el codigo, invocando el metodo anterior, para no repetir código
    // Ademas
    static void m(int x, String s){
        m(x);
        s=s.toUpperCase();
    }
    //
    static void m (int x, String s, Double a[]){
        m(x,s);
        // incrementamos la primera posicion
        a[0]++;
        // Como los arrays pueden variar su tamaño, para calcular la ultima posición, debemos realizar lo siguiente
        a[a.length-1]++;
        // Averiguamos la mitad del array. Como puede variar, debemos usar length para calcular el tamaño actual del array y dividirlo entro dos
        a[(a.length-1)/2]++;
        // Debemos tener en cuenta que lo hecho con las dos posiciones anteriores es recomendable usarlas siempre y cuando no sepamos el tamaño del array
        // Metodo Math (por resolver)
        // a[(int) (Math.floor(a.length-1)/2)]++;
    }
    // Ejercicio 7. Declaramos un metodo de tipo int, con un array dimensional.
    // No podemos sobrecargar el metodo
    static int [][] m2 (int x, String s, Double []entrada){
        // Invocacion a los metodos anteriores
        m(x,s,entrada);
        int n=entrada.length;
        int m=2;
        int [][] salida = new int[n][m];
        int i,j;

        // Vamos a añadir valores al array dimensional. Como nos pide el enunciado, debemos hacer casting de Double a int en la primera "dimension"
//        salida[0][0]=(int)Math.floor(entrada[0]);
//        salida[0][1]=(int)Math.round(entrada[0]);
//
//        salida[1][0]=(int)Math.floor(entrada[1]);
//        salida[1][1]=(int)Math.round(entrada[1]);
//
//        salida[2][0]=(int)Math.floor(entrada[2]);
//        salida[2][1]=(int)Math.round(entrada[2]);
//
//        salida[3][0]=(int)Math.floor(entrada[3]);
//        salida[3][1]=(int)Math.round(entrada[3]);
//
//        salida[4][0]=(int)Math.floor(entrada[4]);
//        salida[4][1]=(int)Math.round(entrada[4]);


        salida[0][0]=(int)Math.floor(entrada[0]);
        salida[0][1]=(int)Math.round(entrada[0]);

        salida[1][0]=(int)Math.floor(entrada[1]);
        salida[1][1]=(int)Math.round(entrada[1]);

        salida[2][0]=(int)Math.floor(entrada[2]);
        salida[2][1]=(int)Math.round(entrada[2]);

        salida[3][0]=(int)Math.floor(entrada[3]);
        salida[3][1]=(int)Math.round(entrada[3]);

        salida[4][0]=(int)Math.floor(entrada[4]);
        salida[4][1]=(int)Math.round(entrada[4]);
        return salida;
    }
}