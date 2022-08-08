package behavioral.iterator.assignment;

public class Client {
    public static void print(Iterator iterator){
        while (!iterator.isDone()){
            System.out.println(iterator.next());
        }
    }
    public static void main(String[] args) {
        System.out.println("Iterator Design Pattern");
        System.out.println("=======================");

        Subject science = new Science();
        Subject arts = new Arts();

        Iterator scienceIterator = science.createIterator();
        Iterator artsIterator = arts.createIterator();

        System.out.println("Science group:");
        System.out.println("==============");
        print(scienceIterator);

        System.out.println("************************");

        System.out.println("Arts group:");
        System.out.println("==============");
        print(artsIterator);
    }
}
