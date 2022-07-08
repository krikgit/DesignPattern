package creational.abstractfactory.assignment;

public class Client {
    public static void main(String[] args) {
        MovieFactory movieFactory = GenerFactoryProducer.getMovieGener("Action");
        movieFactory.getBollywoodMovieName("Bollywood").getMovieName();
        movieFactory.getHollywoodMovieName("Hollywood").getMovieName();

        movieFactory = GenerFactoryProducer.getMovieGener("Comedy");
        movieFactory.getBollywoodMovieName("Bollywood").getMovieName();
        movieFactory.getHollywoodMovieName("Hollywood").getMovieName();
    }
}
