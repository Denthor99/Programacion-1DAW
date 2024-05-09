public class EjerTablasMultiplicarSalto {
    public static void main(String[] args) {
        for (int i=1;i<=10;i++){
            System.out.print("Tabla del "+ i+"\t");
        } System.out.print("\n");
          for (int i=1;i<=10;i++){
                for (int j=0;j<=10;j++)
                System.out.print(j+" x "+i+"="+(i*j)+"\t");
        }
        System.out.print("\n");
    }
}
