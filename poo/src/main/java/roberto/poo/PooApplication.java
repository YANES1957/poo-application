package roberto.poo;

import aluno.Aluno;
import professor.Professor;
import medico.Medico;
import paciente.Paciente;

import java.util.ArrayList;
import java.util.HashMap;

public class PooApplication {
    public static void main(String[] args) {
        // Listas
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

        // Mostrar dados
        System.out.println("=== Alunos ===");
        for (Aluno a : alunos) a.exibirDados();

        System.out.println("\n=== Professores ===");
        for (Professor p : professores) p.exibirDados();

        System.out.println("\n=== Médicos ===");
        for (Medico m : medicos) m.exibirDados();

        System.out.println("\n=== Pacientes ===");
        for (Paciente pac : pacientes) pac.exibirDados();

        // Mostrar quantidades totais
        System.out.println("\n=== Quantitativos ===");
        System.out.println("Total de alunos: " + alunos.size());
        System.out.println("Total de professores: " + professores.size());
        System.out.println("Total de médicos: " + medicos.size());
        System.out.println("Total de pacientes: " + pacientes.size());

        // Contar comorbidades, tratamentos e unidades
        HashMap<String, Integer> comorbidades = new HashMap<>();
        HashMap<String, Integer> tratamentos = new HashMap<>();
        HashMap<String, Integer> unidades = new HashMap<>();

        for (Paciente p : pacientes) {
            comorbidades.put(p.getComorbidade(), comorbidades.getOrDefault(p.getComorbidade(), 0) + 1);
            tratamentos.put(p.getTratamento(), tratamentos.getOrDefault(p.getTratamento(), 0) + 1);
            unidades.put(p.getUnidade(), unidades.getOrDefault(p.getUnidade(), 0) + 1);
        }

        // Mostrar contagens detalhadas
        System.out.println("\n=== Comorbidades ===");
        comorbidades.forEach((k,v) -> System.out.println(k + ": " + v + " paciente(s)"));

        System.out.println("\n=== Tratamentos ===");
        tratamentos.forEach((k,v) -> System.out.println(k + ": " + v + " paciente(s)"));

        System.out.println("\n=== Unidades ===");
        unidades.forEach((k,v) -> System.out.println(k + ": " + v + " paciente(s)"));
    }
}
