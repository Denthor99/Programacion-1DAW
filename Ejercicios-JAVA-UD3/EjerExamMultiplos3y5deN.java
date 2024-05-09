public class EjerExamMultiplos3y5deN {
    final static int N=10;
    final static int MULTRES=3;
    final static int MULCIN=5;
    public static void main(String[] args) {
        //Dado un número n, escribir la suma de todos los mútiplos de 3 y 5 hasta n
        int suma=0;
        for (int i=1;i<=N;i++){
            if (i%MULTRES==0||i%MULCIN==0){
                suma=suma+i;
            }    
        } System.out.println("La suma de todos los multiplos de 3 y 5 de "+N+" es "+suma);
    }
}