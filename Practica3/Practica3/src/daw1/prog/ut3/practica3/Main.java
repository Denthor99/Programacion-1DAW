package daw1.prog.ut3.practica3;

public class Main {
    public static void main(String[] args) {

        Alumnos alumno1=new Alumnos("Daniel","Alvan Perez",22);
        System.out.println("Hola, me llamo "+alumno1.getNombre()+" "+alumno1.getApellidos()+", y tengo "+alumno1.getEdad()+" años.");
        Direcciones direccion1=new Direcciones();
        direccion1.setCalle("Calle Laura Pausinni, Nº ");
        direccion1.setNumero(32);
        direccion1.setCodigoPostal(12645);
        direccion1.setLocalidad("Jerez de la Frontera");
        direccion1.setProvincia("Cadiz");
        System.out.println("Vivo en la "+direccion1.getCalle()+""+direccion1.getNumero()+ " en "+direccion1.getLocalidad()+", "+direccion1.getProvincia()+" cuyo codigo postal es "+direccion1.getCodigoPostal());
        direccion1.direccionCompleta("Paco Vega","Algerciras");
        direccion1.direccionCompleta();
        //Media
        Alumnos alumno2=new Alumnos();
        alumno1.setNotaMedia(7.32f);
        alumno2.setNotaMedia(9.78f);
        float resultado=alumno1.notaMedia(alumno1.getNotaMedia(), alumno2.getNotaMedia());
        System.out.println("La nota media mayor es de un =" +resultado);
    }
}