package daw1.prog.UT3.abstrac;

abstract class Animal {
    Boolean mamifero;
    abstract Integer getNumPata();
    Boolean esMamifero(){
        return mamifero;
    }
    void dormir(){
        System.out.println("Zzzzzzzzzzz");
    }
    abstract String hablar();
}
