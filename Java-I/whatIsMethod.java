package newStart;

public class whatIsMethod {
	// Main method: Entry point of our program
	public static void main(String[] args) {
		
		whatIsMethod w = new whatIsMethod(); // Initializing an object called "w" of our 
											 // main-class, To call "add" method/behaviour
											 // (Needed because "add" is non-static method 💡)
		
		// Behaviour a.k.a. Concrete method
		// invoking/calling a method
		w.add(1,2); 	
		
		// invocation of a method ?
		//	 Q.	  How can i use it here?
		//   ans. Invocation,
		//			Ex. Phone > if u have opened ur phone > at your homescreen >
		//				Instagram-Logo (method) > Tap that logo, invoking the instagram (calling)

	}
	
	// Behaviour of our main-class 👀
	// 	- Typically modeled with instance method (Non-static)
	// 	- Defines what an object of this class can-do🏃‍♂️
	public void add(int a, int b) {
		System.out.println(a+b);
	}
}



// Function / Method:

// Input (parameters / arguments) -------------> [ Mathematical formula / Black-Box ] ----------------> Output (return value)
//                                                              (a * b)
// 2,4                                                                                                     0.5



