package begin;

import java.util.Arrays;

public class stringArgs {
	public static void main(String... args) {
    	// ✨ 1.
    	// Taking input directly from `cli` 😮
    	// ____________________________________________________________________________________________________________________
		// 1). javac cliEx.java       					 ---> [/packageName] Creates a .class file (compiles) [/packageName]
		// 2). cd..
		// 3). java packageName.cliEx arg1 arg2 arg3 ... ---> Runs the program (from parent folder) 😉
    	// ____________________________________________________________________________________________________________________
    	
		System.out.println("hello, world!");
		
		System.out.println(args.getClass());
		System.out.println(Arrays.toString(args));
		
		
		
		// ✨ 2.
		arrayMethod(new String[] {"a", "b"}); // Works 😉
//		arrayMethod("a", "b");                // Doesn't Works ⚠️
		
		
		
		// ✨ 3.
		varArgsMethod(new String[] {"a", "b"});
		varArgsMethod("a", "b");
	}
	
	// method-I
	public static void arrayMethod(String[] args) {
		System.out.println("String[] args --> example");
		System.out.println(Arrays.toString(args));
	}
	
	
	// method-II
	public static void varArgsMethod(String... args) {
		System.out.println("String... args --> example");
		System.out.println(Arrays.toString(args));
	}
}
