public class TabelaProdutos {
    private String cdgProduto;          // código do produto no catálogo
    private String descricaoProduto;    // descrição textual do produto
    private float  precoProduto;        // preço unitário (float)

    public TabelaProdutos(
        String cdgProduto,
        String descricaoProduto,
        float precoProduto
    ) {
        this.cdgProduto       = cdgProduto;  
        this.descricaoProduto = descricaoProduto;
        this.precoProduto     = precoProduto;
    }

    /**
     * Método de manutenção para produtos (inserir/atualizar/excluir).
     */
    public void manterProduto() {
        System.out.printf(
            "Mantendo produto: %s – %s – R$ %.2f%n",
            cdgProduto, descricaoProduto, precoProduto
        );                                  // simula operação de CRUD  
    }
}
