package behavioral.interpreter.assignment;

public class Context {

    private String data;

    public Context(String data){
        this.data = data;
    }

    public boolean getResult(String input){
        if (this.data.contains(input)){
            return true;
        }else {
            return false;
        }
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
