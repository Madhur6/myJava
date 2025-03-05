
import java.awt.Color;
import java.util.Scanner;


// Single-Level Inheritence Example----------------------------------*--------------------------------------------------*----------

// Base-Class / Super-Class
class Car {
    public int price;
    public int year;
    public String modelName;
    public Color myColor;

    // constructor: Allows us to create the object...
    //        < parameters >
    public Car(int p, int y, String mn, Color c){
        this.price = p;
        this.year = y;
        this.myColor = c;
        this.modelName = mn;
    }

    // ToString method comes to rescue us programmers...
    @Override // annotations
    public String toString(){
        return "****** Car name: " + this.modelName + "| Car price: " + this.price + "| Car launch year: " + this.year + "| Car color: " + this.myColor + "  |  ****"; // original behaviour of "toString" method was to return an empty string,
        // But since we're overriding it, We are going to return whatever we want from this method called "toString".
    }
}


// Single-level inheritence

class EV extends Car {
    public int range;

    public EV(int p, int year, String modelName, Color color, int range){
        super(p, year, modelName, color);
        this.range = range;
    }

    @Override // annotations
    public String toString(){
        return "****** Ev Car name: " + this.modelName + "| Ev Car price: " + this.price + "| Ev Car launch year: " + this.year + "| Ev Car color: " + this.myColor + "  | Ev Car range: " + this.range; // original behaviour of "toString" method was to return an empty string,
        // But since we're overriding it, We are going to return whatever we want from this method called "toString".
    }
}



// Multi-Level Inheritence Example----------------------------------*--------------------------------------------------*----------

// base-class  <Grand-parent>
class Shape {
    private int height;

    public Shape(int height){
        this.height = height;
    }

    // getter
    public int getHeight(){
        return height;
    }

    // setter
    public void setHeight(int h){
        this.height = h;
    }
}


// derived-class  [single-level]   <Parent>
class Triangle extends Shape{
    private int width;

    public Triangle(int h, int w){
        super(h);
        this.width = w;
    }

    // getter
    public int getWidth(){return width;}

    // setter
    // width = 10; ----> 15; < t.width = 15; > x |  t.setWidth(15);
    public void setWidth(int w){
        this.width = w;
    } // consistency is the key.
}


// sub-derived-class [multi-level]    <Child>
class EquiTriangle extends Triangle {
    public EquiTriangle(int h, int w){
        super(h, w);
    }
}

// Hierarchial Inheritence
class Circle extends Shape {
    private int radius;
    
    public Circle(int r, int h){
        super(h);
        this.radius = r;
    }

    public int getRadius(){return radius;}
    public void setRadius(int r){
        this.radius = r;
    }
}


// A ---------> B ----------> C



// Heirarchial Inheritence Example----------------------------------*--------------------------------------------------*----------

// super-class
class Wizard {
    public String name;

    public Wizard(String name){
        this.name = name;
    }
}



//                   wizard class
            //           /   \
            //         /      \
 // level I //       /         \ level I
            //     /            \
            //    /              \
            //  teacher        student


// derived-class
class Teacher extends Wizard {
    public String subject;

    public Teacher(String name, String subject){
        super(name);
        this.subject = subject;
    }
}

// derived-class
class Student extends Wizard {
    public String house;

    public Student (String name, String house){
        super(name);
        this.house = house;
    }
}






public class whatIsInheritence {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // ***-----------------Single-Level--------------------------***
        Car honda = new Car(1000, 2019, "civic", Color.BLACK);

        System.out.println(honda);

        Car mercedes = new Car(3000, 2025, "c-class", Color.MAGENTA);

        System.out.println(mercedes); // without "toString"
        
        // In programming world, We programmers tends to optimize things whenever possible! So why not here...

        EV tesla = new EV(2000, 2024, "y-model", Color.GRAY, 500);

        System.out.println(tesla);




        // ***-----------------Multi-Level--------------------------***
        Triangle tr = new Triangle(12, 12);
        EquiTriangle et = new EquiTriangle(12, 14);

        System.out.println(et.getHeight() + " **😊💡** " + et.getWidth());
                            // shape                         // triangle
        
        // Represents the hierarchial [ If we look at the entire structure of our code ]
        Circle c = new Circle(5, 5);
        System.out.println(c.getHeight() + " " + c.getRadius());


        // ***-----------------Hierarchial-Inheritence--------------------------***

        Teacher t = new Teacher("Snape", "Potion");

        Student s = new Student("Harry-potter", "gryffindor");

        System.out.println(t.name + " " + t.subject);

        System.out.println(s.name + " " + s.house);
    }
}


// Car class ----------single-level--------------> Ev class
// base-class                          derived class


// Inheritence: Child inheriting properties from parent...

//                    [Base-Class ---------> Derived-Class]
//                      parent                 child


// parent ----------------level I----------------> child
// base-class                                  derived-class

// types: 

// single-level

// multi-level

// base-class -----------level I ----------> derived-class --------level II -------> sub-derived-class
// Grand-father                              father                                  child

// hierarchial 

// base-class ------------Level I -------------> derived-class
// father                                          You
    //  |
    //  |
    //  |
    //  Level I
    //  |
    //  |
    //  v
    // derived-class
    // Brother/ Sister


// 


// hybrid: combination of any two or three...

// multiple: Doesn't exist in java... [we will go over this later...]




   // base-class                      sub-class
//  Shape ------------single-level--------------> Triangle ------multi-level----------> EquiLateral-Triangle
    //   |
    //   |
    //   |
    //   v
    // circle
    // hierarchial
