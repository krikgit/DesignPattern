package behavioral.mediator.assignment;

public class Client {
    public static void main(String[] args) {
        System.out.println("Mediator Design Pattern");
        System.out.println("=======================");

        AuctionMediator mediator = new AuctionMediator();
        Buyer b1 = new AuctionBuyer(mediator,"John");
        Buyer b2 = new AuctionBuyer(mediator,"Robert");
        Buyer b3 = new AuctionBuyer(mediator,"Jasmine");

        mediator.addBuyer(b1);
        mediator.addBuyer(b2);
        mediator.addBuyer(b3);

        System.out.println("Bidding started:");

        b1.bid(230);
        b2.bid(532);
        b3.bid(400);

        mediator.findHighestBidder();
        b2.cancelBid();

        mediator.findHighestBidder();


    }
}
