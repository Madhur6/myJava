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
         // //USER INPUT: apple_(space), WILL CONSUME "apple" AS IT IS, BUT THERE IS _ LEFT IN THE BUFFER...
         
         // ⭐ println: < Formatted String >
            System.out.println("The input from cli is: " + t + ":)"); // Analyze that :) doesn't contains the space that user entered!

         // ⭐ printf: < Formatted String >
         //  System.out.printf("The input from cli is: %s %s", t, ":)");
         
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
        
        // Also try, sc.nextInt() / sc.nextFloat() / sc.nextDouble() / sc.nextBoolean() / sc.nextByte() / sc.nextShort() 😎

    }
}