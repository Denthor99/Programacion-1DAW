import java.util.Arrays;
public class IntercambioPosicionesArrays {
    public static void main(String[] args) {
        int[] a={7,-2,5,0,6};
        System.out.println(Arrays.toString(desplazarManual(a)));

    }
    static int[] desplazarManual(int[]a){
        int[]b=a;
        int aux=b[b.length-1];
        for (int i = b.length; i >=0; i--) {
            b[i]=b[i-1];

        }
        b[0]=aux;
        return b;
    }
}
