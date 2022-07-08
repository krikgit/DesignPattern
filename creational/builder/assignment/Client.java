package creational.builder.assignment;

public class Client {
    public static void main(String[] args) {

        Director director = new Director();
        System.out.println("Veg Order");
        System.out.println("-----------");
        MealBuilder vegMealBuilder = new VegMeal();
        director.construct(vegMealBuilder);
        Meal vegMeal = vegMealBuilder.getMeal();
        vegMeal.ShowDetails();
        System.out.println("Total cost:"+vegMeal.getCost());

        System.out.println("Non Veg Order");
        System.out.println("-------------");
        MealBuilder nonVegMealBuilder = new NonVegMeal();
        director.construct(nonVegMealBuilder);
        Meal nonVegMeal = nonVegMealBuilder.getMeal();
        nonVegMeal.ShowDetails();
        System.out.println("Total cost:"+nonVegMeal.getCost());

    }
}
