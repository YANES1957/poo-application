
package professor;

public class Professor {
    private String nome;
    private String disciplina;

    public Professor(String nome, String disciplina) {
        this.nome = nome;
        this.disciplina = disciplina;
    }

    public void exibirDados() {
        System.out.println("Professor: " + nome + ", Disciplina: " + disciplina);
    }
}
