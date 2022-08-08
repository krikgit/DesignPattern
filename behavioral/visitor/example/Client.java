package behavioral.visitor.example;

public class Client {
    public static void main(String[] args) {
        System.out.println("Visitor Design Pattern");
        System.out.println("=======================");

        ItemElement[] items = new ItemElement[]{
                new Book(700,"book#1"),
                new Book(745,"book#2"),
                new Fruit(180,2,"Pomegranate"),
                new Fruit(120,3,"Apple"),

        };
        int totalPrice = calculatePrice(items);
        System.out.println("Total:"+totalPrice);
    }
    private static int calculatePrice(ItemElement[] items) {
        ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
        int sum = 0;
        for (ItemElement itemElement : items){
            sum += itemElement.accept(visitor);
        }
        return sum;
    }

}
