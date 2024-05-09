package org.ieslosremedios.daw1.prog.ut4.practica4.ejer1;

public class Cuadrado extends Geometria implements Coloreable{
    private double lado;
    private String color;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        double area=lado*lado;
        return area;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro=lado+lado+lado+lado;
        return perimetro;
    }

    @Override
    public void colorear(String color) {
        this.color=color;
        System.out.println("Cuadrado de color: "+color);
    }
}
