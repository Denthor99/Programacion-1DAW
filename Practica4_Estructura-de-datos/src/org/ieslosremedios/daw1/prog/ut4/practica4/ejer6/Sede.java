package org.ieslosremedios.daw1.prog.ut4.practica4.ejer6;

public class Sede {
    String localizacion;
    String departamento1;
    String departamento2;
    String departamento3;

    Sede(){}

    Sede(String localizacion, String departamento1, String departamento2, String departamento3){
        this.localizacion = localizacion;
        this.departamento1 = departamento1;
        this.departamento2 = departamento2;
        this.departamento3 = departamento3;
    }

    @Override
    public String toString() {
        return "Sede{" +
                "Localización=' " + localizacion + '\'' +
                ", Departamento Numº 1=' " + departamento1 + '\'' +
                ", Depatramento Numº 2=' " + departamento2 + '\'' +
                ", Departamento Numº 3=' " + departamento3 + '\'' +
                '}';
    }
}
