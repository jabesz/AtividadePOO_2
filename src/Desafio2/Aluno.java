package Desafio2;

public class Aluno extends Usuario{

    private int matricula;

    public Aluno() {
    }

    public Aluno(String name, String cargo, int age, int matricula) {
        super(name, cargo, age);
        this.matricula = matricula;
    }

    public Aluno(String name, String cargo, int age) {
        super(name, cargo, age);
    }

    public Aluno(int matricula) {
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

}
