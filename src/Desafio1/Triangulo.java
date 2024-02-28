package Desafio1;

public class Triangulo extends Geometria{

    private double base;
    private double height;

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

    public Triangulo() {
    }

    public Triangulo(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public Triangulo(double base, double height, double raio, double base1, double height1) {
        super(base, height, raio);
        this.base = base1;
        this.height = height1;
    }

    @Override
    public void calcArea() {
        double areaTriangulo = (base * height) / 2;
    }
}