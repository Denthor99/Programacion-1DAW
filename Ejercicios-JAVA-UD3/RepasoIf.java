public class RepasoIf {
    public static void main(String[] args){
//dados dos numeros a b declarados e inicializados en nuestro metodo main que nos muestre que a es mayor que b. si b es mayor que A muestre que b es el mayor
        Integer a=12;
        Integer b=8;
        if (a>b) {
            System.out.println(a + " es mayor que " + b);
        } else if (a<b){
            System.out.println(a + " es menor que " + b);
        } else {
            System.out.println(a + " es igual a " + b);
        }
    }
}
//si a es mayor que b, cualquier otro caso es que sea mayor que b o igual