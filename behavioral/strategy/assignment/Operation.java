package behavioral.strategy.assignment;

interface Strategy {
    public int operation(int a,int b);
}
class Add implements Strategy{

    @Override
    public int operation(int a, int b) {
        return a+b;
    }
}
class Subtract implements Strategy{

    @Override
    public int operation(int a, int b) {
        return a-b;
    }
}
class Multiply implements Strategy{

    @Override
    public int operation(int a, int b) {
        return a*b;
    }
}