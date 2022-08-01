package structural.composite.example;

import creational.builder.assignment.Director;

public class Client {
    public static void main(String[] args) {
        System.out.println("Composite Design Pattern");
        System.out.println("------------------------");

        Directory developers  = new Directory();
        Employee dev = new Developer(100,"kk","pro");
        Employee _dev = new Developer(101,"ikk","expert");
        developers.addEmployee(dev);
        developers.addEmployee(_dev);

        Directory managers  = new Directory();
        Employee man = new Manager(200,"Sri","Delivery");
        Employee _man = new Manager(201,"Srip","HR");
        managers.addEmployee(man);
        managers.addEmployee(_man);

        Directory company = new Directory();
        company.addEmployee(developers);
        company.addEmployee(managers);
        company.show();

    }
}
