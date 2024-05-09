public class InsercionArrays {
    public static void main(String[] args) {
        // Insercion manual
        int[]a={7,1,5,2};
        int[]b=insertaConcreto(a,8,3);
        int[]c=insertaFor(a,8,3);

        // Inserción Automatica
        int[]d=new int[5];
        System.arraycopy(b,0,d,0,d.length-1);
    }
    static int[] insertaFor(int[] in, int e, int pos){
        int[]out=new int[in.length+1];
        for (int i = 0; i < pos; i++) {
            out[i]=in[i];
        }
        out[pos]=e;
        for (int j = pos; j < in.length; j++) {
            out[pos+1]=in[j];
        }
        return out;
    }

    static int[] insertaConcreto(int[] in, int e, int pos){
        int[]out=new int[in.length+1];
        for (int i = 0; i <= pos; i++) {
            out[i]=in[i];
        }
        out[pos]=e;
        out[pos+1]=in[pos];

    return out;
    }
}
