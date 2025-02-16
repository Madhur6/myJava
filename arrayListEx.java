import java.util.*;

public class arrayListEx {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // ArrayLists are only single-dimensional
        // ArrayLists have dynamic size
        
        // ArrayList of integer elements------------------------------------------------------------------------------------
        ArrayList<Integer> arr = new ArrayList<>(); // Notice, I have not defined size for this...
        for (int i = 0; i < 3; i++){
            System.out.print("Enter element " + (i+1) + ": ");
            arr.add(sc.nextInt());
        }

        System.out.println(arr);

        // ArrayList of String elements------------------------------------------------------------------------------------
        ArrayList<String> arr1 = new ArrayList<>();
        for (int i = 0; i < 4; i++){
            System.out.print("Enter element: " + (i+1) + ": ");
            arr1.add(sc.nextLine());
        }

        // Similarly we can create arrayLists of boolean, objects... Let's see how to create an arrayList of objects
        ArrayList<Studentt> objArrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++){
            System.out.print("Enter age for object " + (i+1) + ": ");
            int age = sc.nextInt();

            sc.nextLine(); // Ignore this line for now...

            System.out.print("Enter name for object " + (i+1) + ": ");
            String name = sc.nextLine();

            objArrayList.add(new Studentt(age, name));
        }

        // Refer to the for-each example (forEachEx.java)-------
        for (Studentt s: objArrayList){
            System.out.println(s);
        }

        System.out.println("*---------------------------*---------------------------------*------------------------------*");

        
        // We can use for-loop as well--------------------------
        for (int i = 0; i < 5; i++){
            System.out.println(objArrayList.get(i));
        }
    }
}


class Studentt {
    public int age;
    public String name;

    public Studentt (int age, String name){
        this.age = age;
        this.name = name;
    }


    @Override
    public String toString(){
        return "student name: " + this.name + " and age is: " + this.age;
    }
}