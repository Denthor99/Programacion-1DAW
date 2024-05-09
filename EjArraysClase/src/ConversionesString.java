public class ConversionesString {
    public static void main(String[] args) {
        // Conversion de un valor String (envoltorio), a valor primitivo (int)
        // Con .parseInt, lo que estamos haciendo es analizar el contenido de la cadena, y acto seguido lo convierte en
        // un valor numerico
        int a= Integer.parseInt("12");
        System.out.println(a+2);

        // Realizamos lo mismo que lo anterior, pero esta vez con un tipo envoltorio Boolean,
        // Si nos fijamos, al añadir cualquier cosa que no sea "True/False", nos imprime por defecto false
        // A la fuerza tienes que añadir "True", para que el resultado sea "True"
        boolean boli=Boolean.parseBoolean("1");
        System.out.println(boli);

        // String y char no tienen esta funcion.
        // Lo que podemos hacer es indicar en que posición se encuentra x caracter de una cadena
        char c="abc".charAt(0);
        System.out.println(c);

        // Con Long también podemos realizar la conversion
        long largo=Long.parseLong("3458968365496453");
        System.out.println(largo-540842);

        // Con Double tambien podemos realizar la conversión
        double ddoble=Double.parseDouble("23.555556");
        System.out.println(ddoble-4.8);

        float flote=Float.parseFloat("3.34");
        System.out.println(flote-1.00);

        // Value of hace lo mismo que ParseInt, con la diferencia de que Value te pasa una cadena a un tipo envoltorio
        Integer num=Integer.valueOf("34");
        Double dobles=Double.valueOf("34.48320");

        // Pasamos de numerico a String
        String numelo=1+"";
        System.out.println(numelo);

        // String.value
        numelo=String.valueOf(14);

        // Envoltorio.toString()
        Integer.toString(32);

        // Ejercicio 1: Un numero entero primitivo de nombre num1 y valor 1
        System.out.println("");
        System.out.println("Ejercicio 1");
        int num1=1;

        //Un numero entero envoltorio de nombre num2 y valor 2
        Integer num2=2;

        // Imprimir valor de cadena de num1
        System.out.println(String.valueOf(num1));

        //Imprimir valor de tipo cadena de num2
        System.out.println(num2.toString());
        System.out.println(num2+"");
        System.out.println(String.valueOf(num2));


    }
}
