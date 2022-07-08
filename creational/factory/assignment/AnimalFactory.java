package creational.factory.assignment;

public class AnimalFactory {

    public static Animal getAnimal(String s){
        Animal animal = null;
        if(s.equalsIgnoreCase("D")){
            animal = new Duck();
        }else if (s.equalsIgnoreCase("T")){
            animal = new Tiger();
        }
        return  animal;
    }
}
