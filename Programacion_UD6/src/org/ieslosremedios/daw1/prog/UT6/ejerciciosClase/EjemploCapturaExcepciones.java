package org.ieslosremedios.daw1.prog.UT6.ejerciciosClase;

public class EjemploCapturaExcepciones {
    public static void main(String[] args) {
        System.out.println("COMIENZO PROGRAMA DIVISIÓN");
        try {
            int dividendo = 5;
            int divisor = 0;
            System.out.println("Resultado: "+ division(dividendo, divisor));
        }catch (ArithmeticException ex){
            System.out.println(ex.getMessage());
            ex.printStackTrace();
            System.out.println("Imposible dividir entre 0");
        }   finally {
            System.out.println("FIN PROGRAMA DIVISIÓN");
        }
    }

    private static int division(int dividendo, int divisor) {
        return dividendo / divisor;
    }
}
