package newStart;

import java.util.*;

public class cliEx {
    public static void main(String[] args){
//    - main method: [Entry-point of out program]
//    - String[]: To accept the `cli` arguments. (command line interface)
//    - args: Accessible as array of string. [can be hello/apple/args/etc]
//    - Can also write: (String...args) [Allows method to accept 0 or more arguments.]
    	
    	// ✨ 1.
    	// Taking input directly from `cli` 😮
    	// ____________________________________________________________________________________________________________________
		// 1). javac cliEx.java       					 ---> [/packageName] Creates a .class file (compiles) [/packageName]
		// 2). cd..
		// 3). java packageName.cliEx arg1 arg2 arg3 ... ---> Runs the program (from parent folder) 😉
    	// ____________________________________________________________________________________________________________________
    	
    	if (args.length > 0) {
    		System.out.println("Reading directly from `cli`: " + Arrays.toString(args));
    	} else {
    		System.out.println("No arguments passed from `cli`!");
    	}
    	
    	
    	// ✨ 2.
    	System.out.println("--------------------<Taking input during run-time using 'Scanner'>--------------------");
    	// Scanner class is used,
    	//		- To take input from "user" during "run-time"
        Scanner sc = new Scanner(System.in);
    	
        // ____________________________________________________________________________________________________________________
    	
         System.out.print("Enter a word: ");
         
         String t = sc.next(); // Consumes only the first / single word from the input-buffer 
         // //USER INPUT: apple_, WILL CONSUME "apple" AS IT IS, BUT THERE IS _ LEFT IN THE BUFFER...
         
         // ⭐ printf: < Formatted String >
         System.out.printf("The input from cli is: %s", t); 
         
         // 💫 Without additional sc.nextLine() here,
         // 	⚠⚠⚠ scanner might think that there is something left in the input buffer...(input stream from cli)
         // 	SO WHEN USER ENTERS A WORD, IT MIGHT ASSUME THAT THERE IS A SPACE LEFT, i.e. \0
         
         // 💫 With additional sc.nextLine() here,
         // 	Whatever left in the input-buffer will be consumed! 😉
         sc.nextLine(); 
         
         System.out.println();
        
    	// ____________________________________________________________________________________________________________________
    	
        // System.out.print("Enter a string input: ");
        // String s = sc.nextLine();

        // System.out.printf("The input from cli is: %s", s);

        
    	// ____________________________________________________________________________________________________________________
        String[] strArr = new String[5];
        for (int i = 0; i < 5; i++){
            System.out.print("Enter string element " + (i+1) + ": ");
            String s = sc.nextLine();

            strArr[i] = s;
        }

        System.out.println("The string array: " + Arrays.toString(strArr));
        
    	// ____________________________________________________________________________________________________________________
    	
        // Refer to lectureI.txt's chapter 4
        
        // Also try, sc.nextInt() / sc.nextFloat() / sc.nextDouble() / sc.nextBoolean() / sc.nextByte() / sc.nextShort() 😎
   
        
     // ------------------------------------------------------------------------------------<CHAPTER-IV>-----------------------------------------------------------------------------------------------
     // Data - Types in JAVA

     // --- Primitive Types ---
        
     //     boolean       // true or false
     //     float         // Single-precision (4 bytes) | e.g., 3.14f
     //     double        // Double-precision (8 bytes) | e.g., 3.14159265358979
     //     byte          // Integer (1 byte) | Range: -128 to 127
     //     short         // Integer (2 bytes) | Range: -32,768 to 32,767
     //     int           // Integer (4 bytes) | Range: -2^31 to 2^31-1
     //     long          // Integer (8 bytes) | Range: -2^63 to 2^63-1 | e.g., 123L
     //     char          // Single character (2 bytes) | Unicode values
      
     // --- Reference Types (Non-Primitive) ---

     //     String        // Ex., "Hello, Java!"
     //     int[]         // Array of integers
     //     ArrayList     // Dynamic array | java.util.ArrayList
     //     LinkedList    // Dynamic list | java.util.LinkedList
     //     Map           // Key-value pairs | java.util.HashMap
     //     Set           // Unique collection | java.util.HashSet
     //     Pair          // Tuple-like structure | javafx.util.Pair
        
     // continues... ✔
     // ------------------------------------------------------------------------------------<CHAPTER-IV>-----------------------------------------------------------------------------------------------
        

    }
}