package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.*;

public class SistemaCadastro {

    public static void main(String[] args) {

        List<User> usuarios = new ArrayList<>();
        usuarios.add(new Aluno("Diego", "diego@test", "1234", "074240", 19));
        usuarios.add(new Professor("Remor", "remor@test", "1234", 15000, "POO"));
        start(usuarios);
    }

    public static void start(List<User> usuarios) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Selecione uma das opcoes:");
        System.out.println("1 - Login");
        System.out.println("2 - Cadastro aluno");
        System.out.println("3 - Cadastro professor");
        System.out.println("4 - Listar usuarios(Alunos e professores)");
        System.out.println("0 - Sair");

        int escolha = sc.nextInt();

        switch (escolha) {
            case 1:
                login(usuarios);
                break;

            case 2:
                cadastroAluno(usuarios);
                break;

            case 3:
                cadastroProfessor(usuarios);

            case 4:
                listarUsuarios(usuarios);

            case 0:
                break;

            default:
                System.out.println("Erro");
                break;
        }
        sc.close();
    }

    private static void listarUsuarios(List<User> usuarios) {
        usuarios.forEach(user -> {
            System.out.println(user);
        });
        start(usuarios);
    }

    public static void login(List<User> usuarios) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Senha: ");
        String senha = sc.nextLine();

        for (User u: usuarios) {
            System.out.println(u.getEmail());
            if (u.getEmail().equals(email) && u.getSenha().equals(senha)) {
                System.out.println("Usuario logado com sucesso.");
                System.out.println(u);
            }
        }
        
        start(usuarios);
        sc.close();
    }

    public static void cadastroAluno(List<User> usuarios) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe seu nome: ");
        String name = sc.nextLine();
        System.out.print("Informe seu email: ");
        String email = sc.nextLine();
        System.out.print("Informe uma senha: ");
        String senha = sc.nextLine();
        System.out.print("Informe sua matricula: ");
        String matricula = sc.nextLine();
        System.out.print("Informe sua idade: ");
        int idade = sc.nextInt();

        usuarios.add(new Aluno(name, email, senha, matricula, idade));
        start(usuarios);
        sc.close();
    }

    public static void cadastroProfessor(List<User> usuarios) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe seu nome: ");
        String name = sc.nextLine();
        System.out.print("Informe seu email: ");
        String email = sc.nextLine();
        System.out.print("Informe uma senha: ");
        String senha = sc.nextLine();
        System.out.print("Informe seu salario: ");
        double salario = sc.nextDouble();
        System.out.println("Informe sua disciplina: ");
        String disciplina = sc.nextLine();

        usuarios.add(new Professor(name, email, senha, salario, disciplina));
        start(usuarios);
        sc.close();
    }
}
