import java.math.BigDecimal;
import java.util.ArrayList;

import modelo.Cliente;
import modelo.Pedido;
import modelo.Produto;
import modelo.Vendedor;

public class PrincipalSemBuilder {
    public static void main(String[] args) throws Exception {

        Cliente cliente = new Cliente();
        cliente.setCodigo(1);
        cliente.setNome("Maria");
        cliente.setTelefone("9999-9999");

        Vendedor vendedor = new Vendedor();
        vendedor.setCodigo(1);
        vendedor.setNome("João");

        Produto p1 = new Produto();
        p1.setNome("Caderno");
        p1.setQuantidade(2);
        p1.setValor(new BigDecimal(10.00));

        Produto p2 = new Produto();
        p2.setNome("Caneta");
        p2.setQuantidade(1);
        p2.setValor(new BigDecimal(1.00));

        Pedido pedido = new Pedido();
        pedido.setCliente(cliente);
        pedido.setVendedor(vendedor);
        pedido.setNumeroPedido("1");
        pedido.setProdutos(new ArrayList<>());
        pedido.getProdutos().add(p1);
        pedido.getProdutos().add(p2);

        System.out.println(pedido.toString());
    }
}
