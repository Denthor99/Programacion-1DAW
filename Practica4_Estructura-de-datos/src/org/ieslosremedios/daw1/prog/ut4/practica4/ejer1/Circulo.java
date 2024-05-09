package org.ieslosremedios.daw1.prog.ut4.practica4.ejer1;

public class Circulo extends Geometria implements Coloreable{
    private double radio;
    private String color;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }



    @Override
    public void colorear(String color) {
        this.color=color;
        System.out.println("Circulo de color: "+color);
    }

    @Override
    public double calcularArea() {
        double area=Math.PI*(Math.pow(radio,2));
        return area;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro=(double)2*Math.PI*radio;
        return perimetro;
    }
}
