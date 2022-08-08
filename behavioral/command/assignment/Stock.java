package behavioral.command.assignment;

public class Stock {
    private String name;
    private int quantity;

    public Stock(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public void buy(){
        System.out.println("Buying:"+this.quantity+" "+this.name+" stock(s)");
    }

    public void sell(){
        System.out.println("Selling "+this.quantity+" "+this.name+" stock(s)");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
