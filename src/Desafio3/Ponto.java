package Desafio3;

public class Ponto {
    private double x;

    private double y;
    public Ponto() {
    }

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void calcDistance(Ponto otherPoint) {
        double deltaX = this.x - otherPoint.x;
        double deltaY = this.y - otherPoint.y;

        double distance = Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

}
