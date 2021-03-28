package service;

public class CalculoPrecoDecorator implements CalculoPreco {
    private CalculoPreco wrapper;

    public CalculoPrecoDecorator(CalculoPreco wrapper) {
        this.wrapper = wrapper;
    }

    @Override
    public double calculaPreco(double preco) {
        return wrapper.calculaPreco(preco);
    }

}