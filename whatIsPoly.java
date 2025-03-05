import java.util.*;

// pillars of oops:

// Inheritence : sub-Class inheriting from super-Class.
// Polymorphism: Ability of different classes to be treated as an instance of a same class
// Encapsulation
// Abstraction

// polymorphism: Poly -> more than one
             //  Morph-> taking up a form

// classes -> object
// oops -> inheritence -> "extends"

// 

// Animal --------------> Category -----> Speak (behaviour)

// class Dog extends Animal

// class Duck extends Animal

// class Cat extends Animal


class Animal {
    public void speak(){
        System.out.println("...");
    }
}

class Dog4 extends Animal {
}

class Duck extends Animal {
    public void speak(){
        System.out.println("Quack!");
    }
}



public class whatIsPoly {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        // Polymorphism

        Dog4 goofy = new Dog4();

        Duck donald = new Duck();

        donald.speak();
        goofy.speak();
    }
}

// Polymorphism So far...