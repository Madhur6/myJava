class Mac {
    private int age;
    private String name;

    public Mac(int age, String name){
        this.age = age;
        this.name = name;
    }

    // Getter
    public int getAge(){return age;}
    
    public String getName(){return name;}
}

// Cat person: mr whiskerson

// he likes to roam around my entire house... and visits places he is not supposed to...
// Now i have trained him in order to create boundaries around him.

public class macEx {
    public static void main(String[] args){

        Mac air = new Mac(12, "madhur");

        // System.out.println(air.name + " " + air.age); // We can not access name & age using "." operator, 
        // Because we have defined the variables name & age as "private variables" inside our class "Rational".

        System.out.println(air.getName() + " " + air.getAge());
        
    }
}