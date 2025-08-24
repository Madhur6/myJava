package newStart;


class Apple {
    public int concreteMethod(){
        return 12;
    }

    public static int staticMethod(){
        return 123;
    }
}

public class staticMethod {
    public static void main(String[] args){
    	
    	System.out.println("Accessing methods from my own class*-------------------------------");
    	// Methods from My own main class
//    	add(1,3); // i can not do this, Because in order to access the concrete methods, I need to create the objects
    	
    	staticMethod sm = new staticMethod();
    	System.out.println(sm.add(1, 3)); // Yayyyyyyyyyyyyyyyyyy! 😊
    	
    	System.out.println(sub(10,1)); // But i can access the static method without creating the object...
    	
    	
    	System.out.println("Accessing methods from my different class*-------------------------------");
    	
    	// Methods from different class
        Apple a = new Apple();
        System.out.println(a.concreteMethod());
//        System.out.println(Apple.concreteMethod()); // I can not do this, Because it is a "concrete-method".
        System.out.println(Apple.staticMethod()); // I can access this from class itself, Because it is a "static-method".
        System.out.println(a.staticMethod()); // But I can access it from object as well...
        
    }
    
    public int add(int x, int y) {
    	return x + y;
    }
    
    public static int sub(int x, int y) {
    	return x - y;
    }
}


