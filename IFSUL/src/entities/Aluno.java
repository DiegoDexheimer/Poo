package entities;

public class Aluno extends User {
    private String matricula;
    private int idade;

    public Aluno() {

    }

    public Aluno(String name, String email, String senha, String matricula, int idade) {
        super(name, email, senha);
        this.matricula = matricula;
        this.idade = idade;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "[Nome: " + getName() +
                ", Email: " + getEmail() +
                ", Senha: " + getSenha() +
                ", Matricula: " + getMatricula() +
                ", Idade: " + getIdade() + "]";
    }
}
