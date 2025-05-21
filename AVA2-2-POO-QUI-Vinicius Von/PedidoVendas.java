
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class PedidoVendas {
    private String nrPedido;               // número único do pedido
    private LocalDateTime dataHoraPedido;  // data e hora da emissão
    private StatusPedido   statusPedido;   // enum de status
    private float          vlrTotalPedido; // valor total calculado

    private Cliente cliente;               // cliente associado (1..1)
    private Vendedor vendedor;             // vendedor associado (1..1)
    private List<ItensPedido> itens = new ArrayList<>(); // composição

    public PedidoVendas(
        String nrPedido,
        LocalDateTime dataHoraPedido,
        StatusPedido statusPedido,
        Cliente cliente,
        Vendedor vendedor
    ) {
        this.nrPedido       = nrPedido;          
        this.dataHoraPedido = dataHoraPedido;    
        this.statusPedido   = statusPedido;      
        this.cliente        = cliente;           
        this.vendedor       = vendedor;          
        this.vlrTotalPedido = 0f;                // inicia em zero  
    }

     /**
     * Recalcula o valor total somando subtotais de cada item.
     */
    public float calcularValorTotal() {
        float total = 0f;                    
        for (ItensPedido item : itens) {
            total += item.calcularSubtotal(); // soma cada subtotal  
        }
        this.vlrTotalPedido = total;         // atualiza atributo  
        return total;                        // retorna valor atual  
    }

    /**
     * Atualiza o status do pedido.
     * @param novoStatus novo valor de StatusPedido
     */
    public void atualizarStatus(StatusPedido novoStatus) {
        this.statusPedido = novoStatus;      // seta novo status  
    }

    /**
     * Adiciona um item ao pedido e recalcula o total.
     * @param item instância de ItensPedido
     */
    public void adicionarItem(ItensPedido item) {
        itens.add(item);                     // insere na lista  
        calcularValorTotal();                // recalcula total  
    }

    /**
     * Remove um item do pedido e recalcula o total.
     * @param item instância a remover
     */
    public void removerItem(ItensPedido item) {
        itens.remove(item);                  // remove da lista  
        calcularValorTotal();                // recalcula total  
    }

    /**
     * Aplica desconto percentual sobre o valor total.
     * @param percentual porcentagem de desconto (Double)
     */
    public void aplicarDesconto(Double percentual) {
        if (percentual != null
            && percentual > 0
            && percentual <= 100
        ) {
            float desconto = vlrTotalPedido * (percentual.floatValue() / 100f);
            this.vlrTotalPedido -= desconto; // atualiza total com desconto  
        }
    }
}

