package service;

public class CalculoPrecoImposto extends CalculoPrecoDecorator{

    public CalculoPrecoImposto(CalculoPreco cp) {
        super(cp);
    }

    @Override
    public double calculaPreco(double preco){
        double p = super.calculaPreco(preco);
        double imposto = p * 0.1;
        return p + imposto;
    }
}