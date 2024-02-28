package Heranca2;

public class Veiculo {
    private int rodas;
    private String farol;
    private String buzina;

    public Veiculo(int rodas, String farol, String buzina) {
        this.rodas = rodas;
        this.farol = farol;
        this.buzina = buzina;
    }

    public int getRodas() {
        return rodas;
    }

    public void setRodas(int rodas) {
        this.rodas = rodas;
    }

    public String getFarol() {
        return farol;
    }

    public void setFarol(String farol) {
        this.farol = farol;
    }

    public String getBuzina() {
        return buzina;
    }

    public void setBuzina(String buzina) {
        this.buzina = buzina;
    }
}
