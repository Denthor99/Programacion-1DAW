import java.util.Arrays;

public class ImprimirArray2 {
    public static void main(String[] args) {
        String [] [] nombre={{"Fran", "Victor", "Jorge"},{"Juanma", "Daniel", "David"},{"Pepe", "Juanma", "Antonio"}};
        for (int i=0; i<nombre.length;i++) {
            System.out.println(Arrays.toString(nombre[i]));
        }
        for (int i=0; i<nombre.length;i++){
            for (int j=0;j<nombre[i].length;j++){
                System.out.println(nombre[i][j]);
            }
        }

        listarNombresWhile(nombre);
    }
    public static void listarNombresWhile(String[][]a){
        int i=0;
        while (i<a.length){
            int j=0;
            while (j<a[i].length){
                System.out.println(a[i][j]);
                j++;
            }
            i++;
        }
    }

}

