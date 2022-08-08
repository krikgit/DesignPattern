package behavioral.chain_of_responsibility.example;

import java.util.Scanner;

public class Client {
    private DispenseChain chain50;

    public Client(){
        chain50 = new Rupees50Dispensor();
        DispenseChain chain20 = new Rupees20Dispensor();
        DispenseChain chain10 = new Rupees10Dispensor();
        //setting responsibility
        chain50.setNextChain(chain20);
        chain20.setNextChain(chain10);
    }

    public static void main(String[] args) {

        System.out.println("Chain of Responsibility Design Pattern");
        System.out.println("========================================");

        Client atmDispensor = new Client();

        int amount = 0;
        System.out.print("Enter amount to dispense:");
        Scanner scanner = new Scanner(System.in);
        amount = scanner.nextInt();

        if(amount%10 !=0){
            System.out.println("Amount should be multiple of 10");
            return;
        }
        atmDispensor.chain50.dispense(new  Currency(amount));
    }
}
