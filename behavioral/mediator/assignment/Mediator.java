package behavioral.mediator.assignment;

import java.util.ArrayList;
interface Mediator {
    void addBuyer(Buyer buyer);
    void findHighestBidder();
}

class AuctionMediator implements Mediator{
    private ArrayList buyers;

    public AuctionMediator(){
        buyers = new ArrayList<>();
    }

    @Override
    public void addBuyer(Buyer buyer) {
        buyers.add(buyer);
        System.out.println(buyer.getName()+" is added successfully.");
    }

    @Override
    public void findHighestBidder() {
        int maxBid = 0;
        Buyer winner = null;
        for (Object a:buyers){
            Buyer b = (Buyer) a;
            if (b.getPrice()>maxBid){
                maxBid = b.getPrice();
                winner = b;
            }
            b.isAuctionEnded();
        }
        System.out.println("Winner is:"+winner.name);
    }
}