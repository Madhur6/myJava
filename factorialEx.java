package begin;

import java.util.Scanner;

public class factorialEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking input from the user
        System.out.print("Enter n: ");
        int x = sc.nextInt();
        
        // Calculating factorial using the recursive method
        int resFact = factRecursive(x);
        System.out.println("Factorial (Recursive) of " + x + " is: " + resFact);
        
        // Calculating factorial using the iterative method
        int resFactIter = factIterative(x);
        System.out.println("Factorial (Iterative) of " + x + " is: " + resFactIter);
        
        sc.close(); // Closing the scanner
    }
    
    /**
     * Recursive method to calculate factorial
     * Time Complexity: O(n)
     * Space Complexity: O(n) (due to recursive stack calls)
     */
    public static int factRecursive(int x) {
        // Base Case: 0! = 1! = 1
        if (x == 0 || x == 1) {
            return 1;
        }
        // Recursive Case: n! = n * (n-1)!
        return x * factRecursive(x - 1);
    }
    
    /**
     * Iterative method to calculate factorial
     * Time Complexity: O(n)
     * Space Complexity: O(1) (only a few integer variables are used)
     */
    public static int factIterative(int x) {
        int product = 1;
        while (x >= 1) {
            product *= x;
            x -= 1;
        }
        return product;
    }
}
