package daw1.prog.ut3.practica3;

public class Direcciones {
    private String calle;
    private Integer numero;
    private String puerta;
    private Integer codigoPostal;
    private String localidad;
    private String provincia;

    Direcciones(){}

    Direcciones(String calle, Integer numero, String puerta, Integer codigoPostal, String localidad, String provincia) {
        this.calle = calle;
        this.numero = numero;
        this.puerta = puerta;
        this.codigoPostal = codigoPostal;
        this.localidad = localidad;
        this.provincia = provincia;
    }

    Direcciones(String calle, Integer numero, String puerta, String localidad) {
        this.calle = calle;
        this.numero = numero;
        this.puerta = puerta;
        this.localidad = localidad;
    }

    Direcciones(String calle, Integer numero, Integer codigoPostal, String localidad, String provincia) {
        this.calle = calle;
        this.numero = numero;
        this.codigoPostal = codigoPostal;
        this.localidad = localidad;
        this.provincia = provincia;
    }
    void direccionCompleta(){
        System.out.println("Vive en " + getCalle() + " " + getNumero() + " " + getPuerta() + " " + getCodigoPostal() + " " + getLocalidad() + " " + getProvincia());
    }
    void direccionCompleta(String calle, String localidad){
        System.out.println("Vive en " + getCalle() + " " + getLocalidad());
    }
    String getCalle() {
        return calle;
    }

    void setCalle(String calle) {
        this.calle = calle;
    }

    Integer getNumero() {
        return numero;
    }

    void setNumero(Integer numero) {
        this.numero = numero;
    }

    String getPuerta() {
        return puerta;
    }

    void setPuerta(String puerta) {
        this.puerta = puerta;
    }

    public Integer getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(Integer codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
}
