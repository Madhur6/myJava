
//⭐ pillars of oops:

//1. Inheritence  : Sub-Class inheriting from super-Class.

//2. Polymorphism : Ability of objects of different classes to be treated as instances of a common parent-class.

//3. Encapsulation: <<Read OOPS.txt>>

//4. Abstraction  : <<Read OOPS.txt>>



//⭐ Polymorphism: 
//  Poly -> more than one
//  Morph-> taking up a form
//       -> One interface / parent-type, Many behaviours

//________________________________________________________________



//✔️ ⭐ Types of Polymorphism ⭐
//
//- 1). Compile-Time Polymorphism (Static Polymorphism): 
//				<<Read OOPS.txt>>
//


//      [Demonstrated in below example✔️]
//- 2). Run-Time Polymorphism (Dynamic Polymorphism): 
//
//        - Achieved using -----------------> Method-OverRiding 🚴‍♀️
//        
//        - Decision made at *runtime*
//
//        - Requires Inheritance










//________________________________________________________________

//⭐ Animal ---------> speak()

//class Dog extends Animal

//class Duck extends Animal

//class Cat extends Animal

// Dog, Duck, Cat -> Different implementations of speak()


//________________________________________________________________



class Animal {
	public void speak() {
		System.out.println("Animal makes a sound...");
	}
}


class Dog extends Animal {
	@Override
	public void speak() {
		System.out.println("Woof Woof🐕");
	}
}


class Duck extends Animal {
	@Override
	public void speak() {
		System.out.println("Quack Quack🦆");
	}
}


class Cat extends Animal {
	@Override
	public void speak() {
		System.out.println("Meowwwww😻");
	}
}






public class whatIsRuntimePoly {
	public static void main(String[] args) {
		
//      Runtime-Polymorphism (Method-Overriding)
		Dog pluto = new Dog();
		Duck donald = new Duck();
		Cat tom = new Cat();
        
//      Same method call -> Different behavior
		pluto.speak();
		donald.speak();
		tom.speak();
		
		
		
//________________________________________________________________

//      Ignore this: Just for creating spaces b/w output on the cli.......
        System.out.println("********************************************************************************************************");
        System.out.println("                                                                                                        ");
        System.out.println("                                    ⭐ upandcode.com ⭐                                                  ");
        System.out.println("                                                                                                        ");
        System.out.println("********************************************************************************************************");



		
		
		
//      Advance-Version 😉
		
//      Animal a1 = new Dog();  // Upcasting | 
//      Animal a2 = new Duck(); // Upcasting |  
//      Animal a3 = new Cat();  // Upcasting | 
        
//      <<Read OOPS.txt>>
//      Animal[] objArr = {a1, a2, a3}; // Works exactly like below objArr 
        
		Animal[] objArr = {pluto, donald, tom}; // Object Array👀
		
//      ⚠️ Note:
//		As animalSpeak() is not a 'Static-method', I can not instantiate it directly...
//      So i have to create an object of my 'main class' and invoke animalSpeak through that object...

	
		whatIsRuntimePoly mainClassObj = new whatIsRuntimePoly();
		
		for (int i = 0; i < 3; i++) {
			
//			animalSpeak(objArr[i]); // ❌
			
			mainClassObj.animalSpeak(objArr[i]);
		}	
    }
	
	
	public void animalSpeak(Animal animal) {animal.speak();}
}
