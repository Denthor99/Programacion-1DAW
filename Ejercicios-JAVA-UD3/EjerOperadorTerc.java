public class EjerOperadorTerc {
    public static void main(String[] args){ //menor que o igual
        Integer a=3;
        Integer b=10;
        String mayor=(a>b)?"a":"b";
        String menor=(a<b)?"a":"b";
        String igual=(a==b)?"Son iguales":"No son iguales";
        System.out.println("El mayor es " + mayor + " y el menor es " + menor + ". " + igual);
    }
}
