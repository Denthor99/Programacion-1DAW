public class EjerNMultiplosWhile {
    final static Integer N=5;
    final static Integer NUM=7;
    public static void main(String[] args) {
        int i=1;
        while (i<=N){
            int resultado=(i*NUM);
            i++;
            System.out.println(resultado);
        }
    }
}
