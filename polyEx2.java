
// import java.util.ArrayList;


// class Studentt{
//     String name;

    

//     // String method of java..
//     // pre-defined method which returns string/text to the user, Related or irrelevant to the class itself.
//     @Override
//     public String toString(){
//         // return "Student name is: " + name;
//         return "return anything i want from this class!";
//     }

//     // java itself have a method called "toString"
// }


public class polyEx2{
    public static void main(String[] args){
        int x = 10; // primitive: don't have any methods associated with them
        Integer a = x; // non-primitive/wrapper-class: so that we can have methods for integers aswell

        // auto-boxing


        // un-boxing
        int y = a; // un-boxing
        int g = 33;

        Integer h = 11;
        System.out.println((Object)h.getClass().getSimpleName());

        // wrapper-class real world---- uses: there interface/classes which requires object(non-primitive)

        // ArrayList<Integer> arrList = new ArrayList<>();
        // // array-list is actually a generic collections part and i can use int here with the help of the wrapper clas


        // Studentt harry = new Studentt("harry");
        // System.out.println(harry.name);
        

        // copy-constructor
        // Studentt ron = new Studentt(harry);
        // System.out.println(ron.name);

        // default-constructor
        // Studentt harry = new Studentt();
        // harry.name = "harry-potter";
        // System.out.println(harry); // do u see what i am printing here?
        // //

        // Carr vw = new Carr(2020, "polo", 150, 10, "Diesel");
        // System.out.println(vw.getYear());

        // i just want to display the entire details of this car object just in a single line\
        // System.out.println(vw); // it's about convenience


        var u = 10;
        System.out.println(x);

    }
}


class Carr {
    private int year;
    private String modelName;
    private int maxSpeed;
    private int avg;
    private String type;

    public Carr (int year, String modelName, int maxSpeed, int avg, String type){
        this.year = year;
        this.modelName = modelName;
        this.maxSpeed = maxSpeed;
        this.avg = avg;
        this.type = type;
    }

    public int getYear(){return year;} // getter 
    public void setYear(int year){this.year = year;}  // setter


    @Override
    public String toString(){
        return "Year: " + this.year + "| model name: " + this.modelName + "| max-speed: " + this.maxSpeed;
    }
    
}