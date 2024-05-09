package org.ieslosremedios.daw1.prog.ut5.practica5;

public class PilaMain {
    public static void main(String[] args) {
        // Como hicimos con las colas, haremos un ejemplo que puede pasar en la vida real:
        // Pepe es un aficionado de las novelas de ciencia ficción como Dune o Fahrenheit 451, por lo que compra
        // una gran cantidad de libros mensualmente. Al ser normalmente obras muy densas (y por ende, con muchas paginas)
        // de vez en cuando suele amontonarlas en una "pila", lo que le ha ocasionado varios problemas, como el que
        // contaré a continuación:
        // Quiere irse de vacaciones con su pareja a Conil, por lo que decide pillarse un libro para leer en esos días.
        // Tras mucho pensarlo, opta por elegir un clásico: "La Fundación". El problema radica en que, se encuentra en
        // medio de una enorme pila de libros. Aunque no le guste, deberá ir quitando los libros poco a poco.
        TADPila pilaMastodontica=new TADPila();

        // La pila en cuestión es:
        pilaMastodontica.apilar("El Mesías de Dune");
        pilaMastodontica.apilar("Dune");
        pilaMastodontica.apilar("Warhammer 40k: Los Primarcas");
        pilaMastodontica.apilar("Warhammer 40k: Legión");
        pilaMastodontica.apilar("La Fundación");
        pilaMastodontica.apilar("1984");
        pilaMastodontica.apilar("Un mundo feliz");
        pilaMastodontica.apilar("Fahrenheit 451");
        pilaMastodontica.apilar("El problema de los tres cuerpos");
        pilaMastodontica.apilar("Soy leyenda");
        pilaMastodontica.apilar("Hyperion");
        pilaMastodontica.apilar("The Martian");

        // Pepe pensaba que la pila era más pequeña, pensaba que habria como mucho 2 o 3 libros, pero...
        pilaMastodontica.longitud();

        // Pepe entonces se puso manos a la obra, podría coger el primer libro de la pila:
        System.out.println();
        pilaMastodontica.cima();

        // El estaba decidido en coger la fundación por lo que empezo a quitar varios libros
        pilaMastodontica.desapilar();
        pilaMastodontica.desapilar();
        pilaMastodontica.desapilar();
        pilaMastodontica.desapilar();
        pilaMastodontica.desapilar();
        pilaMastodontica.desapilar();

        // Pepe llego a uno de sus libros favoritos de toda su vida..
        System.out.println();
        pilaMastodontica.cima();

        // Pero ya estaba decidida la lectura vacacional, así que decidió seguir quitando libros hasta que encontró, el
        // ansiado libro.
        pilaMastodontica.desapilar();
        System.out.println();
        pilaMastodontica.cima();

        // Coge el libro y lo guarda en la mochila. La pila ha bajado considerablmente, pues..
        pilaMastodontica.desapilar();
        System.out.println();
        pilaMastodontica.longitud();

        // Decide terminar la faena y recoger todos los libros y guardarlos a otro sitio, por lo que la pila desaparece
        System.out.println();
        pilaMastodontica.limpiar();

        // Antes de terminar de preparar las cosas decide comprobar otra vez si quedaba algún libro restante, porque no
        // paraba de pensar..
        System.out.println();
        System.out.print("¿La pila esta recogida totalmente?");
        System.out.print(" "+pilaMastodontica.esVacia());
        System.out.println();


    }
}
