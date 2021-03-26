import java.math.BigDecimal;

import Venda.Venda;
import Venda.VendaFactory;
import loja.Loja;
import modelo.Produto;

public class Principal {
    public static void main(String[] args) throws Exception {
        Produto produto = new Produto();
        produto.setNome("Guitarra Stratocaster Giannini G-100");
        produto.setQtd(1);
        produto.setValorUnitario(new BigDecimal(700));
        VendaFactory factory = new Loja();
        Venda venda = new Venda(factory);
        venda.realizarVenda(produto);
    }
}
