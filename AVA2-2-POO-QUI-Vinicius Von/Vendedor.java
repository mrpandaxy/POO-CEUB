public class Vendedor extends Pessoa {
    private String matriculaVendedor;    // matrícula do empregado

    public Vendedor(
        String cpfPessoa,
        String nomePessoa,
        String matriculaVendedor
    ) {
        super(cpfPessoa, nomePessoa);     // herda CPF e nome de Pessoa  
        this.matriculaVendedor = matriculaVendedor;
    }

    public String getMatriculaVendedor() {
        return matriculaVendedor;         // retorna matrícula  
    }

    public void setMatriculaVendedor(String matriculaVendedor) {
        this.matriculaVendedor = matriculaVendedor;
    }

    /**
     * Método de manutenção específico para Vendedor.
     */
    public void manterVendedor() {
        System.out.printf(
            "Mantendo dados de Vendedor: %s (%s), matrícula %s%n",
            nomePessoa, cpfPessoa, matriculaVendedor
        );                                  // simula operação de CRUD  
    }
}
