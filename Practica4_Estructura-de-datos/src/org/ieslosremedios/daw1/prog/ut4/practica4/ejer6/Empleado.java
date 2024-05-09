package org.ieslosremedios.daw1.prog.ut4.practica4.ejer6;

public class Empleado {
    private String codEmpleado;
    private String dni;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private int anoNacimiento;
    private boolean reducciónJornada;

    public Empleado(String codEmpleado, String dni, String nombre, String primerApellido, String segundoApellido, int anoNacimiento, boolean reducciónJornada) {
        this.codEmpleado = codEmpleado;
        this.dni = dni;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.anoNacimiento = anoNacimiento;
        this.reducciónJornada = reducciónJornada;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "Código de empleado='" + codEmpleado + '\'' +
                ", DNI='" + dni + '\'' +
                ", Nombre='" + nombre + '\'' +
                ", Primer Apellido='" + primerApellido + '\'' +
                ", Segundo Apellido='" + segundoApellido + '\'' +
                ", Año Nacimiento=" + anoNacimiento +
                ", Reducción Jornada=" + reducciónJornada +
                '}';
    }
}
