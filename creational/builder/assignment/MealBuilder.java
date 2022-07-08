package creational.builder.assignment;

interface MealBuilder {
    void buegerBuilder();
    void coldDrinksBuilder();
    Meal getMeal();
}

class VegMeal implements MealBuilder{

    private Meal meal=new Meal();

    @Override
    public void buegerBuilder() {
        meal.addItem(new VegBurger());
    }

    @Override
    public void coldDrinksBuilder() {
        meal.addItem(new Coke());
    }

    @Override
    public Meal getMeal() {
        return meal;
    }
}

class NonVegMeal implements MealBuilder{

    private Meal meal=new Meal();

    @Override
    public void buegerBuilder() {
        meal.addItem(new ChickenBurger());
    }

    @Override
    public void coldDrinksBuilder() {
        meal.addItem(new Sprite());
    }

    @Override
    public Meal getMeal() {
        return meal;
    }
}
