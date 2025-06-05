import javax.swing.JOptionPane;

public class EscolarWin {
    public static void main(String[] args) {
        Pessoa pessoa;
        String tipo = JOptionPane.showInputDialog("Cadastrar Empresa ou Aluno?");

        if (tipo.equalsIgnoreCase("empresa")) {
            Empresa empresa = new Empresa();
            empresa.entrarPessoa();

            // Conversão de porcentagem (ex: 5%) para decimal (0.05)
            double percentual = Double.parseDouble(JOptionPane.showInputDialog("Percentual de desconto (%):")) / 100.0;
            int qtd = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de colaboradores:"));

            double desconto = empresa.calcularDesconto(percentual, qtd);
            JOptionPane.showMessageDialog(null, "Desconto calculado: R$ " + desconto);
        } else if (tipo.equalsIgnoreCase("aluno")) {
            Aluno aluno = new Aluno();
            aluno.entrarPessoa();

            // Conversão de porcentagem (ex: 5%) para decimal (0.05)
            double percentual = Double.parseDouble(JOptionPane.showInputDialog("Percentual de desconto (%):")) / 100.0;

            double desconto = aluno.calcularDesconto(percentual);
            JOptionPane.showMessageDialog(null, "Desconto calculado: R$ " + desconto);
        } else {
            JOptionPane.showMessageDialog(null, "Tipo inválido. Use 'empresa' ou 'aluno'.");
        }
    }
}
