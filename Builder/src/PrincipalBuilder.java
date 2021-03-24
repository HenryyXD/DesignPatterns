import java.math.BigDecimal;

import builder.PedidoBuilder;
import modelo.Pedido;

public class PrincipalBuilder {
    public static void main(String[] args) {
        Pedido pedido = new PedidoBuilder()
                        .setNumeroPedido("111")
                        .setCliente(1, "Maria", "9999-9999")
                        .setVendedor(100, "João")
                        .setProduto("Caderno", 2, new BigDecimal(10.00))
                        .setProduto("Caneta", 3, new BigDecimal(1.00))
                        .builder();

        System.out.println(pedido.toString());
    }
}
