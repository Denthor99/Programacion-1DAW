package herencia.familia;

public class Main {
    public static void main(String[] args) {
        //Objeto abuela
        Abuela abuela1=new Abuela("Abuela1","Abuela2");
        abuela1.imprimeAbuela();

        //Objeto madre
        Madre madre1=new Madre("Madre1","Madre2");
        madre1.imprimeMadrecita();

        //Objeto hija
        Hija hija1=new Hija("hija1","hija2");
        hija1.imprimeHijita();
    }
}