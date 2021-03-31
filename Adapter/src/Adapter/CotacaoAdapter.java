package Adapter;

public class CotacaoAdapter extends Cotacao{
    @Override
    public void setValor(double valor) {
        super.setValor(valor/5.66);
    }

    @Override
    public double getValor() {
        return super.getValor() * 5.66;
    }

    public double getValorDolar(){
        return super.getValor();
    }
}
