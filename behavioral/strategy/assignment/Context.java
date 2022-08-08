package behavioral.strategy.assignment;

public class Context {
    public int execute(Strategy strategy,int i, int j){
        return strategy.operation(i,j);
    }
}
