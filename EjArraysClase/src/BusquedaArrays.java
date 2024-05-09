import java.util.Arrays;

public class BusquedaArrays {
    public static void main(String[] args) {
        // La clase Arrays tiene metodos de busqueda
        /**Creamos un metodo que reciba un numero y un array y devuelva la posición donde se ha encontrado
         el número o -1 si no lo ha encontrado*/
        int[]nArray={8,9,5,4,23,21,-1,54,45,102,1,0};
        System.out.println(busquedaEjer1(nArray,8));
        // Busqueda binaria
        System.out.println(Arrays.binarySearch(nArray,9));

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
