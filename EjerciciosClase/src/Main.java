public class Main {

    public static void main(String[] args) {

        System.out.println("Hello world!");
        saludar("Daniel"); //aparece string porque estas invocando un metodo
        //Gato ejercicio
        Gato botones = new Gato("Botones");
        System.out.println("Mi gato se llama " + botones.getNombre());
        Gato isidoro= new Gato("Isidoro");
        System.out.println("Mi gato se llama " + isidoro.getNombre());
        Gato patatuela = new Gato("Patatuela");
        System.out.println("Mi gato se llama " + patatuela.getNombre());

        //cambio nombre a botones
        botones.setNombre("Bolita de nieve");
        System.out.println("Mi gato ahora se llama "+ botones.getNombre());
    }
    public static void saludar (String nombre){ //los metodos estaticos no pueden hacer referencia a metodos no estaticos
        System.out.println("Hola: " + nombre );
    }
}