import operacoes.SomarStrategy;
import operacoes.SubtrairStrategy;
import strategy.ContextMath;

public class Principal {
    public static void main(String[] args) throws Exception {
        ContextMath cm = new ContextMath(new SomarStrategy());

        System.out.println(cm.calcular(5, 2));
        
        cm.setStrategy(new SubtrairStrategy()); 

        System.out.println(cm.calcular(10, 5));
    }
}
