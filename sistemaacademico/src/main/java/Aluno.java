public abstract class Aluno { // 1. Adicione "abstract" aqui
    protected String nome;
    protected String matricula;
    protected double notaFinal;
     
     public Aluno(String nome, String matricula, double notaFinal) {
         if (nome == null || nome.trim().isEmpty()) {
             this.nome = "Nome não informado";
         } else {
             this.nome = nome;
         }
         if (matricula == null || matricula.trim().isEmpty()) {
             this.matricula = "000000";
         } else {
                 this.matricula = matricula;
         }
         setNota(notaFinal);
     }
     
     public abstract boolean verificarAprovacao();
     
     public double getNota() {
         return notaFinal;
     }
     public void setNota(double nota) {
         if (nota >= 0 && nota<= 10) {
             this.notaFinal = nota;
         } else {
             System.out.println("Nota inválida! A nota deve estar entre 0 e 10. Definindo como 0.0.");
             this.notaFinal = 0.0;
         }
     }
     public void ajustarNota(double novaNota) {
         System.out.println("Solicitando ajuste de nota para: " + novaNota);
         //Chamar o setNota
         setNota(novaNota);
         
         System.out.println(" Ajuste processado. Nova nota final: " + getNota());
     }
     // Dentro da classe Aluno.java
     public String getNome() {
         return this.nome;
     }
     
    //Método para exibir as informações
    public void exibirDados() {
        System.out.println("--- Dados do Aluno ---");
        System.out.println("Nome: " + this.nome);
        System.out.println("Matrícula: " + this.matricula);
        System.out.println("Nota Final: " + getNota());
      String status = verificarAprovacao() ? "Aprovado" : "Reprovado";
        System.out.println("Status: " + status);
    }     
}
