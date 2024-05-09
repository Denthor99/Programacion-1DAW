package herencia.familia;

public class Madre extends Abuela{
    String algo2;
    String algo3="Madre";

    public Madre(){}
    public Madre(String algo1) {
        super(algo1);
    }
    public Madre(String algo2, String algo3){
        super(algo2);
        this.algo3=algo3;
    }
    public void imprimeMadrecita(){
        System.out.println(super.algo2);
        System.out.println(this.algo3);
    }
    @Override
    public String getAlgo2() {
        return algo2;
    }

    @Override
    public void setAlgo2(String algo2) {
        this.algo2 = algo2;
    }

    public String getAlgo3() {
        return algo3;
    }

    public void setAlgo3(String algo3) {
        this.algo3 = algo3;
    }
}
