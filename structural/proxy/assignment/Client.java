package structural.proxy.assignment;

public class Client {
    public static void main(String[] args) {
        System.out.println("Proxy Design Pattern");
        System.out.println("------------------------");

        Internet internet = new ProxyInternet();

        try{
            internet.connected("google.com");
            internet.connected("whatever.com");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Proxy hitted.");
        }
    }
}
