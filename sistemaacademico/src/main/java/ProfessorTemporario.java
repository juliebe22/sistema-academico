public class ProfessorTemporario extends Professor {
    private int mesesContrato;
    
    public ProfessorTemporario(String nome, String matricula, double salario, int meses) {
        super(nome, matricula, salario);
        this.mesesContrato = meses;
    }
    public void aumentarSalario(double valor) {
        if (this.mesesContrato > 0) {
            super.aumentarSalario(valor);
        } else {
            System.out.print("Erro! Contrato encerrado para o professor " + getNome() + ". Aumento negado.");
        }
    }
    public void exibirDados() {
        super.exibirDados();
        System.out.print("Meses restantes de contrato: " + this.mesesContrato);
    }
}
