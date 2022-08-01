package structural.facade.example;

public class Client {
    public static void main(String[] args) {
        System.out.println("Facade Design Pattern");
        System.out.println("------------------------");

        Amplifier amp = new Amplifier("Boat Amplifier");
        Tuner tuner = new Tuner("Boat AM/FM Tuner", amp);
        DvdPlayer dvd = new DvdPlayer("Boat DVD Player", amp);
        CdPlayer cd = new CdPlayer("Boat CD Player", amp);
        Projector projector = new Projector("Boat Projector", dvd);
        TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
        Screen screen = new Screen("Theater Screen");
        PopcornPopper popper = new PopcornPopper("Popcorn Popper");

        HomeTheaterFacade facade =
                new HomeTheaterFacade(amp, tuner, dvd, cd, projector, screen, lights, popper);

        facade.watchMovie("3 idiots");
        System.out.println("==============End==================");
        facade.endMovie();
    }
}
