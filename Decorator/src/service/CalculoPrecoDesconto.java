package service;

public class CalculoPrecoDesconto extends CalculoPrecoDecorator{

    public CalculoPrecoDesconto(CalculoPreco cp){
        super(cp);
    }

    @Override
    public double calculaPreco(double preco) {
        double p = super.calculaPreco(preco);
        double desconto = p * 0.1;
        return p - desconto;
    }

}