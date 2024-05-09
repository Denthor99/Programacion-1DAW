package Pruebas;

public class Persona {
    private String nombre;
    private String apellido1;
    private String apellido2;

    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setApellido1(String apellido1){
        this.apellido1=apellido1;
    }
    public void setApellido2(String apellido2){
        this.apellido2=apellido2;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellido1(){
        return apellido1;
    }
    public String getApellido2(){
        return apellido2;
    }
    public char MostrarInicial1(){
        return nombre.charAt(0);
    }
    public char MostrarInicial2(){
        return apellido1.charAt(0);
    }
    public char MostrarInicial3(){
        return apellido2.charAt(0);
    }

}
