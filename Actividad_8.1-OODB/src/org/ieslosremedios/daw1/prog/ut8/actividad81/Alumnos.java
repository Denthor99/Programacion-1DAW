package org.ieslosremedios.daw1.prog.ut8.actividad81;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity (name = "Alumno")
public class Alumnos extends Persona{
    @Id
    private Integer id;
    private Ordenadores pc;
    private enum grupo{A,B,C};

}
