package behavioral.strategy.example;

interface PaymentStrategy {
    public void pay(int amount);
}
class CardStrategy implements PaymentStrategy{
    private String name;
    private String cardNo;
    private String cvv;
    private String expiry;

    public CardStrategy(String name, String cardNo, String cvv, String expiry) {
        this.name = name;
        this.cardNo = cardNo;
        this.cvv = cvv;
        this.expiry = expiry;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount+" is paid by card.");
    }
}
class UPIStrategy implements PaymentStrategy{
    private String upiID;


    public UPIStrategy(String upiID) {
       this.upiID=upiID;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount+" is paid by UPI.");
    }
}
class NetBankingStrategy implements PaymentStrategy{
    private String id;
    private String pass;

    public NetBankingStrategy(String id, String pass) {
        this.id = id;
        this.pass = pass;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount+" is paid by net banking.");
    }
}