package Pruebas;

public class MainPersona {
    public static void main(String[] args) {
        Persona Manute=new Persona();
        Manute.setNombre("Manute");
        Manute.setApellido1("Rodriguez");
        Manute.setApellido2("Fernandez");
        System.out.println(Manute.getNombre()+Manute.getApellido1()+Manute.getApellido2());
        System.out.print(Manute.MostrarInicial1()+""+Manute.MostrarInicial2()+""+Manute.MostrarInicial3());

    }
}
