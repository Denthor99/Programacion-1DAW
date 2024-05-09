public class Boxing {
    public static void main(String[] args){
        Integer a; //envoltorio
        int b=7; //primitivo
        int c;
        //autoboxing
        a = b;
        //unboxing
        c= b + a;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
