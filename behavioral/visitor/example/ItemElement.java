package behavioral.visitor.example;

interface ItemElement {
    public int accept(ShoppingCartVisitor visitor);
}
class Book implements ItemElement{
    private int price;
    private String isbn;

    public Book(int price, String isbn) {
        this.price = price;
        this.isbn = isbn;
    }
    @Override
    public int accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}

class Fruit implements ItemElement{
    private int price;
    private int weight;
    private String name;

    public Fruit(int price, int weight, String name) {
        this.price = price;
        this.weight = weight;
        this.name = name;
    }

    @Override
    public int accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}