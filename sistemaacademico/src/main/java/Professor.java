public class Professor {
    protected String nome;
    private String matriculaFuncional;
    protected double salario;
    
    public Professor(String nome, String matriculaFuncional, double salarioInicial) {
        this.nome = (nome == null || nome.trim().isEmpty()) ? "Nome não informado" : nome;
        this.matriculaFuncional = (matriculaFuncional == null || matriculaFuncional.trim().isEmpty()) ? "000000" : matriculaFuncional;
        
        if (salarioInicial >= 0) {
            this.salario = salarioInicial;
        } else {
            System.out.print("Aviso: Salário negativo. Definido como 0.0.");
            this.salario = 0.0;
        }
    }
    public String getNome() {
        return nome;
    }
    public String getMatriculaFuncional() {
        return matriculaFuncional;
    }
    public double getSalario() {
        return salario;
    }
    //Aumento salarial
    public void aumentarSalario(double valor) {
        if (valor > 0) {
            this.salario += valor;
            System.out.print("Aumento de R$" + valor + " aplicado ao professor " + this.nome);
        } else {
            System.out.print("Erro! O valor do aumento deve ser positivo.");
        }
    }
    public void exibirDados() {
        System.out.println("--- Dados do Professor ---");
        System.out.println("Nome: " + this.nome);
        System.out.println("Matrícula: " + this.matriculaFuncional);
        System.out.println("Salário atual R$: " + this.salario);
    }
}
