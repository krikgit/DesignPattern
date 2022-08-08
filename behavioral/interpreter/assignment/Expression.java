package behavioral.interpreter.assignment;

interface Expression {
    boolean interpret(Context context);
}

class TerminalExpression implements Expression{
    private String data;

    public TerminalExpression(String data){
        this.data = data;
    }

    @Override
    public boolean interpret(Context context) {
        return context.getResult(data);
    }
}
//non terminal
class OrExpression implements Expression{
    private Expression expression_;
    private Expression _expression;

    public OrExpression(Expression expression_, Expression _expression) {
        this.expression_ = expression_;
        this._expression = _expression;
    }


    @Override
    public boolean interpret(Context context) {
        return _expression.interpret(context) || expression_.interpret(context);
    }
}
//non terminal
class AndExpression implements Expression{
    private Expression expression_;
    private Expression _expression;

    public AndExpression(Expression expression_, Expression _expression) {
        this.expression_ = expression_;
        this._expression = _expression;
    }


    @Override
    public boolean interpret(Context context) {
        return _expression.interpret(context) && expression_.interpret(context);
    }
}