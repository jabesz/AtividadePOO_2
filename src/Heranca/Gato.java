package Heranca;

public class Gato extends Animal{

    private String miar;
    
    private String corPelo;

    public String getMiar() {
        return miar;
    }

    public void setMiar(String miar) {
        this.miar = miar;
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    public Gato(String name, int age) {
        super(name, age);
    }

}
