
🚀API POO APLICATION

API desenvolvida em Java + Spring Boot, aplicando conceitos de Orientação a Objetos (POO) para cadastro e gerenciamento de Alunos, Professores, Médicos e Pacientes.

📚 O objetivo é demonstrar boas práticas de programação, organização em packages e uso de dependências modernas no ecossistema Java.


✨ Funcionalidades

👨‍🎓 Cadastro de Alunos: nome, idade, matrícula, curso.

🧑‍🏫 Cadastro de Professores: nome, disciplina, carga horária.

🩺 Cadastro de Médicos: nome, especialidade, CRM.

🧑‍⚕️ Cadastro de Pacientes: nome, idade, histórico médico.

🔍 Listagem e exibição detalhada de cada entidade.

🛠️ Tecnologias utilizadas

☕ Java 17

🌱 Spring Boot (estrutura principal da API)

📦 Maven (gerenciador de dependências)

🗄️ H2 Database (banco de dados em memória, para testes)

🔗 Spring Data JPA (persistência)

📄 Lombok (redução de boilerplate: getters, setters, construtores)

🧪 Spring Boot Starter Test (para testes unitários)

📦 Dependências principais (Maven)
<dependencies>
    <!-- Spring Web -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>

    <!-- Spring Data JPA -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>

    <!-- H2 Database -->
    <dependency>
        <groupId>com.h2database</groupId>
        <artifactId>h2</artifactId>
        <scope>runtime</scope>
    </dependency>

    <!-- Lombok -->
    <dependency>
        <groupId>org.projectlombok</groupId>
        <artifactId>lombok</artifactId>
        <optional>true</optional>
    </dependency>

    <!-- Spring Boot Test -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-test</artifactId>
        <scope>test</scope>
    </dependency>
</dependencies>

🧑‍💻 Conceitos aplicados

✅ Orientação a Objetos (POO)

Classes e objetos para cada entidade (Aluno, Professor, Médico, Paciente).

Uso de herança, encapsulamento e polimorfismo.

Organização em packages para separar responsabilidades.

✅ Arquitetura MVC simplificada

Controllers → endpoints REST.

Services → regras de negócio.

Repositories → acesso ao banco de dados.

Models → classes de domínio.

📚 Exemplos de endpoints

POST /alunos → cadastrar aluno 👨‍🎓

GET /alunos → listar alunos

POST /professores → cadastrar professor 🧑‍🏫

GET /medicos → listar médicos 🩺

POST /pacientes → cadastrar paciente 🧑‍⚕️

🚀 Como executar o projeto
# Clonar repositório
git clone https://github.com/YANES1957/springpoo.git

# Acessar pasta
cd springpoo

# Rodar aplicação
./mvnw spring-boot:run


A aplicação ficará disponível em:
👉 http://localhost:80

🚀 Projeto em andamento

📚 Alunos
🧑‍🏫 Professores
🩺 Médicos
🧑‍⚕️ Pacientes
🗄️ Banco de dados
☕ Java


Código do projeto:
# Projeto POO Application

Aplicativo em Java para demonstrar programação orientada a objetos com Alunos, Professores, Médicos e Pacientes.  
Mostra detalhes e faz contagens de comorbidades, tratamentos e unidades.

---

## Tecnologias usadas

- Java  
- Collections: `ArrayList`, `HashMap`  
- Maven (opcional)  

---

## Estrutura do projeto
src/
└── main/
└── java/
└── roberto/
└── poo/
├── PooApplication.java
├── aluno/
│ └── Aluno.java
├── professor/
│ └── Professor.java
├── medico/
│ └── Medico.java

´´´´ java

// Pacote da classe Aluno
package roberto.poo.aluno;

/**
 * Classe Aluno representa um estudante com nome, idade e curso.
 */
public class Aluno {
    private String nome;   // Nome do aluno
    private int idade;     // Idade do aluno
    private String curso;  // Curso do aluno

    // Construtor da classe
    public Aluno(String nome, int idade, String curso) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
    }

    // Método para exibir os dados do aluno
    public void exibirDados() {
        System.out.println("Aluno: " + nome + ", Idade: " + idade + ", Curso: " + curso);
    }
}


// Pacote da classe Professor
package roberto.poo.professor;

/**
 * Classe Professor representa um professor com nome e disciplina.
 */
public class Professor {
    private String nome;       // Nome do professor
    private String disciplina; // Disciplina que ele ministra

    // Construtor da classe
    public Professor(String nome, String disciplina) {
        this.nome = nome;
        this.disciplina = disciplina;
    }

    // Método para exibir os dados do professor
    public void exibirDados() {
        System.out.println("Professor: " + nome + ", Disciplina: " + disciplina);
    }
}
// Pacote da classe Medico
package roberto.poo.medico;

/**
 * Classe Medico representa um médico com nome e especialidade.
 */
public class Medico {
    private String nome;          // Nome do médico
    private String especialidade; // Especialidade médica

    // Construtor da classe
    public Medico(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    // Método para exibir os dados do médico
    public void exibirDados() {
        System.out.println("Médico: " + nome + ", Especialidade: " + especialidade);
    }
}
// Pacote da classe Paciente
package roberto.poo.paciente;

/**
 * Classe Paciente representa um paciente com informações de saúde e atendimento.
 */
public class Paciente {
    private String nome;         // Nome do paciente
    private int idade;           // Idade do paciente
    private String comorbidade;  // Comorbidade existente
    private String tratamento;   // Tratamento que está seguindo
    private String unidade;      // Unidade de atendimento

    // Construtor da classe
    public Paciente(String nome, int idade, String comorbidade, String tratamento, String unidade) {
        this.nome = nome;
        this.idade = idade;
        this.comorbidade = comorbidade;
        this.tratamento = tratamento;
        this.unidade = unidade;
    }

    // Getters para informações do paciente
    public String getComorbidade() { return comorbidade; }
    public String getTratamento() { return tratamento; }
    public String getUnidade() { return unidade; }

    // Método para exibir os dados do paciente
    public void exibirDados() {
        System.out.println("Paciente: " + nome
            + ", Idade: " + idade
            + ", Comorbidade: " + comorbidade
            + ", Tratamento: " + tratamento
            + ", Unidade: " + unidade);
    }
}
// Classe principal PooApplication
package roberto.poo;

import roberto.poo.aluno.Aluno;
import roberto.poo.professor.Professor;
import roberto.poo.medico.Medico;
import roberto.poo.paciente.Paciente;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Classe principal que executa o aplicativo POO.
 */
public class PooApplication {
    public static void main(String[] args) {
        // Criando listas de cada tipo de objeto
        ArrayList<Aluno> alunos = new ArrayList<>();
        ArrayList<Professor> professores = new ArrayList<>();
        ArrayList<Medico> medicos = new ArrayList<>();
        ArrayList<Paciente> pacientes = new ArrayList<>();

        // Adicionando alunos
        alunos.add(new Aluno("João", 20, "Engenharia"));
        alunos.add(new Aluno("Mariana", 22, "Direito"));
        alunos.add(new Aluno("Lucas", 19, "Medicina"));

        // Adicionando professores
        professores.add(new Professor("Maria", "Matemática"));
        professores.add(new Professor("Paulo", "História"));

        // Adicionando médicos
        medicos.add(new Medico("Carlos", "Cardiologia"));
        medicos.add(new Medico("Fernanda", "Pediatria"));

        // Adicionando pacientes
        pacientes.add(new Paciente("Ana", 35, "Diabetes", "Insulina", "Unidade Central"));
        pacientes.add(new Paciente("Pedro", 50, "Hipertensão", "Medicamento controlado", "Hospital Regional"));
        pacientes.add(new Paciente("Clara", 28, "Asma", "Inalação", "Posto de Saúde"));
        pacientes.add(new Paciente("Lucas", 40, "Diabetes", "Dieta", "Unidade Central"));
        pacientes.add(new Paciente("Sofia", 33, "Hipertensão", "Medicamento controlado", "Hospital Regional"));

        // Exibindo dados
        System.out.println("=== Alunos ===");
        for (Aluno a : alunos) a.exibirDados();

        System.out.println("\n=== Professores ===");
        for (Professor p : professores) p.exibirDados();

        System.out.println("\n=== Médicos ===");
        for (Medico m : medicos) m.exibirDados();

        System.out.println("\n=== Pacientes ===");
        for (Paciente pac : pacientes) pac.exibirDados();

        // Quantitativos
        System.out.println("\n=== Quantitativos ===");
        System.out.println("Total de alunos: " + alunos.size());
        System.out.println("Total de professores: " + professores.size());
        System.out.println("Total de médicos: " + medicos.size());
        System.out.println("Total de pacientes: " + pacientes.size());

        // Mapas para contagem de comorbidades, tratamentos e unidades
        HashMap<String, Integer> comorbidades = new HashMap<>();
        HashMap<String, Integer> tratamentos = new HashMap<>();
        HashMap<String, Integer> unidades = new HashMap<>();

        for (Paciente p : pacientes) {
            comorbidades.put(p.getComorbidade(), comorbidades.getOrDefault(p.getComorbidade(), 0) + 1);
            tratamentos.put(p.getTratamento(), tratamentos.getOrDefault(p.getTratamento(), 0) + 1);
            unidades.put(p.getUnidade(), unidades.getOrDefault(p.getUnidade(), 0) + 1);
        }

        System.out.println("\n=== Comorbidades ===");
        comorbidades.forEach((k, v) -> System.out.println(k + ": " + v + " paciente(s)"));

        System.out.println("\n=== Tratamentos ===");
        tratamentos.forEach((k, v) -> System.out.println(k + ": " + v + " paciente(s)"));

        System.out.println("\n=== Unidades ===");
        unidades.forEach((k, v) -> System.out.println(k + ": " + v + " paciente(s)"));
    }
}



