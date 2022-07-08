package creational.abstractfactory.assignment;

interface MovieFactory {
   Bollywood getBollywoodMovieName(String type);
   Hollywood getHollywoodMovieName(String type);
}


class ActionMovie implements MovieFactory{


    @Override
    public Bollywood getBollywoodMovieName(String type) {
        Bollywood b = null;
        if(type.equalsIgnoreCase("Bollywood")){
            b = new BollywoodAction();
        }
        return b;
    }

    @Override
    public Hollywood getHollywoodMovieName(String type) {
        Hollywood h = null;
        if(type.equalsIgnoreCase("Hollywood")){
            h = new HollywoodAction();
        }
        return h;
    }
}
class ComedyMovie implements MovieFactory{


    @Override
    public Bollywood getBollywoodMovieName(String type) {
        Bollywood b = null;
        if(type.equalsIgnoreCase("Bollywood")){
            b = new BollywoodComedy();
        }
        return b;
    }

    @Override
    public Hollywood getHollywoodMovieName(String type) {
        Hollywood h = null;
        if(type.equalsIgnoreCase("Hollywood")){
            h = new HollywoodComedy();
        }
        return h;
    }
}
