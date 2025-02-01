import java.io.*;
import java.util.*;

// Custom Exception
class NotFoundException extends Exception {
    public NotFoundException(String msg){
        super(msg);
    }
}

// Main class
public class exceptionEx {
    static Scanner sc = new Scanner(System.in);

    void f1() throws IOException {
        throw new IOException("Device not found!");
    }

    void f2() throws IOException {
        f1();
    }

    void calling(){
        try {
            f2();
        } catch (Exception e){
            System.out.println("Handled!");
        }
    }
        
    public static void main(String[] args){
        // ------------------------------------------------------------------------------------
        int a = 10;

        int b = 0;

        try {
            int x = a / b;
        } catch (ArithmeticException e){
            // System.out.println(e.getMessage());
            System.out.println("Caught the arithmetic exception!");
            // System.out.println(e.getStackTrace());
        } finally {
            System.out.println("Finally block always runs!");
        }


        
        // --------------------------------------------------------------------------------------
        try {
            throwException();
        } catch (NotFoundException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("This code-block always gets executed!");
        }


        // ---------------------------------------------------------------------------------------
        try {
            causeNumberFormatException();
        } catch (NumberFormatException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("This block (from causeNumberFormatException()) always runs!");
        }



        // f1()-----------------------------------------------------------------------------------
        exceptionEx obj = new exceptionEx();
        obj.calling();

    }


    // Method which throws the "NotFoundException"-------------------------------------
    public static void throwException() throws NotFoundException {
        int age;

        while (true){
            System.out.print("Enter <18 if you want error to occured: ");
            age = sc.nextInt();sc.nextLine();
            
            if (age == 5){
                throw new NotFoundException("This is my custom error message!");
            } else {
                System.out.println("You don't want error to occur: " + age);
            }
        }
    }


    // Method to cause NumberFormatException -------------------------------------------
    public static void causeNumberFormatException() {
        System.out.print("Enter any alphabet to cause 'NumberFormatException': ");
        String s = sc.nextLine();
        int x = Integer.parseInt(s);
    }


}