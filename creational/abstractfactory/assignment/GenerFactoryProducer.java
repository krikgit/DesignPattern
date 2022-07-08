package creational.abstractfactory.assignment;

public class GenerFactoryProducer {
    public static MovieFactory getMovieGener(String input){
        MovieFactory movieFactory = null;
        if(input.equalsIgnoreCase("Comedy")){
            movieFactory = new ComedyMovie();
        } else if (input.equalsIgnoreCase("Action")) {
            movieFactory = new ActionMovie();
        }
        return movieFactory;
    }
}
