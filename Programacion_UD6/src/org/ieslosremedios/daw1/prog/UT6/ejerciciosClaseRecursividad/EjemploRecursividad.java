package org.ieslosremedios.daw1.prog.UT6.ejerciciosClaseRecursividad;

public class EjemploRecursividad {
    public static void main(String[] args) {
        cuentraAtras(10);
        cuentaAtrasWhile(10);
    }
    private static void cuentraAtras(int i){
        if(i>0){
            System.out.println(i);
            cuentraAtras(i-1); // Caso Recursivo
        }else {
            System.out.println("Fin"); // Caso base
            System.out.println("Acaba llamada "+i);
        }
    }
    private static void cuentaAtrasWhile(int i){
        while (i > 0){
            System.out.println(i);
            i-=1;
        }
        System.out.println("Fin");
        System.out.println("Acaba llamada");
    }
}
