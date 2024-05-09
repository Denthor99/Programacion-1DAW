package org.ieslosremedios.daw1.prog.ut5.actividad52;

import java.util.*;

public class TaskList {
    private List<String> listaTareas;

    public TaskList(List<String> listaTareas) {
        listaTareas=new ArrayList<>();
    }

    public TaskList(String tipoLista) {
        if (tipoLista.equalsIgnoreCase("ArrayList")){
            listaTareas=new ArrayList<String>();
        }else{
            listaTareas=new LinkedList<>();
        }
    }

    public void addTask(String task){
        listaTareas.add(task);
        System.out.println("Tarea añadida: "+task);
    }

    public  void removeTask(String task){
        listaTareas.remove(task);
        System.out.println("Tarea eliminada: "+task);
    }
    public  void completeTask(String task){
        String completado="Tarea completada: ["+ task +"]";
        listaTareas.set(listaTareas.indexOf(task), completado);
        System.out.println(completado);
    }

    public  String[] getTasks(){
        String [] array=new String[listaTareas.size()];
        array=listaTareas.toArray(array);
        return array;
    }

}
