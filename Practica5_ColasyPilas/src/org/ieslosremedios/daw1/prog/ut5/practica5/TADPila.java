package org.ieslosremedios.daw1.prog.ut5.practica5;

import java.util.*;

public class TADPila {
    private List pila=new LinkedList();

    public  void apilar(Object b){
        pila.add(b);
    }
    public  void desapilar(){
        pila.remove(pila.size()-1);
    }
    public  void cima(){
        System.out.println("El primer libro es "+pila.get(pila.size()-1));
    }
    public void limpiar(){
        pila.clear();
        System.out.println("Pila borrada satisfactoriamente");
    }
    public boolean esVacia(){
        return pila.isEmpty();
    }
    public void longitud(){
        System.out.println("Actualmente la pila tiene una longitud de "+pila.size());
    }
}
