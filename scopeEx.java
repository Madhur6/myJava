
/*
 * ======================================================
 * Java Variable and Scope Demonstration
 * ======================================================
 *
 * Variable:
 *   - A variable is a named memory location that holds data.
 *   - It can be accessed and modified during runtime, hence the name "variable".
 *   - Types of variables in Java:
 *       1. Instance Variables
 *       2. Static (Class) Variables
 *       3. Local Variables
 *       4. Parameters (Method arguments)
 *
 * Scope of Variables:
 *   - The scope defines the region of the program where a variable can be accessed.
 *   - Local Scope: within method/block
 *   - Instance Scope: tied to object instances
 *   - Class Scope (static): shared among all instances of the class
 *
 * Object:
 *   - An object is an instance of a class.
 *   - Each object can hold different values for instance variables.
 *
 * Instance Variable:
 *   - Declared within a class but outside any method.
 *   - Each object has its own copy.
 *
 * Static Variable:
 *   - Declared with the `static` keyword.
 *   - Belongs to the class, not the object.
 *   - Shared among all instances.
 */

public class scopeEx {
	int x = 10; // Instance variable - Each object has its own copy
	static int y = 11; // Static variable - Shared among all objects

	public static void main(String[] args) {
		// Creating an object of scopeEx class
		scopeEx sE = new scopeEx();

		// Accessing instance variable through object
		System.out.println("Instance variable x (via object): " + sE.x);

		// Accessing static variables
		System.out.println("Static variable from another class (Students.schoolName): " + Students.schoolName);
		System.out.println("Static variable y (via class name): " + scopeEx.y);
		System.out.println("Static variable y (directly, from static context): " + y);

		// Creating multiple objects of Students class
		Students harry = new Students();
		Students hermionne = new Students();

		// Assigning values to instance variables
		harry.name = "harry-potter";
		hermionne.name = "hermionne-granger";
		harry.age = 12;
		hermionne.age = 11;

		// Accessing instance variables (unique to each object)
		System.out.println(harry.name + " | " + hermionne.name);
		System.out.println(harry.age + " | " + hermionne.age);

		// Accessing static variable (shared among all instances)
		System.out.println(harry.schoolName + " | " + hermionne.schoolName);

		// Invalid: Cannot access instance variable 'name' using class name
		// System.out.println(Students.name); // This will cause an error

		// Valid: Accessing static variable using class name
		System.out.println(Students.schoolName);
	}
}

class Students {
	// Instance variables: Unique to each object
	int age;
	String name;

	// Static variable: Shared across all instances
	static String schoolName = "Delhi public school";
}


/*
 * =============================================
 * Extra Notes:
 * =============================================
 *
 * Local Variables:
 *   - Declared inside a method or block.
 *   - Scope is limited to that method/block.
 *   - Must be initialized before use.
 *
 * Parameter Variables:
 *   - Passed to methods/functions.
 *   - Scope limited to method execution.
 *
 * Final Variables:
 *   - Declared using `final` keyword.
 *   - Once assigned, cannot be changed.
 *
 * Static Methods:
 *   - Can access only static data directly.
 *   - Cannot access instance variables/methods directly.
 *
 * Best Practices:
 *   - Use meaningful variable names.
 *   - Avoid using static variables for mutable data unless truly shared.
 *   - Always initialize local variables.
 */
