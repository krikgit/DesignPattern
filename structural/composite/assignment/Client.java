package structural.composite.assignment;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        System.out.println("Composite Design Pattern");
        System.out.println("------------------------");

        Supervisor techDean = new Supervisor("Dr Mike", "Dean Technology");
        Supervisor mathDean = new Supervisor("Dr John", "Dean Math");
        Supervisor cseDean = new Supervisor("Dr Ian", "Dean Computer");

        Professor mathPro1 = new Professor("Ram","Lecturer",567);
        Professor mathPro2 = new Professor("sam","Temp Lect.",540);

        Professor csePro1 = new Professor("Jam","Lecturer",521);
        Professor csePro2 = new Professor("Pam","Professor",568);
        Professor csePro3 = new Professor("Vam","Temp Lecturer",521);
        //math & cse hod report head dean
        techDean.add(mathDean);
        techDean.add(cseDean);
        //math professors report hod of math
        mathDean.add(mathPro1);
        mathDean.add(mathPro2);
        //cse professors report hod of computer
        cseDean.add(csePro1);
        cseDean.add(csePro2);
        cseDean.add(csePro3);

        System.out.println("Dean:"+techDean.getDetails());
        List<Faculty> hods = techDean.getFaculties();
        System.out.println("HODs are:");
        for(int i=0;i<hods.size();i++){
            System.out.println("\t"+hods.get(i).getDetails());
        }
        System.out.println("Math Professors are:");
        List<Faculty> mathProf = mathDean.getFaculties();
        for (int i=0;i<mathProf.size();i++){
            System.out.println("\t"+mathProf.get(i).getDetails());
        }
        System.out.println("Computer Professors are:");
        List<Faculty> cseProf = cseDean.getFaculties();
        for (int i=0;i<cseProf.size();i++){
            System.out.println("\t"+cseProf.get(i).getDetails());
        }

    }
}
