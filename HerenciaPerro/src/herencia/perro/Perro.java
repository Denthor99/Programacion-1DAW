package herencia.perro;

public class Perro extends Animal{
    private String raza;
    public Perro(){}
    public Perro(String raza){
        this.raza=raza;
    }
    public Perro(String nombre, String raza){
        super(nombre);
        this.raza=raza;
    }
    public void perro(){
        System.out.println("Guau! me llamo "+nombre+" y soy un "+raza);
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void imprimePorPartes(){
        super.imprime();
        System.out.println(" y soy un "+raza);

    }
}
