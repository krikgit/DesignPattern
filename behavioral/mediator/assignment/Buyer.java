package behavioral.mediator.assignment;

abstract class Buyer {
    protected Mediator mediator;
    protected String name;
    protected int price;

    public Buyer(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void bid(int i);
    public abstract void cancelBid();
    public abstract void isAuctionEnded();


    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

class AuctionBuyer extends Buyer{

    public AuctionBuyer(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void bid(int i) {
        this.price = i;
    }

    @Override
    public void cancelBid() {
        this.price = -1;
    }

    @Override
    public void isAuctionEnded() {
        System.out.println("Auction is ended:"+this.name);
    }
}
