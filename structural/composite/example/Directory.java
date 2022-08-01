package structural.composite.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Directory implements Employee{

    private List<Employee> list = new ArrayList<>();

    public void addEmployee(Employee employee){
        list.add(employee);
    }

    public void removeEmployee(Employee employee){
        list.remove(employee);
    }
    @Override
    public void show() {
        for (Employee employee:list){
            employee.show();
        }
    }
}
