package entities;

public class Professor extends User {
    private double salario;
    private String disciplina;

    public Professor() {

    }

    public Professor(String name, String email, String senha, double salario, String disciplina) {
        super(name, email, senha);
        this.salario = salario;
        this.disciplina = disciplina;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public String toString() {
        return "[Nome: " + getName() +
                ", Email: " + getEmail() +
                ", Senha: " + getSenha() +
                ", Salario: " + getSalario() +
                ", Disciplina: " + getDisciplina() + "]";
    }

}
