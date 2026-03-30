import java.util.ArrayList; //Criar listas

public class Diciplinas {
    private String nome;
    private Professor professorResponsavel;
    private ArrayList<Aluno> listaAlunos;
    
public Diciplinas(String nome, Professor professor) {
    this.nome = nome;
    if (professor != null){
        this.professorResponsavel = professor;
    } else {
        System.out.print("Erro! Disciplina precisa de um professor!");
    }
    this.listaAlunos = new ArrayList<>();
}    
//Método para adicionar alunos
public void adicionarAluno(Aluno novoAluno) {
    if (!listaAlunos.contains(novoAluno)) {
        listaAlunos.add(novoAluno);
        System.out.println("Aluno " + novoAluno.getNome() + " adicionado com sucesso!");
    } else {
        System.out.println("Erro! Esse aluno já está matriculado nesta diciplina.");
    }
}
//Método para listar os alunos
public void listarAlunos() {
    System.out.println("--- Diciplina: " + this.nome + "---");
    System.out.println("Professor: " + professorResponsavel.getNome());
    System.out.println("--- Lista de alunos ---");
    
    for (Aluno a : listaAlunos) {
        a.exibirDados();
    }
  }
}
