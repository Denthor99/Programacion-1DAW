package Pruebas;

import org.daniel.daw1.prog.util.Matematicas;

public class Main {
    final static Integer A=8;
    final static Integer B=4;
    public static void main(String[] args){
        CalculadoraBasica Op1 = new CalculadoraBasica();
        //Op1.suma(A,B);
        //Op1.resta(A,B);
        //Op1.multiplicacion(A,B);
        //Op1.division(A,B);
        enum Operacion {SUMA, RESTA, DIVISION, MULTIPLICACION, MATRICES}
        Operacion Oper=Operacion.RESTA;
        switch (Oper){
            case SUMA:
                System.out.println("La suma de " + A + " y "+B+" es " +Op1.suma(A,B));
                break;
            case RESTA:
                System.out.println("La resta de " + A + " y "+B+" es " +Op1.resta(A,B));
                break;
            case MULTIPLICACION:
                System.out.println("La multiplicacion de " + A + " y "+B+" es " +Op1.multiplicacion(A,B));
                break;
            case DIVISION :
                System.out.println("La division de " + A + " y "+B+" es " +Op1.division(A,B));
                break;
            default: System.out.println("Operacion no soportada");
            }
        }
}
