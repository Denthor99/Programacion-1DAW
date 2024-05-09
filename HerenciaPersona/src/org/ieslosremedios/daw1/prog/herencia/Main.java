package org.ieslosremedios.daw1.prog.herencia;

public class Main {
    public static void main(String[] args) {
    //Objeto Persona
    Persona Laura=new Persona("Laura","Ordoñez",19,"22835631-J",1020245532);
    Laura.mostrarDatos();

    Persona Paco=new Persona();
    Paco.setNombre("Pacomer");

    //Herencia Personal
    Personal Roberto=new Personal("Roberto","Gomez",54,"32899601-X",1050275565,"Medicina Interna",3500);
    Roberto.mostrarDatosPersonal();
    Roberto.Experto();

    //Herencia Paciente
    Paciente Martin=new Paciente("Martin","Lopez",14,"37839532-K",1050275565,"09XC","Laura Corrido");
    Martin.mostrarDatosPaciente();
    }
}