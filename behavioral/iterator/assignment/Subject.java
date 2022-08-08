package behavioral.iterator.assignment;

import java.util.LinkedList;

public interface Subject {
    Iterator createIterator();
}

class Science implements Subject{
    private LinkedList<String> subjects;
    public Science(){
        subjects = new LinkedList<>();
        subjects.add("Life Science");
        subjects.add("Physics");
    }

    @Override
    public Iterator createIterator() {
        return new ScienceIterator(subjects);
    }
}
class Arts implements Subject{
    private String[] subjects;
    public Arts(){
        subjects = new String[2];
        subjects[0] = "Bengali";
        subjects[1] = "English";
    }

    @Override
    public Iterator createIterator() {
        return new ArtsIterator(subjects);
    }
}
