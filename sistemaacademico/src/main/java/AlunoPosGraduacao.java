class AlunoPosGraduacao extends Aluno {
    
    public AlunoPosGraduacao (String nome, String matricula, double notaFinal) {
        super(nome, matricula, notaFinal);
    }
    @Override
    public boolean verificarAprovacao() {
        return getNota() >= 6.0;
    }
    public void publicarArtigo() {
        System.out.print("Aluno " + this.nome + " publicou um artigo cíentifico!");
    }
}
