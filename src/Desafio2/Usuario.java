package Desafio2;

public class Usuario {

    private String name;
    private String cargo;
    private int age;

    public Usuario() {
    }

    public Usuario(String name, String cargo, int age) {
        this.name = name;
        this.cargo = cargo;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
