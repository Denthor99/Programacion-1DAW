public class EjerFactorial {
    final static int N=7;
    public static void main(String[] args) {
        //Dado un numero n calcular su factorial
        int resul=1;
        for (int i=1;i<=N;i++){
        resul=resul*i;
        System.out.println("Factorial "+N+"!= "+i+"="+resul);
        } 
        //factorial 3!=3x2x1=6
    }
}
