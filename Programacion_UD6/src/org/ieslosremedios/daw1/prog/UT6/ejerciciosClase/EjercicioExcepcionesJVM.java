package org.ieslosremedios.daw1.prog.UT6.ejerciciosClase;

public class EjercicioExcepcionesJVM {
    public static void main(String[] args) {
        int a=0;
        int b=300;
        try{
            System.out.println("DIVISION DE "+b+" entre "+a);
            excepcionJVM(b,a);
        }catch (VirtualMachineError er) {
            er.printStackTrace();
            System.out.println(er.getMessage());
        } catch (ArithmeticException ler){
            ler.printStackTrace();
            System.out.println(ler.getMessage());
        } finally {
            System.out.println("Programa finalizado");
        }
    }
    public static void excepcionJVM(Integer a, Integer b) throws VirtualMachineError{
        System.out.println(a/b);
    }
}
