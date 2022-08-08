package behavioral.interpreter.example;

interface Expression {
    String interpret(InterpreterContext ic);
}

class IntegerToBinary implements Expression {
    private  int i;

    public IntegerToBinary(int i){
        this.i = i;
    }

    @Override
    public String interpret(InterpreterContext ic) {
        return ic.getBinaryFormat(this.i);
    }
}
class IntegerToHexadecimal implements Expression{
    private  int i;

    public IntegerToHexadecimal(int i){
        this.i = i;
    }

    @Override
    public String interpret(InterpreterContext ic) {
        return ic.getHexFormat(this.i);
    }
}