// [Abililty of classes to be treated as instance of a same class]

class Animal {
    public void speak(){
        System.out.println("...");
    }
}


class Dog extends Animal {
    @Override
    public void speak(){
        System.out.println("Woof Woof!");
    }
}


class Duck extends Animal {
    @Override
    public void speak(){
        System.out.println("Quack Quack!");
    }
}

class Cat extends Animal {
    @Override
    public void speak(){
        System.out.println("Meow Meow!");
    }
}


public class polyEx{
    public static void main(String[] args){
        // Basic-Polymorphism
        Dog pluto = new Dog();
        Duck donald = new Duck();
        Cat tom = new Cat();


        // Object array
        Animal[] arr = {pluto, donald, tom};


        // As animalSpeak is not a 'Static-method', I can not instantiate it directly...
        // So i have to create an object of my 'main class [polyEx]' and invoke animalSpeak through that object...

        polyEx pe = new polyEx();

        // for (int i = 0; i < 3; i++){
        //     // animalSpeak(arr[i])  // This does not work
        //     pe.animalSpeak(arr[i]);
        // }

        // Instead use For-Each Loop
        for (Animal a: arr){
            pe.animalSpeak(a);
        }
    }


    public void animalSpeak(Animal animal){
        animal.speak();
    }
}