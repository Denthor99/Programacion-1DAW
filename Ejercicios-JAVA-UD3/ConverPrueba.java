public class ConverPrueba {
    public static void main (String[] args) {
        //declaracion de variables
        int entero=56;
        double doble=entero;
        //Conversión segura
        System.out.println("Valor de entero: " + entero); //Conversión segura
        System.out.println("valor de doble: " + doble);

        //declaracion de variables
        double decimal=3.13451d;
        int enterodeci=(int) decimal;

        //Conversión no segura (se pierden los decimales)
        System.out.println("valor de decimal: " + decimal);
        System.out.println("Valor de entero: " + enterodeci);
    }
}