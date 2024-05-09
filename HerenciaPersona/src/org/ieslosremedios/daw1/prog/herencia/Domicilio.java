package org.ieslosremedios.daw1.prog.herencia;

public class Domicilio {
    private static String calle="Salmo Imperito";//La ponemos en static para que todos los tipos de personas tengan la misma calle
    private String ciudad;
    private String provincia;
    private String codigoPostal;
    private String pais;

    public Domicilio(){
    }


    public Domicilio(String calle, String ciudad, String provincia, String codigoPostal, String pais){
        this.calle=calle;
        this.ciudad=ciudad;
        this.provincia=provincia;
        this.codigoPostal=codigoPostal;
        this.pais=pais;
    }

    public static String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }



    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }




}
