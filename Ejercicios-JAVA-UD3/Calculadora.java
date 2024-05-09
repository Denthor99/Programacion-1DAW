public class Calculadora {
    final static int MAX=Integer.MAX_VALUE;
    public static void main(String[] args){
        Integer a=2;
        Integer b=3;
        Integer c=4;
        Integer resultado=(a+b)*c;
        System.out.println(resultado);
        //potencia a elevado a b
        double poten=Math.pow(a, b);
        System.out.println(poten);
        //valor maximo de los enteros y añadir a constante maximo de los enteros. La constante se crea en CAMPOS
       System.out.println(MAX);
       //valor maximo de dos numeros enteros
       Integer comp=Math.max(a,MAX);
       System.out.println(comp);
       //alcance de las variables
    }
}