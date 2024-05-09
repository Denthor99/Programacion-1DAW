public class EjerVariable2 {
    static int x = 98;
    static int y = 34; // declarar x e y

    public static void main(String[] args) { 
        // crear bloque donde se imprima x. Variable z y creamos un bloque dentro
        // del anterio, y dentro de ese bloque imprimimos z. Imprimir tambien x e y
        // crear bloque donde se imprima y
        System.out.println(x);
        int z = 4;
        {
            System.out.println(z);
            System.out.println(x);
            System.out.println(y);
        }
         // crear bloque donde se imprima y
        {
            System.out.println(y);
        }
    }

}
