package Classe;

public class Pessoa {
    private String name;
    private int  age;
    private String endereco;

    public String getName() {
        return name;
    }

    public Pessoa(String name, int age, String endereco) {
        this.name = name;
        this.age = age;
        this.endereco = endereco;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
