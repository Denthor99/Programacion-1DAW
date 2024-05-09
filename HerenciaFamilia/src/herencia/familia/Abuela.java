package herencia.familia;

public class Abuela {
    protected String algo1;
    protected String algo2="Abuela";

    public Abuela(){}

    public Abuela(String algo1){
        this.algo1 = algo1;
    }
    public Abuela(String algo1,String algo2) {
        this.algo1 = algo1;
        this.algo2= algo2;
    }
    public void imprimeAbuela(){
        System.out.println(this.algo1);
        System.out.println(this.algo2);
    }

    public String getAlgo1() {
        return algo1;
    }

    public void setAlgo1(String algo1) {
        this.algo1 = algo1;
    }

    public String getAlgo2() {
        return algo2;
    }

    public void setAlgo2(String algo2) {
        this.algo2 = algo2;
    }
}
