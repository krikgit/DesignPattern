package creational.prototype.assignment;

import java.util.Hashtable;

public class CarCache {
    public static Hashtable<String,BasicCar> carHashtable = new Hashtable<>();

    public static BasicCar getCar(String car){
        BasicCar cachedCar = carHashtable.get(car);
        return (BasicCar) cachedCar.clone();
    }

    public static void loadCar(){
        Nano nano = new Nano();
        nano.setName("Nano");
        nano.setColor("Green");
        nano.setPrice(5500000);
        carHashtable.put(nano.getName(),nano);

        Ford ford = new Ford();
        ford.setName("Ford");
        ford.setColor("Yellow");
        ford.setPrice(77000000);
        carHashtable.put(ford.getName(),ford);
    }
}
