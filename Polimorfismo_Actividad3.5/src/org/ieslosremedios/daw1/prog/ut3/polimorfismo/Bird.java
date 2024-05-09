package org.ieslosremedios.daw1.prog.ut3.polimorfismo;

public class Bird extends Animal implements Flyable{
    @Override
    void speak() {
        System.out.println("Pio Pio Piiiiiiiiiio");
    }

    @Override
    public void fly() {
        System.out.println("I Believe I can Fly!");
    }
}
