package strategy;

public class ContextMath {
    private StrategyMath strategy;

    public ContextMath(StrategyMath strategy){
        this.strategy = strategy;
    }

    public int calcular(int num1, int num2){
        return strategy.calcular(num1, num2);
    }

    public void setStrategy(StrategyMath strategy){
        this.strategy = strategy;
    }
}
