package org.ieslosremedios.daw1.prog.UT6.ejerciciosAlgoritmia;

public abstract class EsquemaVoraz {
    public void voraz(){
        inicializa();
        while(!fin()){
            seleccionaYEliminaCandidato();
            if (esPrometedor()){
                anotaEnSolucion();
            }
        }
    }

    protected abstract void inicializa();

    protected abstract boolean fin();

    protected abstract void seleccionaYEliminaCandidato();

    protected abstract boolean esPrometedor();

    protected abstract void anotaEnSolucion();


}
