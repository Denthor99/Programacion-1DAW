package daw1.prog.ut3.practica3;

public class Alumnos {
    private String nombre;
    private String apellidos;
    private Integer edad;
    private String repetidor;
    private float notaMedia;
    private String correoElectronico;
    protected Direcciones direccion1;

    Alumnos(){
    }
    Alumnos(String nombre, String apellidos, Integer edad){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.edad=edad;
    }
    float notaMedia(float a,float b){
        float mayor;
        mayor=Math.max(a,b);
        return mayor;
    }

    public Direcciones getDireccion1() {
        return direccion1;
    }

    public void setDireccion1(Direcciones direccion1) {
        this.direccion1 = direccion1;
    }

    String getNombre() {
        return nombre;
    }

    void setNombre(String nombre) {
        this.nombre = nombre;
    }

    String getApellidos() {
        return apellidos;
    }

    void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    Integer getEdad() {
        return edad;
    }

    void setEdad(Integer edad) {
        this.edad = edad;
    }

    String getRepetidor() {
        return repetidor;
    }

    void setRepetidor(String repetidor) {
        this.repetidor = repetidor;
    }

    float getNotaMedia() {
        return notaMedia;
    }

    void setNotaMedia(float notaMedia) {
        this.notaMedia = notaMedia;
    }

    String getCorreoElectronico() {
        return correoElectronico;
    }

    void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

}
