import javax.swing.JOptionPane;

public class Empresa extends Pessoa {
    private String cnpjPessoaJuridica;
    private String inscricaoEstadual;

    // POLIMORFISMO - SOBRESCRITA: Especializamos a entrada de dados da empresa
    @Override
    public void entrarPessoa() {
        nomePessoa = JOptionPane.showInputDialog("Nome da Empresa:");
        cnpjPessoaJuridica = JOptionPane.showInputDialog("CNPJ:");
        inscricaoEstadual = JOptionPane.showInputDialog("Inscrição Estadual:");
    }

    // POLIMORFISMO - SOBRECARGA: Método específico com parâmetros
    public double calcularDesconto(double percentual, int qtdColaboradores) {
        double vlrMensalidade = Double.parseDouble(JOptionPane.showInputDialog("Valor da mensalidade:"));
        return vlrMensalidade * (percentual * qtdColaboradores);
    }
}
