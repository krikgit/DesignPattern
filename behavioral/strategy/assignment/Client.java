package behavioral.strategy.assignment;

public class Client {
    public static void main(String[] args) {
        System.out.println("Strategy Design Pattern");
        System.out.println("======================");

        Context context = new Context();
        int result = context.execute(new Add(),2,3);
        System.out.println("Add  result is:"+result);
        result = context.execute(new Subtract(),2,3);
        System.out.println("Subtract  result is:"+result);
        result = context.execute(new Multiply(),2,3);
        System.out.println("Multiply  result is:"+result);
    }
}
