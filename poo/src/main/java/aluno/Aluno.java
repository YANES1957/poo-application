package aluno;

public class Aluno {
    private String nome;
    private int idade;
    private String curso;

    public Aluno(String nome, int idade, String curso) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
    }

    public void exibirDados() {
        System.out.println("Aluno: " + nome + ", Idade: " + idade + ", Curso: " + curso);
    }
}
