package service;

public class CalculoPrecoFrete extends CalculoPrecoDecorator{

    public CalculoPrecoFrete(CalculoPreco cp) {
        super(cp);
    }

    @Override
    public double calculaPreco(double preco) {
        double p = super.calculaPreco(preco);
        return p + 20;
    }

}