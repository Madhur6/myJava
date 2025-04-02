package begin;

import java.util.ArrayList;
import java.util.Scanner;

public class fibonacciEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking input from the user
        System.out.print("Enter n: ");
        int x = sc.nextInt(); // Primitive type (pre-defined)
        
        Integer x2 = x; // Wrapper class (Non-primitive type)
        
        int res = fibonacci(x);
        System.out.println("The Fibonacci value at position " + x + " is: " + res);
        
        sc.close(); // Closing scanner
    }
    
    /**
     * Recursive method to calculate Fibonacci number at position x
     * Time Complexity: O(2^n) (Exponential growth due to repeated calculations)
     * Space Complexity: O(n) (Due to recursive stack calls)
     */
    public static int fibonacci(int x) {
        // Base Cases
        if (x == 0) return 0;
        if (x == 1) return 1;
        
        // Recursive Case
        return fibonacci(x - 2) + fibonacci(x - 1);
    }
    
    /**
     * Placeholder for an alternative iterative Fibonacci implementation using ArrayList.
     */
    public static int fibonacciIterative(int x) {
        ArrayList<Integer> sequence = new ArrayList<>(); // Dynamic array
        
        // TODO: Implement an iterative approach
        return 1;
    }
}

// Topics to cover with Ron:
// - Array Sorting
// - Recursion -> Recursion in arrays, quick-sort, backtracking
// - Inheritance
// - Access Modifiers
// - Polymorphism -> Compared to interfaces
// - Linked List -> Circular, doubly linked, recursion in lists, sorting in lists
// - Stack / Queue / Binary Tree -> BST
//
// Data Structures and Algorithms (DSA) Topics:
// - Binary Search
// - Sorting Algorithms
// - Basic Data Structures (Hash Tables)
// - Binary Search Trees (BST)
// - AVL Trees
// - Graphs
//
// ---------------------------------------------------------------------------
//
// **Primitive Data Types** vs. **Non-Primitive Data Types**
//
// - Primitive Data Types:
//   - Passed by value
//   - Basic data types (Pre-defined)
//   - Not objects
//   - Immutable
//   - Non-nullable
//   - Stored directly in stack memory
//   - Do not have methods
//   - Example: byte, short, int, long, float, double, char, boolean
//
// - Non-Primitive Data Types:
//   - Passed by reference
//   - Reference types
//   - Are objects
//   - Can be immutable/mutable
//   - Nullable
//   - Stored in heap memory (Reference stored in stack)
//   - Have methods
//   - Example: ArrayList (Mutable), Arrays, Strings, Wrapper Classes (Immutable), Custom Objects
//
// **Note:** Strings are immutable objects.
//
// ---------------------------------------------------------------------------
//
// Pascal's Triangle: Represents coefficients of binomial expressions
//
// Example: (a + b)^2 = a^2 + 2ab + b^2
// Triangle Representation:
//        1
//       1 1
//      1 2 1
//     1 3 3 1
//    1 4 6 4 1  -> Coefficients for (a + b)^4
//
// Thank you, Ron, for teaching the trick to remember powers in binomial expansion! 👍✨