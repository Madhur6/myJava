
//⭐ POLYMORPHISM DEEP DIVE
//
//- Demonstrates:
//		- Method overriding
//		- Static v/s Dynamic Binding
//		- Static / private / final method behaviour
//		- Upcasting & Downcasting
		
class Animal {
	// Instance method -> CAN be overridden
	public void speak() {System.out.println("...");}
	
	// Static method -> CAN'T be overridden (only hidden)
	public static void staticMethod() {
		System.out.println("Static method from Animal Class");
	}
	
	// Private static method -> NOT inherited
	private static void privateMethod() {
		System.out.println("Private static method from Animal Class");
	}
	
	// Final instance method -> CAN'T be overridden
	public final void finalMethod() {
		System.out.println("Final method from Animal");
	}
	
	// Private + final -> Exists ONLY inside Animal
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
	
	// ❌ Private methods CAN't be overridden
	private static void privateMethod() {
		System.out.println("Private static method from Duck!");
	}
	
	private final void privateFinalMethod() {
		System.out.println("Private final method from Duck!");
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
	
	// ❌ Private methods CAN't be overridden
	private static void privateMethod() {
		System.out.println("Private static method from Cat!");
	}
	
	private final void privateFinalMethod() {
		System.out.println("Private final method from Cat!");
	}
}



public class UpCastingEx {
	
	// Private static method belongs ONLY to this class
	private static void privateMethod() {
		System.out.println("Private method from UpCastingEx!");
	}
	
	// Utility method to demonstrate polymorphism
	public static void animalSpeak(Animal animal) {
		// Static binding -> Based on Reference Type
		animal.staticMethod();
	}
	
	
	public static void main(String[] args) {
		
//      ClassName obj = new Constructor();
		
//		ClassName         = reference type
//		Obj               = reference variable
//		new Constructor() = object creation (instance of ClassName)
	
		Duck donald = new Duck(); // reference: Duck | object: Duck
		
		Cat tom = new Cat();      // reference: Cat  | object: Cat
		
		
		// Instance methods -> Dynamic Binding
		donald.speak();
		tom.speak();
		
		// Static methods   -> Static Binding
		donald.staticMethod();
		tom.staticMethod();
		
		
		
//________________________________________________________________

//      Ignore this: Just for creating spaces b/w output on the cli.......
        System.out.println("********************************************************************************************************");
        System.out.println("                                                                                                        ");
        System.out.println("                                    ⭐ upandcode.com ⭐                                                  ");
        System.out.println("                                                                                                        ");
        System.out.println("********************************************************************************************************");

		
//        
//      ⭐ UpCasting ⭐
//        
//      Parent reference -> Child Object
        Animal a1 = new Duck(); // Implicit & Safe 
        
        a1.speak();         // 🟡 Dynamic Binding -> Duck.speak()
        
        Animal a2 = new Cat();  // Creating the object of child class "Cat" with reference to super-class "Animal".
//      *reference   *object
		//          /*
		//         /
		//        /
	    //      */
        a2.speak();         // 🟡 Dynamic Binding -> Cat.speak()
        
        a1.staticMethod();  // 🟡 Static Binding  -> Animal.staticMethod()
        a2.staticMethod();  // 🟡 Static Binding  -> Animal.staticMethod()
        
        
//________________________________________________________________

//      Ignore this: Just for creating spaces b/w output on the cli.......
        System.out.println("********************************************************************************************************");
        System.out.println("                                                                                                        ");
        System.out.println("                                    ⭐ upandcode.com ⭐                                                  ");
        System.out.println("                                                                                                        ");
        System.out.println("********************************************************************************************************");
        

        // Calling private static method of same class
        privateMethod();
        
        
        System.out.println("********************************** Animal - Speak - Method *********************************************");
        
        Animal a = new Cat();
        Animal b = new Duck();
        
        Animal[] objArr= {a,b, donald, tom};
        
        for (Animal obj: objArr) {
        	animalSpeak(obj);
        }
        
        
        System.out.println("*********************************** Down-Casting Concept **********************************************");
        
        Animal horse = new Duck(); // UpCasting
        Duck x = (Duck) horse;     // Explicit Downcasting
        
        Animal lion = new Cat();
        Cat y = (Cat) lion;
        
        x.speak();        // 🟡 Dynamic Binding -> Duck.speak()
        x.staticMethod(); // 🟡 Static Binding  -> Duck.staticMethod()
        
        y.speak();
        y.staticMethod();
        
	}
}



// Read OOPS.txt for theory...[https://github.com/Madhur6/myJava/blob/master/Java-II/OOPS.txt]
// _______________________________________________________________________________________

// 💡: ⭐ POLYMORPHISM ⭐

//     - One interface / parent type, Multiple implementations
//     - Ability of objects of different classes to be treated as instances of a common parent type.

//     ✔️ Pros
//         - Flexibility
//         - Extensibility
//         - Reduced coupling
//         - Code reusability

//     🐥 Ex. Animal → Dog / Elephant / Lion

    
//    ✔️ ⭐ Types of Polymorphism ⭐
        
//         - 1). Compile-Time Polymorphism (Static Polymorphism):

//                 - Achieved using ----------------> Method-OverLoading 🚛

//                 - Decision made at *compile-time*

//                 - Same method name, Different parameter list

//                 - ⚠️ Java doesn't support operator-overloading (except `+` for String concatenation)
                


//         - 2). Run-Time Polymorphism (Dynamic Polymorphism):

//                 - Achieved using -----------------> Method-OverRiding 🚴‍♀️
                
//                 - Decision made at *runtime*

//                 - Requires Inheritance



// _______________________________________________________________________________________


// - **Static-Binding**                                  |  - **Dynamic-Binding**
//                                                       |
//   - Aka *early-binding* because method to be called   |    - The type of object is determined at runtime.
//     is determined based on the reference-type not on  |      [Basically, Method Binding happens at run-time]
//     the object-type.                                  |
//                                                       |
//   - Resolved at compile-time.                         |    - Resolved at run-time.
//                                                       | 
//   - Applies to *static, private & final methods*      |    - Applies to over-ridden methods
//                                                       |    
//   - Faster execution                                  |    - Slightly slower (runtime-lookup 👀)
//                                                       |


//     ⚠️ Notes:
//         - Static-Methods can't be annotated with @Overridden.
  

//     ⭐  Parent p ================> new Child();
//          *reference*              *object-type*


//     ⭐ *UpCasting*:
//             - [Implicit & Safe] 
//             - We can only access the static-methods defined in super-class(Parent)
//             - We can access the overridden-methods of child-class.


//     ⭐ *DownCasting*: 
//             - [Explicit & Risky] 
//             - Explicitly converting *parent-reference* to *child-reference*
//             - We can access the sub-class specific methods.
//             - It must be done Explicitly.

// _______________________________________________________________________________________

