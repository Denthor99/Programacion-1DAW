import java.util.Arrays;
public class InsercionMasiva {
    public static void main(String[] args) {
        int []a=new int[8];
        int b=8;
        Arrays.fill(a,b);
        b=7;
        Arrays.fill(a,0,6,b);
    }
}
