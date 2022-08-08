package behavioral.interpreter.assignment;

public class Client {

    private static final String JOHN = "John";
    private static final String ROBERT = "Robert";
    private static final String JULIE = "Julie";
    private static final String MARRIED = "Married";
    public static Expression getMaleExpression(){
        return new OrExpression(new TerminalExpression(JOHN),new TerminalExpression(ROBERT));
    }
    public static Expression getMarriedExpression(){
        return new AndExpression(new TerminalExpression(JULIE),new TerminalExpression(MARRIED));
    }
    public static void main(String[] args) {
        System.out.println("Interpreter Design Pattern");
        System.out.println("==========================");

        Context context = null;
        Expression isMale = getMaleExpression();
        Expression isMarried = getMarriedExpression();

        context = new Context(JOHN);
        System.out.println(JOHN+" is a male:"+isMale.interpret(context));

        context = new Context(MARRIED+" "+JULIE);
        System.out.println(JULIE+" is married:"+isMarried.interpret(context));

        context = new Context(ROBERT);
        System.out.println(ROBERT+" is married:"+isMarried.interpret(context));

        context = new Context(ROBERT);
        System.out.println(ROBERT+" is male:"+isMale.interpret(context));

    }
}
