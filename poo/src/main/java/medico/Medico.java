package medico;

public class Medico {
    private String nome;
    private String especialidade;

    public Medico(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public void exibirDados() {
        System.out.println("Médico: " + nome + ", Especialidade: " + especialidade);
    }
}
