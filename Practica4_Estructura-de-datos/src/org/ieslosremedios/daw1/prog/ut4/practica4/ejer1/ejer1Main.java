package org.ieslosremedios.daw1.prog.ut4.practica4.ejer1;

public class ejer1Main {
    public static void main(String[] args) {
        // Creamos varios objetos geometricos
        Geometria circulo1=new Circulo(8.9d);
        Geometria circulo2=new Circulo(9.7d);
        Geometria circulo3=new Circulo(5.7d);

        Geometria cuadrado1 = new Cuadrado(8d);
        Geometria cuadrado2 = new Cuadrado(6d);

        Geometria triangulo1 = new Triangulo(8d, 10d, 10d);
        Geometria triangulo2 = new Triangulo(3d, 10d, 20d);

        // Creamos un array donde introduciremos todas la figuras geometricas creadas
        Geometria[] figurasGeo={circulo1,circulo2,circulo3,cuadrado1,cuadrado2,triangulo1,triangulo2};

        System.out.println("El area total comprendida en el array es de " + calcularAreaTotal(figurasGeo));
    }
    private static double calcularAreaTotal(Geometria[] calculoArea){
        //Variables para marcar la primera instancia de cada clase
        boolean primerCirculo = true;
        boolean primerCuadrado = true;
        boolean primerTrianguloIsos = true;

        double areaTotal = 0;
        for(int i = 0; i < calculoArea.length; i++){
            areaTotal += calculoArea[i].calcularArea();

            //Se usa instance of para comprobar que es la primera instancia de cada clase, en caso de serlo pondremos el booleano asignado en false y se coloreara en Azul como dicta el enunciado
            if (primerCirculo && calculoArea[i] instanceof Circulo){
                primerCirculo = false;
                ((Circulo) calculoArea[i]).colorear("Azul");
            }
            else if (primerCuadrado && calculoArea[i] instanceof Cuadrado){
                primerCuadrado = false;
                ((Cuadrado) calculoArea[i]).colorear("Azul");
            }
            else if (primerTrianguloIsos && calculoArea[i] instanceof Triangulo){
                primerTrianguloIsos = false;
                ((Triangulo) calculoArea[i]).colorear("Azul");
            }
        }
        return areaTotal;
    }
}
