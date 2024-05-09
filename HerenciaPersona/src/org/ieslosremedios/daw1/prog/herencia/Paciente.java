package org.ieslosremedios.daw1.prog.herencia;

public class Paciente extends Persona{
    private String Cita;
    private String medicoAsignado;

    public Paciente(){

    }

    public Paciente(String nombre, String apellido, Integer edad, String nif, Integer nss, String Cita, String medicoAsignado){
        super();
        this.Cita=Cita;
        this.medicoAsignado=medicoAsignado;
    }
    public void mostrarDatosPaciente(){
        System.out.println("Cita del Paciente: "+Cita);
        System.out.println("Medico Asignado al Paciente: "+medicoAsignado);
    }
    public String getCita(){
        return Cita;
    }
    public void setCita(String cita){
        this.Cita=Cita;
    }

    public String getMedicoAsignado(){
        return medicoAsignado;
    }
    public void setMedicoAsignado(String medicoAsignado){
        this.medicoAsignado=medicoAsignado;
    }
}
