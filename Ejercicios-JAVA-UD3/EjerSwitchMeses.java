public class EjerSwitchMeses {
    //Dado un mes en una variable enumerada, mostrar por pantalla el numero de días que tiene. P.ej: Enero --> 31
    enum Meses{
        ENERO,
        FEBRERO,
        MARZO,
        ABRIL,
        MAYO,
        JUNIO,
        JULIO,
        AGOSTO,
        SEPTIEMBRE,
        OCTUBRE,
        NOVIEMBRE,
        DICIEMBRE
    }
    public static void main(String[] args) {
        Meses diasDelMes=Meses.FEBRERO;
        switch (diasDelMes) {
            case ENERO:System.out.println("Enero--> 31");
                break;
            case FEBRERO:System.out.println("Febrero--> 28 o 29 (año bisiesto)");
                break;
            case MARZO:System.out.println("Marzo--> 31");
                break;
            case ABRIL:System.out.println("Abril--> 30");
                break;
            case MAYO:System.out.println("Mayo--> 31");
                break;
            case JUNIO:System.out.println("Junio--> 30");
                break;
            case JULIO:System.out.println("Julio--> 31");
                break;
            case AGOSTO:System.out.println("Agosto--> 31");
                break;
            case SEPTIEMBRE:System.out.println("Septiembre--> 30");
                break;
            case OCTUBRE:System.out.println("Octubre--> 31");
                break;
            case NOVIEMBRE:System.out.println("Noviembre-> 30");
                break;
            case DICIEMBRE:System.out.println("Diciembre-> 31");
                break;
            default:System.out.println("No hay mas meses en el año");
                break;
        }
    }
}

