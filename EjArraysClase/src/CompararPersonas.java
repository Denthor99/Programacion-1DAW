public class CompararPersonas {
    public static void main(String[] args) {
        PersonaArray a=new PersonaArray("a");
        a.nombre="a";
        PersonaArray b=new PersonaArray("a");
        b.nombre="b";

        System.out.println(a==b);
        System.out.println(a.equals(b));
    }
}
