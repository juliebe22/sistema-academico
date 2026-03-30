public class TestaProfessores {
    public static void main(String[] args) {
        //Testar os professores
        
        //Efetivo
        ProfessorEfetivo profEfetivo = new ProfessorEfetivo("Anderson Soares", "000112", 5000.0);
        profEfetivo.aumentarSalario(500.0);
        profEfetivo.exibirDados();

        //Temporário Ativo
        ProfessorTemporario profTempAtivo = new ProfessorTemporario("Dr. Gilberto", "000022", 3000.0, 6);
        profTempAtivo.aumentarSalario(500.0);
        profTempAtivo.exibirDados();

        //Temporário Vencido
        ProfessorTemporario profTempVencido = new ProfessorTemporario("Amélia", "000057", 3000.0, 0);
        profTempVencido.aumentarSalario(200.0);
        profTempVencido.exibirDados();
    }
}