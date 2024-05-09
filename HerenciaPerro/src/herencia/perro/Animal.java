package herencia.perro;

public class Animal {
    protected String nombre;
    public Animal(){}
    public Animal(String nombre){
        this.nombre=nombre;
    }
    public void imprime(){
        System.out.println("Guau! me llamo "+nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
