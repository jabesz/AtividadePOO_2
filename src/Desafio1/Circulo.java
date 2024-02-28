package Desafio1;

public class Circulo extends Geometria{

    private double raio;

    public Circulo(double raio, double pi) {
        this.raio = raio;
        this.pi = pi;
    }

    public Circulo(double base, double height, double raio, double raio1, double pi) {
        super(base, height, raio);
        this.raio = raio1;
        this.pi = pi;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    private double pi = 3.14;

    @Override
    public void calcArea() {
        double calcAreaCirculo = Math.PI * Math.pow(raio, 2);
    }

}
