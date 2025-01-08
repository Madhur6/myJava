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
}



public class abstractEx{
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


        // HomeWorK: round the result to 2 decimal points only?
    }
}