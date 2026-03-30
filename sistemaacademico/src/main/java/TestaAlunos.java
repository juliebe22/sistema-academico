public class TestaAlunos {
    public static void main(String[] args) {
        
        AlunoGraduacao alunoGrad = new AlunoGraduacao("Lia Rachel", "258090", 10.0);
        alunoGrad.exibirDados();

        AlunoPosGraduacao alunoPos = new AlunoPosGraduacao("Pamella Roberta", "265152", 6.5);
        alunoPos.exibirDados();
        
        alunoPos.publicarArtigo();
        
        AlunoGraduacao alunoRev = new AlunoGraduacao("João Vitor", "856943", 5.0);
        alunoRev.exibirDados(); // Começa reprovado

        alunoRev.ajustarNota(12.0); 

        alunoRev.ajustarNota(8.5);
        alunoRev.exibirDados(); // Agora deve aparecer Aprovado
        
        
       //Teste do cadastro de professores
 
       Professor prof = new Professor("Heloisa Guimarães", "000512", 5000.0);
       prof.exibirDados();

       //Aumento inválido
       prof.aumentarSalario(-200); 

       // Aumento
       prof.aumentarSalario(1200.50);
       prof.exibirDados();
    }
}