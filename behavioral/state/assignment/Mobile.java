package behavioral.state.assignment;

interface Mobile {
    public void alert(Alerts type);
}

class Vibrate implements Mobile{

    @Override
    public void alert(Alerts type) {
            System.out.println("In vibration mode & making it to the Silent...");
            type.setState(new Silent());

    }
}

class Silent implements Mobile{

    @Override
    public void alert(Alerts type) {

            System.out.println("In Silent mode & making it to the Vibrate...");
            type.setState(new Vibrate());

    }
}
