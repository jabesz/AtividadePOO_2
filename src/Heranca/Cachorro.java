package Heranca;

public class Cachorro extends Animal{

    private String latir;
    private String lamber;

    private String corPelo;

    public String getLatir() {
        return latir;
    }

    public void setLatir(String latir) {
        this.latir = latir;
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    public String getLamber() {
        return lamber;
    }

    public void setLamber(String lamber) {
        this.lamber = lamber;
    }

    public Cachorro(String name, int age) {
        super(name, age);
    }
}
