package org.ieslosremedios.daw1.prog.ut5.actividad52;

import java.util.*;
public class Actividad52Main{

    public static void main(String[] args) {
        System.out.println("           Lista de Tareas   ");
        TaskList tareas=new TaskList("LinkedList");
        System.out.println("         Opciones disponibles");
        System.out.println("________________________________________");
        System.out.println("1. Agrega una nueva tarea a la lista");
        tareas.addTask("Tomar apuntes");
        tareas.addTask("Apuntar posibles dudas");
        tareas.addTask("Realizar los ejercicios correspondientes");
        tareas.addTask("Preguntar las dudas al profesor");
        tareas.addTask("Estudiar para el examen");
        System.out.println();
        System.out.println("2. Eliminar una tarea de la lista");
        tareas.removeTask("Preguntar las dudas al profesor");
        tareas.removeTask("Apuntar posibles dudas");
        System.out.println();
        System.out.println("3. Completar alguna de las tareas");
        tareas.completeTask("Tomar apuntes");
        System.out.println();
        System.out.println("4. Imprimir todas las tareas");
        for (String e:
                tareas.getTasks()) {
            System.out.println(e);
        }



    }
}