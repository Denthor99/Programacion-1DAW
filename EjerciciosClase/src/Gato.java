public class Gato {
    private String nombre;
    private static String raza = "Gato";

    Gato(String nombre){
        this.nombre= nombre;
    }
    String getNombre() {
        return nombre;
    }

    void setNombre(String nombre){
        this.nombre = nombre;
    }
}
