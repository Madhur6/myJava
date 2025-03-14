// import java.util.*;

// public class exceptionEx2 {
//     public static void main(String[] args){
//         int a = 10;
//         int b = 0;
//         Scanner sc = new Scanner(System.in);


//         int s;
//         while (true){
//             try {
//              s = sc.nextInt(); 
//              break;  
//             } catch (InputMismatchException e) {
//                 System.out.println("i can handle it!");sc.nextLine();
//             } finally {
//                 System.out.println("Always runs!");
//             }
//         }

//         // try {
//         //     int x = a/b;   
//         // } catch (ArithmeticException e) {
//         //     System.out.println("My custom message!");
//         // }
       
//         // System.out.println(x);
    
//     }
// }



// *------------------------**------------------------**------------------------**------------------------**------------------------**------------------------**------------------------*


import java.util.InputMismatchException;
import java.util.Scanner;

public class exceptionEx2 {
    public static void main(String[] args) {
        exceptionEx2 ed = new exceptionEx2 ();

        // If you want to know, The exact type of exception that your method might throw, Try to run the method without using try-catch at first...
        // ed.testingArr();

        // Demonstrating exception handling with array operations
        try {
            ed.testingArr();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: Do not exceed the array's size!");
            System.out.println("Exception Message: " + e.getMessage());
        } finally {
            System.out.println("[INFO] Finally block executed: This always runs, whether an exception occurs or not.");
        }

        // Ensuring program flow continues even after an exception
        System.out.println("[RESULT] The sum of 5 and 3 is: " + ed.add(5, 3));
    }

    // Method to demonstrate unchecked (runtime) exceptions
    public void testingArr() throws IndexOutOfBoundsException {
        Scanner scanner = new Scanner(System.in);
        
        // InputMismatchException
        System.out.print("Enter the size of the array (recommended: 3): ");
        int size = 3; // Default size, If the input is not integer...

        try {
            size = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input (Please do not enter string or chars, Just the integers)! Using default size: 3");
            scanner.nextLine(); // Clear buffer
        }


        // IndexOutOfException
        int[] arr = new int[size];
        System.out.println("[INFO] Array of size " + size + " initialized.");

        try {
            for (int i = 0; i <= size; i++) { // Intentionally causing an exception
                arr[i] = 1;
                System.out.println("[INFO] Set arr[" + i + "] = 1");
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("[ERROR] Attempted to access an out-of-bounds index!");
            throw e; // Re-throwing exception to be caught in main
        }
    }

    // Simple addition method
    public int add(int x, int y) {
        return x + y;
    }

    /*
     * Difference between throw and throws:
     * -------------------------------------
     * throw:
     * - Used inside a method or block to explicitly throw an exception.
     * - Can throw only a single exception at a time.
     * - Requires an instance of an exception to be thrown.
     * - Example: throw new ArithmeticException("Cannot divide by zero");
     * 
     * throws:
     * - Declares exceptions that a method can potentially throw.
     * - Can specify multiple exceptions separated by commas.
     * - Used in method signatures to indicate exception handling responsibility.
     * - Example: public void readFile() throws IOException, FileNotFoundException {}
     */
}
