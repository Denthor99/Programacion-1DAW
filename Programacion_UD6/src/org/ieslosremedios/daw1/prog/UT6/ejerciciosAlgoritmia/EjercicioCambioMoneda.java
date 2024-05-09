package org.ieslosremedios.daw1.prog.UT6.ejerciciosAlgoritmia;

import java.util.Arrays;

public class EjercicioCambioMoneda {
    public static void main(String[] args) {
        // Valores de entrada (Inputs)
        int[] monedas={50,20,10,5,1};
        int cambio=104;

        // Atributos internos del algoritmo
        int[] solucion;
        int candidato;
        int etapa;
        ProblemaCambioMoneda pcm=new ProblemaCambioMoneda(monedas,cambio);
        pcm.voraz();
        System.out.println(Arrays.toString(pcm.solucion));
    }
}
