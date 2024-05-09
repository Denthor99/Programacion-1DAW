package herencia.familia;

public class Hija extends Madre{
    String algo3;
    String algo4;

    public Hija(){}
    public Hija(String algo3){
        super(algo3);
    }
    public Hija(String algo3, String algo4){
        this.algo3=algo3;
        this.algo4=algo4;
    }

    public void imprimeHijita(){
        System.out.println(super.algo3);
        System.out.println(this.algo4);
    }
    @Override
    public String getAlgo3() {
        return algo3;
    }

    @Override
    public void setAlgo3(String algo3) {
        this.algo3 = algo3;
    }

    public String getAlgo4() {
        return algo4;
    }

    public void setAlgo4(String algo4) {
        this.algo4 = algo4;
    }
}
