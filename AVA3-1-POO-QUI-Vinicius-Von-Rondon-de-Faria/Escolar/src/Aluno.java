import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class Aluno extends Pessoa {
    private String cpfPessoaFisica;
    private Date dataNascimento;

    // POLIMORFISMO - SOBRESCRITA: Entrada de dados do aluno
    @Override
    public void entrarPessoa() {
        nomePessoa = JOptionPane.showInputDialog("Nome do Aluno:");
        cpfPessoaFisica = JOptionPane.showInputDialog("CPF:");
        String data = JOptionPane.showInputDialog("Data de nascimento (dd/MM/yyyy):");

        try {
            dataNascimento = new SimpleDateFormat("dd/MM/yyyy").parse(data);
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, "Data inválida. Usando data atual.");
            dataNascimento = new Date();
        }
    }

    // POLIMORFISMO - SOBRECARGA: Desconto com base apenas no percentual
    public double calcularDesconto(double percentual) {
        double vlrMensalidade = Double.parseDouble(JOptionPane.showInputDialog("Valor da mensalidade:"));
        return vlrMensalidade * percentual;
    }
}
