package daw1.prog.UT3.abstrac;

public class MainPrincipal {
    public static void main(String[] args) {

        //Humano habla y duerme
        Humano paco=new Humano();
        Integer numPatasHumano=paco.getNumPata();
        System.out.println("El humano tiene "+ numPatasHumano + " patas");
        System.out.println("Es mamifero? "+paco.esMamifero());
        System.out.println("El humano habla: "+ paco.hablar());
        System.out.print("El humano duerme: ");
        paco.dormir();
        System.out.println("");

        //Gato maulla y duerme
        Gato misifus=new Gato();
        Integer numPatasGato= misifus.getNumPata();
        System.out.println("El gato tiene "+ numPatasGato+" patas");
        System.out.println("El gato maulla: "+ misifus.hablar());
        System.out.print("El gato duerme: ");
        misifus.dormir();
        System.out.println("");

        //
        Perro lucas=new Perro();
        Integer numPatas= lucas.getNumPata();
        System.out.println("El perro tiene "+numPatas+ " patas");
        System.out.println("El perro ladra: "+lucas.hablar());
        System.out.print("El perro duerme: ");
        lucas.dormir();
        System.out.println("");

    }
}
