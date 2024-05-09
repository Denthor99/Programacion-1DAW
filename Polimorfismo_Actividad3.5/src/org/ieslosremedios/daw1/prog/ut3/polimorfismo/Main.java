package org.ieslosremedios.daw1.prog.ut3.polimorfismo;

public class Main {
    public static void main(String[] args) {
        // Animales
        Animal s;
        s=new Lion();
        s.speak();

        // Con la misma variable, creamos un pajaro
        s=new Bird();
        s.speak();
        ((Bird)s).fly();

        // Instrumentos
        Instrumento sol;
        sol=new Guitarra();
        sol.tocar();

        // Con la misma variable, creamos un tambor
        sol=new Tambor();
        sol.tocar();
    }
}