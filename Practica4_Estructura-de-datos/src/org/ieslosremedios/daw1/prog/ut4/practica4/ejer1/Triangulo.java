package org.ieslosremedios.daw1.prog.ut4.practica4.ejer1;

public class Triangulo extends Geometria implements Coloreable{
    private double base;
    private double altura;
    private double lados=3d;
    private String color;

    public Triangulo(double base, double altura, double lados) {
        this.base = base;
        this.altura = altura;
        this.lados = lados;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


    @Override
    public double calcularArea() {
        double area = base * altura /2;
        return area;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro =lados+base;
        return perimetro;
    }

    @Override
    public void colorear(String color) {
        this.color=color;
        System.out.println("Triangulo de color: " + color);
    }
}
