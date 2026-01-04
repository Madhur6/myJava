public class whatIsCompileTimePoly {
    public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		System.out.println(cal.add(2, 4));
		System.out.println(cal.add(2, 3, 5));
		System.out.println(cal.add(2.5, 3.5));
		System.out.println(cal.add(5, 2.5));
	}
}


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

//      [Demonstrated in below example✔️]
//- 1). Compile-Time Polymorphism (Static Polymorphism): 
//			- Decision is made at "compile-time"
//			- Achieved using ------------------> Method Overloading 🚛
//			- Same method name
//			- Different parameter list (type / count / order)


//- 2). Run-Time Polymorphism (Dynamic Polymorphism): 
//      <<Read OOPS.txt>>






//________________________________________________________________

//⭐ Calculator ---------> add()

// Same class
// Same method name
// Different paramter lists

//________________________________________________________________



class Calculator {
	public int add(int a, int b) {
		return a+b;
	}
	
	public int add(int a, int b, int c) {
		return a + b + c;
	}
	
	public double add(double a, double b) {
		return a + b;
	}
	
	public double add(int a, double b) {
		return a + b;
	}
}
