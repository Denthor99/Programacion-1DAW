package daw1.prog.UT3.abstrac;

public class Gato extends Animal{
    final static Integer NUMPATA=4;
    @Override
    Integer getNumPata() {
        return NUMPATA;
    }

    Boolean esMamifero(){
        return mamifero;
    }

    @Override
    String hablar() {
        String hablar="Miau";
        return hablar;
    }
    // Realmente no es necesario añadir el metodo heredado dormir para usarlo, ya que es común para todas las subclases
    @Override
    void dormir() {
        super.dormir();
    }
}
