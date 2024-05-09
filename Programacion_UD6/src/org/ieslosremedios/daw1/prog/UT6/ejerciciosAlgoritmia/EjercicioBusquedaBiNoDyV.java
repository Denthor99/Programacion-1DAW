package org.ieslosremedios.daw1.prog.UT6.ejerciciosAlgoritmia;

import java.util.Arrays;

public class EjercicioBusquedaBiNoDyV {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int parametro=19;
        int pos=dyv(a,parametro);
        System.out.println("El elemento "+parametro+" se encuentra en la posición "+pos);

    }
    private static int dyv(int[] a, int parametro){
        int pos=a.length/2;
        if(parametro==a[pos]){
            return pos;
        } else if (parametro>a[pos]){
            return pos +1+dyv(Arrays.copyOfRange(a,pos+1,a.length),parametro);
        } else
            return dyv(Arrays.copyOfRange(a,0,pos),parametro);


    }

}
