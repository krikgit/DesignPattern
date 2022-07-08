package creational.builder.assignment;

public class Director {

    private  MealBuilder builder=null;
    public void construct(MealBuilder builder){
        this.builder=builder;
        builder.buegerBuilder();
        builder.coldDrinksBuilder();
    }
}
