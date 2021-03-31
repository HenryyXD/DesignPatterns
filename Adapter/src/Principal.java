import Adapter.CotacaoAdapter;

public class Principal {
    public static void main(String[] args) throws Exception {
        CotacaoAdapter cotacao = new CotacaoAdapter();
        cotacao.setValor(100.00);

        System.out.println("R$ " + cotacao.getValor());
        System.out.println("$ " + cotacao.getValorDolar());
    }
}
