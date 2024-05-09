package org.ieslosremedios.daw1.prog.UT6.ejerciciosAlgoritmia;

import java.util.Arrays;

public class ProblemaCambioMoneda extends EsquemaVoraz{

    public ProblemaCambioMoneda(int[] monedas, int cambio) {
        this.monedas = monedas;
        this.cambio = cambio;
    }

    // Valores de entrada (Inputs)
    int[] monedas;
    int cambio;

    // Atributos internos del algoritmo
    int[] solucion;
    int candidato;
    int etapa;

    @Override
    protected void inicializa() {
        solucion=new int[monedas.length];
        Arrays.fill(solucion,0);
        candidato=0;
        etapa=0;
    }

    @Override
    protected boolean fin() {
        return etapa== monedas.length;
    }

    @Override
    protected void seleccionaYEliminaCandidato() {
        candidato = cambio / monedas[etapa];
    }

    @Override
    protected boolean esPrometedor() {
        return true;
    }

    @Override
    protected void anotaEnSolucion() {
        solucion[etapa]=candidato;
        cambio-=monedas[etapa]*candidato;
        etapa++;
    }
}
