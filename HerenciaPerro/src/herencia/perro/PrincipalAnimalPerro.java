package herencia.perro;

public class PrincipalAnimalPerro {
    public static void main(String[] args) {
        Perro dogo=new Perro();
        dogo.setNombre("Toby");
        dogo.setRaza("Podenco");
        System.out.println("Guau! me llamo "+dogo.getNombre()+" y soy un "+dogo.getRaza());
        dogo.perro();
        dogo.imprimePorPartes();

        Perro dogo2=new Perro("Chihuahua");
        dogo2.imprimePorPartes();

        Perro dogo3=new Perro("Pitty","Chihuahua");
        dogo3.imprimePorPartes();
    }
}