package Classe;

public class Aluno {
    String name;
    String curso;
    int matricula;

    public java.lang.String getName() {
        return name;
    }

    public Aluno(String name, String curso, int matricula) {
        this.name = name;
        this.curso = curso;
        this.matricula = matricula;
    }


    public void setName(java.lang.String name) {
        this.name = name;
    }

    public java.lang.String getCurso() {
        return curso;
    }

    public void setCurso(java.lang.String curso) {
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}

