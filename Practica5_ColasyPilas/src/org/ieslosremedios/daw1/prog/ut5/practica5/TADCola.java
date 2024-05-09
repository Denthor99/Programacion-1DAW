package org.ieslosremedios.daw1.prog.ut5.practica5;
import java.util.*;
public class TADCola {
    private List cola=new LinkedList();

    public  void encolar(Object b){
        cola.add(b);
        System.out.println(b+ " se ha unido a la cola del cine");
    }
    public  void desencolar(){
        cola.remove(0);
    }
    public  void frente(){

        System.out.println("El primer elemento de la cola es: "+cola.get(0));
        System.out.println();
    }
    public void resto(){
        System.out.println("Quitando la primera poosición, la cola cuenta con los siguientes miembros:");
        for (int i = 1; i < cola.size(); i++) {
            System.out.println(cola.get(i));
        }
    }
    public void limpiar(){
        cola.clear();
        System.out.println("La cola se terminado de forma satisfactoria");
    }
    public boolean esVacia(){
        return cola.isEmpty();
    }
    public void longitud(){
        System.out.println();
        System.out.println("La longitud de la cola actualmente es de "+cola.size()+ " elementos");
        System.out.println();
    }
}
