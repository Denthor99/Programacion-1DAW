package daw1.prog.ut3.practica3;

public class Casa {
    private Integer precio;
    private Character califEnergetica;
    private String refrCatastral;
    private final Integer IVA=21;
    private final Integer IVARedux=16;
    protected Direcciones direccion2;

    Casa() {
    }

    Integer precioIva(Integer precio){
        Integer total1;
        total1=(precio*IVA/100)+precio;
        return total1;
    }

    Integer precioIvaRedux(Integer precio){
        Integer total2;
        total2=(precio*IVARedux/100)+precio;
        return total2;
    }

    void totalCasa(String refrCatastral, Integer precio){
        System.out.println(this.refrCatastral);
        System.out.println(this.precio);
        System.out.println(this.precioIva(this.precio));
        System.out.println(this.precioIvaRedux(this.precio));
    }

    public Direcciones getDireccion2() {
        return direccion2;
    }

    public void setDireccion2(Direcciones direccion2) {
        this.direccion2 = direccion2;
    }
}

