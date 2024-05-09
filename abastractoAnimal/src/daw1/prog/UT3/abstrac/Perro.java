package daw1.prog.UT3.abstrac;

public class Perro extends Animal{
    Integer numPata=4;

    @Override
    Integer getNumPata() {
        return numPata;
    }
    Boolean esMamifero(){
        return mamifero;
    }

    @Override
    String hablar() {
        String hablar="Guau";
        return hablar;
    }

    @Override
    void dormir() {
        super.dormir();
    }
}
