package behavioral.visitor.example;

interface ShoppingCartVisitor {
   int visit(Book book);
   int visit(Fruit fruit);

}
class ShoppingCartVisitorImpl implements ShoppingCartVisitor{

    @Override
    public int visit(Book book) {
        int cost = 0;
        if (book.getPrice()>700){
            System.out.println("Discount applied for "+book.getIsbn());
            cost = book.getPrice()-5;
            System.out.println("Effective price of "+book.getIsbn()+" is :"+cost);
        }else {
            cost = book.getPrice();
        }
        System.out.println("Book ISBN:"+book.getIsbn()+" & Price is:"+book.getPrice());
        return cost;
    }

    @Override
    public int visit(Fruit fruit) {
        int cost = fruit.getWeight()*fruit.getPrice();
        System.out.println(fruit.getWeight()+" kg is of "+fruit.getName()+" costing "+ cost);
        return cost;
    }
}