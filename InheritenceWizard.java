class Wizardd {
    public String name;

    public Wizardd(String name){
        this.name = name;
    }   

    @Override
    public String toString(){
        return "Whatever i want";
    }
}

class Teacherr extends Wizardd {
    public String subject;

    public Teacherr(String name, String subject) {
        super(name);
        this.subject = subject;
    }
}

class Studentt extends Wizardd {
    public String house;

    public Studentt(String name, String house){ 
        super(name);
        this.house = house;
    }
} 

public class InheritenceWizard {
    public static void main(String[] args) {
        Teacherr snape = new Teacherr("Snape", "Potions");
        Studentt harry = new Studentt("harry", "gryffindor");

        System.out.println("***-------------------***");
        System.out.println(harry);
        System.out.println("***-------------------***");

        System.out.println("Teacher name is: " + snape.name + "& Subject: " + snape.subject);
        System.out.println("Student name is: " + harry.name + " House: " + harry.house);
    }
}