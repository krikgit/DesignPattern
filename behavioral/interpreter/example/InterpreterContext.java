package behavioral.interpreter.example;

class InterpreterContext {

    public String getBinaryFormat(int i){
        return Integer.toBinaryString(i);
    }
    public String getHexFormat(int i){
        return Integer.toHexString(i);
    }
}
