public class Switch {
    public static void main(String[] args) {
        Integer dia=5;
        switch (dia) {
            case 1: System.out.println("Es lunes");
                break;
            case 2: System.out.println("Es Martes");
                break;
            case 3: System.out.println("Es Miercoles");
                break;
            case 4: System.out.println("Es Jueves");
                break;
            case 5: System.out.println("Es Viernes");
                break;
            case 6: case 7:System.out.println("Es fin de semana");
                break;
            default: System.out.println("No hay más dias de la semana");
                break;
        }
    }
}
