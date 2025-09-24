package paciente;

public class Paciente {
    private String nome;
    private int idade;
    private String comorbidade;
    private String tratamento;
    private String unidade;

    public Paciente(String nome, int idade, String comorbidade, String tratamento, String unidade) {
        this.nome = nome;
        this.idade = idade;
        this.comorbidade = comorbidade;
        this.tratamento = tratamento;
        this.unidade = unidade;
    }

    public String getComorbidade() {
        return comorbidade;
    }

    public String getTratamento() {
        return tratamento;
    }

    public String getUnidade() {
        return unidade;
    }

    public void exibirDados() {
        System.out.println("Paciente: " + nome
                + ", Idade: " + idade
                + ", Comorbidade: " + comorbidade
                + ", Tratamento: " + tratamento
                + ", Unidade: " + unidade);
    }
}
