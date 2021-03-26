package boleto;

import modelo.Produto;

public class BoletoBradesco implements Boleto{

    @Override
    public void emitir(Produto produto, double imposto) {
        System.out.println("BRADESCO");
        System.out.println("=========================================================================");
        System.out.println("Descrição: " + produto.getNome());
        System.out.println("Quantidade: " + produto.getQtd());
        System.out.println("Valor: R$" + produto.getValorUnitario());
        System.out.println("Imposto: R$" + imposto);
        System.out.println("Valor total: R$" + produto.getValorTotal(imposto));       
    }
    
}
