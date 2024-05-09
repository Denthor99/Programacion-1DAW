public class EjerVariable {
    static int c=4; //hay que añadir static, debido a que el método main pertenece a la clase, al ser static
    public static void main(String[] args){
        int a=2;
        System.out.println(a);
        System.out.println("hola campo " + c);
        {
            int b=5;
            System.out.println(b);
            System.out.println("hola campo " + c);
        }

    }
    void miMetodo(){
        System.out.println("hola campo " + c);
    }
}
