package behavioral.command.assignment;

interface Order {
    //receiver
    void execute();
}

class BuyStock implements Order{
    private  Stock stock;

    public BuyStock(Stock stock){
        this.stock = stock;
    }

    @Override
    public void execute() {
        this.stock.buy();
    }
}
class SellStock implements Order{
    private  Stock stock;

    public SellStock(Stock stock){
        this.stock = stock;
    }

    @Override
    public void execute() {
        this.stock.sell();
    }
}