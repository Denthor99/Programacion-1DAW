public class Main {
    public static void main(String[] args) {
        // ARRAYS: Recorrido
        // Ejercicio 1: Declaramos un array de tipo int, y añadimos valores
        int [] a ={7,-2,5,0,6};
        sumaArray(a);
        System.out.println(sumaArray(a));

        // Ejercicio 1.2: Lo mismo pero con for each
        sumaEach(a);
        System.out.println(sumaEach(a));

        // Ejercicio 2: Declaramos un nuevo array (b), y lo sumamos con el primero
        int [] b= {10,-2,9,-3,-4,9,3,9,-10,4};
        // Sumamos ambos arrays
        System.out.println(sumaArray(a)+sumaArray(b));
    }

    //Metodo que suma el array a
    static int sumaArray(int[]a){
        int suma=0;
        for (int i=0; i<a.length;i++){
            suma=suma+a[i];
        }
        return suma;
    }
    static int sumaEach(int[]a){
        int suma=0;
        for (int i:a) {
            suma=suma + i;
        }
        return suma;
    }

}