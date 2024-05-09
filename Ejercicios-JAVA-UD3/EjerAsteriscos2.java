public class EjerAsteriscos2 {
    private static final int N = 20;

    public static void main(String[] args) {
        for (int i=1;i<=N;i+=2){
            for (int j=1;j<=i;j++)
            System.out.printf("*");
            System.out.println();
        }
    }
}