public class EjerIfDiasSemana {
    public static void main(String[] args){
        Integer dia=7;
        if (dia==1){
            System.out.println("Hoy es Lunes");
        }else if (dia==2){
            System.out.println("Hoy es martes");
        }else if (dia==3){
            System.out.println("Hoy es Miercoles");
        }else if (dia==4){
            System.out.println("Hoy es Jueves");
        }else if (dia==5){
            System.out.println("Hoy es Viernes");
        }else if (dia==6||dia==7){
            System.out.println("FINDE");
        }else{
            System.out.println("No hay mas dias de la semana");
        }
    }
}
