public static void main(String[] args) {
    // 1. Criar o Professor
    ProfessorEfetivo prof = new ProfessorEfetivo("Heloisa Guimarães","000512", 5000.0);
    
    // 2. Criar a Disciplina
    Diciplinas poo = new Diciplinas("Programacao Orientada a Objetos", prof);
    
    // 3. Criar Alunos
    AlunoGraduacao a1 = new AlunoGraduacao("Julia Beatriz Borges", "222222", 4.0);
    AlunoPosGraduacao a2 = new AlunoPosGraduacao("Pamella Roberta", "265152", 8.5);
    
    // 4. Adicionar à disciplina
    poo.adicionarAluno(a1);
    poo.adicionarAluno(a2);
    poo.adicionarAluno(a1); // Tentando adicionar a Julia de novo (deve dar erro)
    
    // 5. Ver o resultado
    poo.listarAlunos();
}