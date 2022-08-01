package structural.composite.assignment;

public interface Faculty {

    public String getDetails();
}

class Professor implements Faculty{
    private  String mName;
    private  String mPosition;
    private int officeNum;

    public Professor(String mName, String mPosition, int officeNum) {
        this.mName = mName;
        this.mPosition = mPosition;
        this.officeNum = officeNum;
    }

    @Override
    public String getDetails() {
        return (mName+" is the "+mPosition);
    }
}