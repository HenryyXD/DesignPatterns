package NFE;

import java.math.BigDecimal;

import modelo.Produto;

public class NFEMinasGerais implements NFE{

    @Override
    public double calcularImposto(Produto produto) {
        BigDecimal imposto = new BigDecimal("0.18");
        imposto = imposto.multiply(produto.getValorUnitario());
        return imposto.doubleValue();
    }

}