package behavioral.interpreter.example;

public class Client {
    private InterpreterContext interpreterContext;
    public Client(InterpreterContext interpreterContext){
        this.interpreterContext = interpreterContext;
    }
    public String interpret(String context){
        Expression expression = null;
        int extractNumber = Integer.parseInt(context.substring(0, context.indexOf(" ")));
        if(context.contains("Binary")){
            expression = new IntegerToBinary(extractNumber);
        } else if (context.contains("Hexadecimal")) {
            expression = new IntegerToHexadecimal(extractNumber);
        }else {
            return context;
        }
        return expression.interpret(interpreterContext);
    }
    public static void main(String[] args) {
        System.out.println("Interpreter Design Pattern");
        System.out.println("==========================");

        final String testBinary = "28 in Binary";
        final String testHex = "28 in Hexadecimal";

        Client client = new Client(new InterpreterContext());
        System.out.println(testBinary+" is:"+client.interpret(testBinary));
        System.out.println(testHex+" is:"+client.interpret(testHex));
    }
}
