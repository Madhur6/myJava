import java.io.IOException;
import java.util.Scanner;

//object > throwable > exception
// exception directly inherits throwable: checked [compile time] (io / sql / network / class)
// unchecked (run time): arithmetic / array / 


// Custom Exceptions as well...
class NotFoundException extends Exception {
	// Constructor
	NotFoundException(String s){
		super(s);
	}
}


public class exceptionEx3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		exceptionEx3 ex3 = new exceptionEx3();
//		ex3.  // Try looking at all the methods inside our own class using '.' operator...
		
		
		System.out.print("Enter a: ");
		int a = sc.nextInt();
		
		System.out.print("Enter b: ");
		int b = sc.nextInt();
		
		try {
			int res = staticMethod(a,b);
			System.out.println("The result is: " + res);
		} catch (ArithmeticException e) {
			
//			System.out.println("Do not enter 0 as input please!");
			e.printStackTrace();
			System.out.println("My custom message is: " + e.getMessage());
		}
		
		System.out.println("I want to execute this no matter what!");
		
		
		try {
			System.out.println(customError(a, b));
		} catch (NotFoundException e) {
			System.out.println(e.getMessage());
		}

	}
	
	public static int staticMethod(int x, int y) throws ArithmeticException {
		if (y == 0) {
			throw new ArithmeticException("Do not enter 0 as input please!");
		}
		
		return x / y; // If i enter y = 2, will it still cause exception ? No
		// else if i enter y = 0, It will "throw" the exception
	}
	
	
//	public void calculate(int x) {
//		int p = sc.nextInt();
//		int q = sc.nextInt();
//		
//		
//	}
	
	void foo() throws IOException {
		throw new IOException("Input output device not found!");
	}

	void bar() throws IOException {
		foo();
	}

	void baz() {
		try {
			bar();
		} catch (Exception e) {
			System.out.println("The exception from baz: " + e.getMessage());
		}
	}
	
	
	// To demonstrate custom error message....
	public static int customError(int x, int y) throws NotFoundException {
		if (y == 0) {
			throw new NotFoundException("Not found exception occured!");
		}
		return x / y;
	}
	
	
}
