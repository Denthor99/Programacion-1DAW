public class EjerIfDiasSemana2 {
        public static void main(String[] args){
            Integer dia=7;
            if (dia==1){
                System.out.println("Inicio de semana");
            }else if (dia==2||dia==3||dia==4){
                System.out.println("Entre semana");
            }else if (dia==5){
                System.out.println("Final de semana lectiva");
            }else if (dia==6||dia==7){
                System.out.println("FINDE");
            }else{
                System.out.println("No hay mas dias de la semana");
            }
        }
}
