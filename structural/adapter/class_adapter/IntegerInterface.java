package structural.adapter.class_adapter;

public interface IntegerInterface {
    public int getValue();
}
class IntegerVal implements IntegerInterface{

    @Override
    public int getValue() {
        return  5;
    }
}

class ClassAdapter extends IntegerVal{
    @Override
    public int getValue() {
        return  2 + super.getValue();
    }
}

class ObjectAdapter{
    IntegerInterface integerInterface;

    public ObjectAdapter(IntegerInterface integerInterface) {
        this.integerInterface = integerInterface;
    }

    public int getValue() {
        return  2 + this.integerInterface.getValue();
    }

}