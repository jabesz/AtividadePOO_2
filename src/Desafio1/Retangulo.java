package Desafio1;

public class Retangulo extends Geometria{

    private double base;
    private double height;

    public Retangulo(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public Retangulo(double base, double height, double raio, double base1, double height1) {
        super(base, height, raio);
        this.base = base1;
        this.height = height1;
    }

    public Retangulo() {
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void calcArea() {
        double areaRetangulo = base * height;
    }
}
