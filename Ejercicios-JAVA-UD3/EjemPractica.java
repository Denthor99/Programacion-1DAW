public class EjemPractica {
    final static int MIN=1;
    final static int MAX=101;
    public static void main(String[] args) {
        int randomNumber=(int)Math.floor(Math.random()*MAX);
        System.out.println(randomNumber);
        for (int i=1;i<=MAX;i++){
            int result=randomNumber%i;
            if (result!=0&&result!=randomNumber){
                continue;   
            }
            System.out.println(randomNumber + " es Primo");
        }
    }
}
