// pacote e imports omitidos para brevidade
public abstract class Pessoa {
    protected String cpfPessoa;     // CPF da pessoa (identificador único)  
    protected String nomePessoa;    // Nome completo da pessoa

    // Construtor que inicializa CPF e nome
    public Pessoa(String cpfPessoa, String nomePessoa) {
        this.cpfPessoa = cpfPessoa;  // atribui CPF ao atributo  
        this.nomePessoa = nomePessoa;// atribui nome ao atributo  
    }

    // Getter para CPF
    public String getCpfPessoa() {
        return cpfPessoa;             // retorna o CPF  
    }

    // Setter para CPF
    public void setCpfPessoa(String cpfPessoa) {
        this.cpfPessoa = cpfPessoa;   // atualiza o CPF  
    }

    // Getter para nome
    public String getNomePessoa() {
        return nomePessoa;            // retorna o nome  
    }

    // Setter para nome
    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa; // atualiza o nome  
    }

    /**
     * Método genérico de manutenção para Pessoa.
     * Pode inserir, atualizar ou remover registros no banco (simulado aqui).
     */
    public void manterPessoa() {
        System.out.printf(
            "Mantendo dados de Pessoa: %s (%s)%n",
            nomePessoa, cpfPessoa
        );                           // exibe operação de manutenção  
    }
}
