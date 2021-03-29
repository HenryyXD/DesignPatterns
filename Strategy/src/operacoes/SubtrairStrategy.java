package operacoes;

import strategy.StrategyMath;

public class SubtrairStrategy implements StrategyMath{

    @Override
    public int calcular(int num1, int num2) {
        return num1 - num2;
    }
    
}
