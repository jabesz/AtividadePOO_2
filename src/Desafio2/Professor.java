package Desafio2;

public class Professor extends Usuario{

    public String area;
    public Professor() {
    }

    public Professor(String name, String cargo, int age, String area) {
        super(name, cargo, age);
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }


    public Professor(String name, String cargo, int age) {
        super(name, cargo, age);
    }

    public Professor(String area) {
        this.area = area;
    }

}
