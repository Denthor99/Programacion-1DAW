import java.util.Arrays;
public class EliminacionArrays {
    public static void main(String[] args) {
        // Declaramos un array de enteros
        int[]in={5,46,3,9};
        int pos=1;
        int[] print=exterminarArray(in,pos);
        System.out.println(Arrays.toString(print));
    }
    static int[] exterminarArray(int[] in, int pos){
        int[] out=new int[in.length-1];
        System.arraycopy(in,0,out,0,pos);
        System.arraycopy(in, pos+1,out,pos,(in.length-pos-1));
        return out;
    }
    //static int[] exterminarManual(int[]i, int pos){
       // int[] out
   // }
}
