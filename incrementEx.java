
public class incrementEx {
    public static void main(String[] args) {
        
        // Demonstrating increment & decrement operations
        int x = 10, y = 12;

        System.out.println("Initial x: " + x);

        // Post-increment (x++): Uses x first, then increments
        // Pre-increment (++x): Increments x first, then uses it
        int addition = x++ + ++x;  
        
        // Breakdown:
        // x++ (Post-increment): Uses x (10), then increments to 11
        // ++x (Pre-increment): Increments x (11 -> 12), then uses 12
        // Result: 10 + 12 = 22

        System.out.println("Addition's result: " + addition);
        System.out.println("Final x after operations: " + x); // x is now 12
    }
}

