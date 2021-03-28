import service.*;

public class Principal {
    public static void main(String[] args) {
        double preco = 100;
        boolean hasImposto = true;
        boolean hasFrete = true;
        boolean hasDesconto = true;

        //CalculoPreco cp = new CalculoPrecoDesconto(new CalculoPrecoFrete(new CalculoPrecoImposto(new CalculoPrecoBase())));

        CalculoPreco cp = new CalculoPrecoBase();

        if(hasImposto)
            cp = new CalculoPrecoImposto(cp);
        if(hasFrete)
            cp = new CalculoPrecoFrete(cp);
        if(hasDesconto)
            cp = new CalculoPrecoDesconto(cp);
        

        System.out.println(cp.calculaPreco(preco));
    }
}
