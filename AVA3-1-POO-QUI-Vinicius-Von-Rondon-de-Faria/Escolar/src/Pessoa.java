public class Pessoa {
    protected String nomePessoa;

    // Método de entrada de dados genérico
    public void entrarPessoa() {
        // Este método será sobrescrito pelas subclasses
    }

    // Método de cálculo genérico (será sobrescrito)
    public double calcularDesconto() {
        return 0;
    }
}
