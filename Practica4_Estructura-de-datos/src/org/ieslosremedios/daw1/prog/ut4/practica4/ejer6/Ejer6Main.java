package org.ieslosremedios.daw1.prog.ut4.practica4.ejer6;

import java.util.Arrays;

public class Ejer6Main {
    public static void main(String[] args) {
        /**
         * Supón que tu empresa se va a hacer cargo del desarrollo de un programa para el registro de datos de los
         * trabajadores de una compañía. Esta tiene varias sedes que están identificadas por el nombre de la ciudad en
         * la que residen (hasta el momento Madrid, Barcelona, Valencia y Oviedo). En cada sede hay varios departamentos,
         * algunos de los cuales están repetidos entre varias sedes, a los que pertenecen los diferentes empleados. Hasta
         * el momento los departamentos existentes en todas las sedes son Ventas, RR. HH. y Producción. De cada empleado
         * es importante almacenar el código de empleado, DNI, nombre, primer apellido, segundo apellido, año de nacimiento
         * (numérico) y si tiene concedida, o no, reducción de jornada (booleano). Diseña la estructura que almacenará los
         * datos de la compañía y escribe el código fuente del programa que permita comenzar a registrar la información de los empleados.
         * */

        Sede primeraSede=new Sede("Madrid","Ventas","RR.HH.","Producción");
        Sede segundaSede = new Sede("Barcelona", "Ventas", "RR.HH.", "Producción");
        Sede terceraSede = new Sede("Valencia", "Ventas", "RR.HH.", "Producción");
        Sede cuartaSede = new Sede("Oviedo", "Ventas", "RR.HH.", "Producción");

        Empleado numeroUno=new Empleado("DRS270899","3216601X","Daniel Alfonso","Rodríguez","Santos",1999,false);
        Empleado numeroDos=new Empleado("JBM081269","10912384Z","José","Borrico","Méndez",1959,true);

        Sede[] sedesActuales={primeraSede,segundaSede,terceraSede,cuartaSede};
        Empleado[] empleados={numeroUno,numeroDos};

        System.out.println("Sedes actuales:");
        System.out.println(Arrays.toString(sedesActuales));

        System.out.println("Empleados nuevos incluidos en la plantilla: ");
        System.out.println(Arrays.toString(empleados));
    }
}
