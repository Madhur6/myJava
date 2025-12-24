package begin;


import java.util.*;

public class primitiveAndNonPrimitive{
    public static void main(String[] args){

        // Primitive-Types are value types...........................How?
        
        int a = 3;
        int b = a;

        System.out.println("a: " + a + " & b: " + b);

        // At this point:
        //  - a stores value 3
        //  - b stores a COPY of value 3
        //  - No objects exist, only raw values

        // Note:
        // System.identityHashCode(variable) works ONLY with objects(Reference types).
        // When we pass a primitive-type variable to it, Java AUTOBOXES it into a WRAPPER object (Integer).
        
        System.out.println("Before mutation -> a: " + System.identityHashCode(a) + " & b: " + System.identityHashCode(b));
        
        // Due to Integer Caching (-128 to 127),
        // Both a & b are boxed to the SAME Cached Integer(3) object,
        // So the identityHashCode appears the same for both.

        // Reassigning primitive 'a'
        a = 8;
        
        System.out.println("a: " + a + " & b: " + b);

        // What actually happened?
        //  - The value stored in variable 'a' was REPLACED with 8
        //  - Variable 'b' still holds it's own copied value 3
        //  - No memory location of 'b' was ever shared with 'a'

        
        System.out.println("After mutation -> a: " + System.identityHashCode(a) + " & b: " + System.identityHashCode(b));

        // identityHashCode now differs because:
        //  - 'a' is autoboxed to Integer(8)
        //  - 'b' is autoboxed to Integer(3)
        // These are Difference cached Integer objects.

        
      
        // Ignore this: Just for creating spaces b/w output on the cli.......
        System.out.println("********************-----------------------------------------------------------------------------************************");
        System.out.println("                                                                                                                        ");
        System.out.println("                                                                                                                         ");
        System.out.println("                                                                                                                         ");
        System.out.println("********************-----------------------------------------------------------------------------************************");




        // Primitive-Types are PASSED BY VALUE ----------------------How?

        Scanner sc = new Scanner(System.in);  // Scanner, allows me to take input from user from cli

        System.out.print("Enter a: ");
        int c = sc.nextInt();

        System.out.print("Enter b: ");
        int d = sc.nextInt();


        System.out.printf("Before Swap: C is %d & D is %d%n", c, d);

        swap(c, d);  // method call

        System.out.printf("After Swap: C is %d & D is %d <The values do not swap here> %n", c, d); // What would be the output here?

    
        // C & D remain unchanged because only COPIES of their values were passed
        
        // Conclusion: 
        // PRIMITIVE-TYPES ARE PASSED BY VALUES
        // The method receives copies of the values, not the original variables.😉

        // ⚠️NOTE:
        // Java is strictly Pass-by-value.
        // Even Reference-types are passed by value of the reference.
        // Meaning, a copy of the reference (memory address) is passed to the method.

        
        // Ignore this: Just for creating spaces b/w output on the cli.......
        System.out.println("********************-----------------------------------------------------------------------------************************");
        System.out.println("                                                                                                                        ");
        System.out.println("                                                                                                                         ");
        System.out.println("                                                                                                                         ");
        System.out.println("********************-----------------------------------------------------------------------------************************");

        
        // ⚠NOTE:
        // Same logic, But with Strings(Reference-Types) 😉
        
        sc.nextLine(); // Refer to 👉 consumeBuffer.java

        System.out.print("Enter s: ");
        String s = sc.nextLine();

        System.out.print("Enter t: ");
        String t = sc.nextLine();


        System.out.printf("Before Swap: S is %s & T is %s%n", s, t);

        swap2(s, t);  // method call

        System.out.printf("After Swap: S is %s & T is %s %n", s, t); // What would be the output here?

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




    // m2-------------------------------------------------------------------------------------------------
    public static void swap2(String x, String y){
        System.out.println("Swap method starts executing!");
        System.out.printf("X is %s & Y is %s%n", x, y);

        // third glass technique...(temp)
        String   temp = x;
        x = y;
        y = temp;

        System.out.printf("X is %s & Y is %s%n", x, y);
        System.out.println("Swap method done executing!");
    }
}


// ***----------------------------------------***-------------------------------------------***--------------------------

    //     ⭐ We will be diving into little bit of programming logic...
    //     // Third glass technique...🥂
    //     // Assume you have 2 drinks in 2 glasses...both of them are full...
    //     // I ask you to swap the drinks in the glasses...?
    //     // How would you approach it?

    //     // Empty glass <--------- drink 1
    //     // drink2      ---------> glass 1
    //     // glass2      <--------- empty glass drink 



// ***----------------------------------------***-------------------------------------------***--------------------------




//         ⭐ Underlying detail that we needed to cover 

//         // javascript, python etc...
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


//     ⭐ Method Syntax: Static, But ignore static for now, Focus on method...

//     public         static              void           Swap       (int x, int y,...){

// access-modifier | static/non-static | return type |   name   |  arguments/parameter(0 or more are allowed)



// ***----------------------------------------***-------------------------------------------***--------------------------
