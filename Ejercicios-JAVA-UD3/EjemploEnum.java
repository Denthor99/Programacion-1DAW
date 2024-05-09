public class EjemploEnum {
    enum Dia{
        LUNES,
        MARTES, 
        MIERCOLES, 
        JUEVES, 
        VIERNES, 
        SABADO, 
        DOMINGO
    }
    public static void main(String[] args) {
        
        Dia diaDeHoy = Dia.MIERCOLES;
        switch (diaDeHoy) {
            case LUNES: System.out.println("Es lunes");
                break;
            case MARTES: System.out.println("Es Martes");
                break;
            case MIERCOLES: System.out.println("Es Miercoles");
                break;
            case JUEVES: System.out.println("Es Jueves");
                break;
            case VIERNES: System.out.println("Es Viernes");
                break;
            case SABADO: case DOMINGO: System.out.println("Es fin de semana");
                break;
            default: System.out.println("No hay más dias de la semana");
                break;
        }
    }   
}
