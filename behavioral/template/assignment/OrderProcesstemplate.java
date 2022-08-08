package behavioral.template.assignment;

abstract class OrderProcesstemplate {
    public boolean isGift;

    public abstract void select();
    public abstract void payment();
    public abstract void delivery();

    public final void wrapper(){
        System.out.println("Wrapping successful!!");
    }
    //template method
    public final void processOrder(boolean isGift){
        select();
        payment();
        if(isGift){
            wrapper();
        }
        delivery();
        System.out.println("Process Complete!");
    }
}

class NetOrder extends OrderProcesstemplate{

    @Override
    public void select() {
        System.out.println("Gift added to cart!!");
        System.out.println("Get wrap preferences.");
        System.out.println("Get delivery address");
    }

    @Override
    public void payment() {
        System.out.println("Amount paid by online transaction.");
    }

    @Override
    public void delivery() {
        System.out.println("Item delivered to the required address.");
    }
}

class StoreOrder extends OrderProcesstemplate{

    @Override
    public void select() {
        System.out.println("Item choose from shelf in store!");
    }

    @Override
    public void payment() {
        System.out.println("Amount paid by online/cash transaction.");
    }

    @Override
    public void delivery() {
        System.out.println("Item shelf carried by customer.");
    }
}