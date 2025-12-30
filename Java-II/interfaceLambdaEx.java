public class interfaceLambdaEx {
	public static void main(String[] args) {
		PickUp phone = () -> "hello, Harry speaking!";
		System.out.println(phone.pick());
		
		
		Predicate isEven = n -> n % 2 == 0;
		System.out.println(isEven.presume(10));
		
		
		Anonymous add = (a, b) -> a + b;
		System.out.println(add.calculate(10, 5));
		
	}
}

interface PickUp {
	String pick();
}


interface Predicate {
	boolean presume(int n);
}


interface Anonymous {
	int calculate(int a, int b);
}