public class ItensPedido {
    private String cdgProdutoItem;      // código do produto no item
    private int    qtdItem;             // quantidade pedida
    private float  precoItem;           // preço unitário do item

    public ItensPedido(
        String cdgProdutoItem,
        int qtdItem,
        float precoItem
    ) {
        this.cdgProdutoItem = cdgProdutoItem;
        this.qtdItem        = qtdItem;
        this.precoItem      = precoItem;
    }

     /**
     * Calcula o subtotal deste item: quantidade × preço unitário.
     * @return subtotal em float
     */
    public float calcularSubtotal() {
        return qtdItem * precoItem;    // aplica regra de negócio  
    }
}
