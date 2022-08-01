package structural.composite.assignment;

import java.util.ArrayList;
import java.util.List;

public class Supervisor implements  Faculty{

    private  String name;
    private String dept;
    private List<Faculty> list;

    public Supervisor(String name, String dept) {
        this.name = name;
        this.dept = dept;
        this.list = new ArrayList<>();
    }

    public void add(Faculty professor){
        list.add(professor);
    }

    public void remove(Faculty professor){
        list.remove(professor);
    }

    public List<Faculty> getFaculties(){
        return list;
    }
    @Override
    public String getDetails() {
        return (name +"is the "+dept);
    }
}
