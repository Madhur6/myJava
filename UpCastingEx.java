import java.util.*;

class Animal {
	public void speak() {
		System.out.println("...");
	}
	
	public static void staticMethod() {
		System.out.println("Static method from Animal!");
	}
	
	
	private static void privateMethod() {
		System.out.println("Private method from Animal!");
	}
	
	// Won't even allow me to define it inside my sub-classes, Let alone using it...
	public final void finalMethod() {
		System.out.println("Final method from Animal!");
	}
	
	// If my final method is "private"
	private final void privateFinalMethod() {
		System.out.println("Private final method from Animal!");
	}
}

class Dog extends Animal {
	@Override // We are using the instance/concrete-method from our Super-Class and modifying it.
	public void speak() {
		System.out.println("Woof!");
	}
	
//	@Override // Can not be override
	public static void staticMethod() {
		System.out.println("Static method from Dog!");
	}
	
	private static void privateMethod() {
		System.out.println("Private method from Animal!");
	}
	
//  When it is public, It should be overridden, But since it is final, It can not be overridden
//	public final void finalMethod() {
//		System.out.println("Final method from Animal!");
//	}
	
	// This final method belongs to the class Dog only, and private-final method from animal does not even exists for Dog class, So no conflicts...
	private final void privateFinalMethod() {
		System.out.println("Private final method from Animal!");
	}
}

class Duck extends Animal {
	@Override
	public void speak() {
		System.out.println("Quack!");
	}
	
	public static void staticMethod() {
		System.out.println("Static method from Duck!");
	}
	
//	@Override, Can not override private methods, Because they can not be accessed outside their class
	private static void privateMethod() {
		System.out.println("Private method from Animal!");
	}
	
//  When it is public, It should be overridden, But since it is final, It can not be overridden
//	public final void finalMethod() {
//		System.out.println("Final method from Animal!");
//	}
	
	
	// This final method belongs to the class Dog only, and private-final method from animal does not even exists for Dog class, So no conflicts...
	private final void privateFinalMethod() {
		System.out.println("Private final method from Animal!");
	}
}

class Cat extends Animal {
	@Override
	public void speak() {
		System.out.println("Meow!");
	}
	
	public static void staticMethod() {
		System.out.println("Static method from Cat!");
	}
}


public class UpCastingEx {
	
	private static void privateMethod() {
		System.out.println("Private method from Animal!");
	}
	
	// Just for better design of my code...
	public static void animalSpeak(Animal animal) {
		animal.staticMethod();
	}
	
	
	public static void main(String[] args) {
		
		Dog goofy = new Dog();
//		*reference  *object
		
		
		Duck donald = new Duck();
//		*reference  *object
		
		goofy.speak();        // dynamic-binding will be applied
		goofy.staticMethod(); // static-binding will be applied
		
		donald.speak();
		donald.staticMethod();
		
		System.out.println("*---------------------*");
		
		// UpCasting
		Animal g = new Dog(); // Creating the object of child class "Dog" with reference to super-class "Animal".
//      *reference *object
		//          /*
		//         /
		//        /
	    //      */
		g.speak();        // dynamic binding will be applied
		
		g.staticMethod(); // What is gonna happen here? static method from dog! x
		
		
		System.out.println("*---------------------*");
		
		// Accessing private-static method from my own class
		privateMethod();
		
		
		System.out.println("*----------Animal Speak Method-----------*");
		
//		int[] arr = new int[4]; // Created an array of integer elements of size 4 [0,0,0,0]
//		int[] arr = {1,2,3,4}; // it will create an array with integer elements: [1,2,3,4]
		
		
		// Object array
		Animal a = new Dog();
		Animal b = new Duck();
		Animal c = new Cat();
		
		Animal[] arr = {a, b, c, goofy, donald}; // Created an array of Animal elements/objects [obj, obj, obj]
		
		for (int i = 0; i < arr.length; i++) {
			animalSpeak(arr[i]);
		}
		
		
		
		System.out.println("*----------Down-Casting-Concept-----------*");
		
//		Super-class obj1 = new Child(); // UpCasting, Implicit
		
//		Child-class obj2 = new Super(); // DownCasting, But this is not how you "DownCast" | Implicit Downcasting doesn't work
		
		// Implicit DownCasting
		
		
//		int x = 12; // explicitly defining that "x" is an integer
//		var x = 12; // implicitly defining that "x" is an integer
		
//		String x = "hello"; // Explicitly defining that "x" is a String
//      var x = "hello"; // implicitly defining that "x" is a string
		
		
		// Explicit Downcasting
//	    int x = (float)12; // Explicit type-casting
		
//		Animal horse = new Animal();
		Animal horse = new Dog();
		
		Dog x = (Dog) horse;
		
		x.speak();
		x.staticMethod();
		
		
		
	}

}

//
//### Polymorphism
//
//- **Static or Compile** ----------------> Method-Overloading
//        |
//        |
//        |
//        V
//      Operator-Overloading
//
//
//
//- **Dynamic or Runtime** -----------------> Virtual/Over-riding method


//  
//  - *UpCasting*: We can only access the static-methods defined in super-class(Parent)
//                 We can access the overridden-methods of child-class.
//
//
//  - *DownCasting*: We can access the sub-class specific methods.
//                   It must be done Explicitly.






//Parent p ================> new Child();
//*reference*              *object-type*
//
//
//- **Static-Binding**                                |    - **Dynamic-Binding**
//                                                    |
//- Aka *early-binding* because method to be called   |    - The type of object is determined at runtime.
//  is determined based on the reference-type not on  |
//  the object-type.                                  |
//                                                    |
//- Resolved at compile-time.                         |    - Resolved at run-time.
//- Applies to static, private & final methods.       |    - Applies to over-ridden methods
//- Based on reference-type.                          |    - Based on actual-types.
//                                                    |
//                                                    |
//                                                    |
//                                                    |
//
//- **Note**: Static-Methods can't be annotated with @Overridden.