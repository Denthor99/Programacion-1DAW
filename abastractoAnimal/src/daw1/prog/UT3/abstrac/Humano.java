package daw1.prog.UT3.abstrac;

public class Humano extends Animal{
    Boolean mamifero=true;
    Integer numPata=2;
    //Metodo abstracto heredado de animal
    @Override
    Integer getNumPata() {
        return numPata;
    }
    Boolean esMamifero(){
        return mamifero;
    }

    @Override
    String hablar() {
        String hablar="hola";
        return hablar;
    }

    @Override
    void dormir() {
        super.dormir();
    }
}
