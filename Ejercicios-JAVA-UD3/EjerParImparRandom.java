public class EjerParImparRandom {
    //Par / impar con un número dado mediante una variable con valor aleatorio entre 0 y 100.
    public static void main(String[] args) {
        Double random=Math.random()*100;
        Integer num=(int)random%2;
        System.out.println(random);
        System.out.println(num);
        if (num==0) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }
    }
}
