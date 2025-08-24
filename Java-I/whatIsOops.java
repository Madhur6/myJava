package newStart;

// < Class-Students-Starts >
class Student {
	// ⭐ Attributes:
	// 			- Variables that define the "properties/state" of a class
	// 			- Also called "field" or "member-variables".
	
    public String name;
    public int age;

    // ⭐ Constructors: 
    //			- Allows us to "initialize" the objects of a class
    //
    // 			- Have the same name as class
    //
    // 			- Do Not Have a Return Type (Not even "Void")
    //
    //			- There exists a "default-constructor" for every class.
    //				- public className(){}
    //
    //			- there can exists more than 1 constructors, Also with parameters👀

    // non-parameterized constructor
    public Student(){
    }

    // parameterized constructor
    //             <    parameters     >
    public Student(int age, String name){
        this.age = age;
        this.name = name;   
    }

    
    // ⭐ Methods: 
    //			- Behaviours or Actions represented by class
    //       	- Behaviours are non-static

    // access-modifier     return-type        name
    public                 void               speak(){
        System.out.println("Hello, World!");
    }
}
// < Class-Students-Ends >






// ✨ Main-Class

public class whatIsOops {
    // Main method: Entry point of our program
	//				1					2						3					4		5		6
    // contains access-modifier      static/non-static         return-type         name (parameter) {}
    public static void main(String[] args){
        whatIsOops w = new whatIsOops(); // Initializing object called "w" of class whatIsOops().
        //																	    ⏫ constructor() ⏫
    }



    // Method: Behaviour / Action
    // access-modifier     return-type        name ( < parameter > ) {}
    public int add(int a, int b){
        return a + b;
    }
}



// // There are "access modifiers"
// // - Private
// // - public
// // - default
// // - protected


// -----------------------------------------------------------------------------------------------------------------------------





// // Function / Method:

// // Input (parameters / arguments) -------------> [ Mathematical formula / Black-Box ] ----------------> Output (return value)
// //                                                         (a * b)
// // 2,4                                                                                                     0.5




// -----------------------------------------------------------------------------------------------------------------------------
