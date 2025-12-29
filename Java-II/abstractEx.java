// // Can have abstract & concrete methods.
// // Can have instance variables.
// // Can have access-modifiers.
// // Can have constructors as well.

abstract class shape {
    
    // Can have constructors-------------------------
    shape(){
        System.out.println("Can have constructors!");
    }


    // abstract method (no body)
    abstract double calculateArea();

    // concrete method (with body)
    public void display(){
        System.out.println("This is display!");
    }


    @Override
    public abstract String toString();
}



class circle extends shape {
    public double radius;

    circle(double radius){
        this.radius = radius;
    }

    @Override
    public double calculateArea(){
        return Math.PI*radius*radius;
    }

    @Override
	public String toString() {
		return "Computing amount for circle of radius " + this.radius;
	}


}


class rectangle extends shape{
    public double length, width;

    rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea(){
        return length * width;
    }

	@Override
	public String toString() {
		return "Computing area for Rectangle of length " + this.length + " & width: " + this.width;
	}
}


class triangle extends shape {
    public double length, width;

    triangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea(){
        return (((double)1/2)*(this.length * this.width));
    }


	@Override
	public String toString() {
		return "Computing area for Triangle of length " + this.length + " & width: " + this.width;
	}
}



public class abstractEx{
    private static double coverage;

    public abstractEx(double coverage){
        this.coverage = coverage;
    }

    public static double amount(shape obj){
        return obj.calculateArea() / coverage;
    }

    public static void main(String[] args){
        // Abstract class-[Basic]-------------------------------------------------------------

        // shape s = new shape();  // is this correct? no. It'll show error as 'abstract-classes' can not be instantiated.

        shape c = new circle(5);  // instantiation (creating an instance) & this is also an 'UpCasting'

        shape r = new rectangle(7,8);  // instantiation (creating an instance) & this is also an 'UpCasting'

        c.display();
        r.display();

        double resC = c.calculateArea();
        double resR = r.calculateArea();

        System.out.println("result of c: " + resC);
        System.out.println("result of r: " + resR);


        // Figuring out the amount of paint required for a particular surface...
        abstractEx ax = new abstractEx(350);
        shape c2 = new circle(4);
		System.out.println("Amount of paint required is " + amount(c2));

        shape r2 = new rectangle(10, 20);
		System.out.println("Amount of paint required is " + amount(r2));

        shape t = new triangle(10, 14);
        System.out.println("Amount of paint required is " + amount(t));
        
        // HomeWorK: round the result to 2 decimal points only?
    }
}