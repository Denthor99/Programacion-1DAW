import java.util.Arrays;

public class CopiaDeArrays {
    public static void main(String[] args) {
        //Usamos el metodo clone, que se encuentra en la clase object
        // Vamos a crear un array
        int[]a ={1,2,3,4};
        //Creamos otro array, y usamos el metodo clone
        int[]b=a.clone();
        a[0]=7;
        //Hemos hecho una clonación superficial, ya que hemos copiado la referencia.
        //Por eso al modificar el array a, no afecta al array b, pues la referencia ha sido copiada antes al cambio
        System.out.println(Arrays.toString(a));
        System.out.println(a);
        System.out.println(Arrays.toString(b));
        System.out.println(b);

        //Haremos lo mismo, pero con tipo objetos. Usaremos por ejemplo, la clase persona
        PersonaArray p1=new PersonaArray("Mateo");
        PersonaArray p2=new PersonaArray("Lucas");
        PersonaArray p3=new PersonaArray("Roberto");
        //Creamos un array de objetos
        PersonaArray[] personas={p1,p2,p3};
        //Creamos otro array de objetos y copiamos ahí el contenido del anterior
        PersonaArray[] otrasPersonas=personas.clone();
        System.out.println(Arrays.toString(personas));
        System.out.println(personas);
        System.out.println(Arrays.toString(otrasPersonas));
        System.out.println(otrasPersonas);
        //Creamos un bucle for each, que nos devolverá el contenido
        //El funcionamiento del for each es el siguiente:
        // 1. Indicamos el tipo de objeto con el que vamos a iterar, y añadimos el objeto
        for (PersonaArray p:personas) {
            System.out.println(p.nombre);
        }
        //Hacemos otro bucle, esta vez con un for i
        for (int i = 0; i < personas.length; i++) {
            System.out.println(personas[i].nombre);
        }

        //Para poder copiar "de forma profunda" un array
        int[]original={1,2,3,4,5,6,7,8,9};
        //Copiaremos el array
        int[]copia=Arrays.copyOf(original,9);
        //
        int[]otraCopia=Arrays.copyOfRange(original,4,8);
    }
}
