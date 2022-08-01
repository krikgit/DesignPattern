package structural.decorator.example.input;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Client {
    public static void main(String[] args) {
        System.out.println("Decorator Design Pattern");
        System.out.println("------------------------");

        int c;
        InputStream in = null;
        try{
            in = new LowerCaseInputStream(
                    new BufferedInputStream(
                            new FileInputStream("./src/structural/decorator/example/input/test.txt"))
            );
            while ((c = in.read()) >= 0){
                System.out.println((char)c);
            }
        }catch(Exception e){
            e.getStackTrace();
        }finally {
            if (in != null){
                try{
                    in.close();
                }catch (Exception e){

                }

            }
        }
    }
}
