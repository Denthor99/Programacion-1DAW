import java.util.Arrays;

public class OrdenacionArrays {
    public static void main(String[] args) {
        // Copiamos el array del ejercicio anterior
        int[]nArray={8,9,5,4,23,21,-1,54,45,102,1,0};

        // Con este metodo de la clase Arrays, podemos ordenar el contenido de un array
        Arrays.sort(nArray);
        // Ahora volvemos a usar los dos metodos del ejercicio anterior
        System.out.println(Arrays.binarySearch(nArray,0));
        System.out.println(busquedaEjer1(nArray,0));
    }
    public static int busquedaEjer1(int[]a, int b){

        for (int i=0;i<a.length;i++){
            if (b==a[i]){
                return i;
            }

        }
        return -1;
    }
}
