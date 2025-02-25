import java.util.*;

public class primitive{
    public static void main(String[] args){

        // Primitive-Types are immutable...........................How?
        
        int a = 3;
        int b = a;

        System.out.println("a: " + a + " & b: " + b);

        // Both pointing at the same memory address...
        
        // Note: (System.identityHashCode tells us the memory address at which the value of that variable is stored at.)

        System.out.println("Before mutation -> a: " + System.identityHashCode(a) + " & b: " + System.identityHashCode(b));
        
        // If u try to mutate/change/update the variable "a", It will assign it new memory location...
        a = 8;
        
        System.out.println("a: " + a + " & b: " + b);

        // You can clearly see the "a" is now pointing at some other memory location but "b" is still pointing at old "a"'s memory location...
        System.out.println("After mutation -> a: " + System.identityHashCode(a) + " & b: " + System.identityHashCode(b));


      
        // Ignore this: Just for creating spaces b/w output on the cli.......
        System.out.println("********************-----------------------------------------------------------------------------************************");
        System.out.println("                                                                                                                         ");
        System.out.println("                                                                                                                         ");
        System.out.println("                                                                                                                         ");
        System.out.println("********************-----------------------------------------------------------------------------************************");




        // Primitive-Types are passed by value----------------------How?

        Scanner sc = new Scanner(System.in);  // Scanner, allows me to take input from user from cli

        System.out.print("Enter a: ");
        int c = sc.nextInt();

        System.out.print("Enter b: ");
        int d = sc.nextInt();


        System.out.printf("C is %d & D is %d%n", c, d);

        swap(c, d);  // m1 
        // I have called the method 'swap' on a & b here and then i am printing it later on...

        System.out.printf("** C is %d & D is %d <The values do not swap here> %n", c, d); // What would be the output here?

        // Conclusion: PRIMITIVE-TYPES ARE PASSED BY VALUES...............................................



    }

    // m1-------------------------------------------------------------------------------------------------
    public static void swap(int x, int y){
        System.out.println("Swap method starts executing!");
        System.out.printf("X is %d & Y is %d%n", x, y);

        // third glass technique...(temp)
        int temp = x;
        x = y;
        y = temp;

        System.out.printf("X is %d & Y is %d%n", x, y);

        System.out.println("Swap method done executing!");
    }
}


// ***----------------------------------------***-------------------------------------------***--------------------------

    //     // We will be diving into little bit of programming logic...
    //     // Third glass technique...
    //     // Assume you have 2 drinks in 2 glasses...both of them are full...
    //     // I ask you to swap the drinks in the glasses...?
    //     // How would you approach it?

    //     // Empty glass <--- drink 1
    //     // drink2 -----------> glass 1
    //     // glass2 <----------empty glass drink 



// ***----------------------------------------***-------------------------------------------***--------------------------




//         // Underlying detail that we needed to cover 

//         // javascript, python
//         // Loosely typed language
//         // const a = 12;
//         // a = 13; throws an error
//         // let a = 12; // js engine which decides what type of variable it is...
//         // a = 12




// ***----------------------------------------***-------------------------------------------***--------------------------




//                     old bikes 
// Invocation: bikes? kick-start & self-start, Starting your engine via self-start...

// Without kick-start/self-start, The engine won't start automatically?


// Invocation: we're calling the function with some values or without values...




// ***----------------------------------------***-------------------------------------------***--------------------------



//     // Method: Static, But ignore static for now, Focus on method...
//     public         static              void           Swap       (int x, int y){
// //access-modifier  static/non-static   return type    name     arguments/parameter(0 or more are allowed)
        