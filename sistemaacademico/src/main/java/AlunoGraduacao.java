public class AlunoGraduacao extends Aluno {
    public AlunoGraduacao(String nome, String matricula, double notaFinal) {
        super(nome, matricula, notaFinal);
    }
    
    @Override 
    public boolean verificarAprovacao() {
        return this.notaFinal >= 7.0;
    }
}