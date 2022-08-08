package behavioral.iterator.assignment;

import java.util.LinkedList;

interface Iterator {
    void first(); //resetting to initial position
    String next();
    boolean isDone();
    String currentItem();
}
class ScienceIterator implements Iterator{

    private LinkedList<String> list;
    private  int position;
    public ScienceIterator(LinkedList<String> list){
        this.list = list;
        position = 0;
    }

    @Override
    public void first() {
        position =0;
    }

    @Override
    public String next() {
        return list.get(position++);
    }

    @Override
    public boolean isDone() {
        return position>=list.size();
    }

    @Override
    public String currentItem() {
        return list.get(position);
    }
}
class ArtsIterator implements Iterator{
    private String[] subjects;
    private  int position;
    ArtsIterator(String[] subjects){
        this.subjects = subjects;
        position = 0;
    }

    @Override
    public void first() {
        position = 0;
    }

    @Override
    public String next() {
        return subjects[position++];
    }

    @Override
    public boolean isDone() {
        return position>= subjects.length;
    }

    @Override
    public String currentItem() {
        return subjects[position];
    }
}