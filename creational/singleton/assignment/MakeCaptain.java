package creational.singleton.assignment;

public class MakeCaptain {

    private MakeCaptain(){}

    private static class SingletonHelper{
        private static final MakeCaptain captain = new MakeCaptain();
    }
    public static MakeCaptain getCaptain(){
        return SingletonHelper.captain;
    }

}
