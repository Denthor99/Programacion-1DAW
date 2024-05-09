import java.util.Arrays;

public class CompararArrays {
    public static void main(String[] args) {
        int[]a={1,2,3};
        int[]b={1,2,3};
        // Estamos comparando referencias al objeto, habría que usar el equals
        System.out.println(a==b);
        System.out.println(Arrays.equals(a,b));

        // Asignamos el valor de
        b=a;
        b[0]=0;
        a[0]=1;
    }
}
