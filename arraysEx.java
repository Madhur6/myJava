import java.util.*;


class Studentt {
    int age;
    String name;

    public Studentt(int age, String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString(){
        return "Student's age: " + this.age + " name: " + this.name; 
    }
}

public class arraysEx {
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);

        // Array (primitive): Declaring dynamically [without defining size]
        int[] arr = {1,2,3,4,5,6,7,8,9};
        String[] arr1 = {"harry", "ron", "hermionne", "hagrid", "naville"};
        char[] arr2 = {'a', 'b', 'c', 'd', 'e'};
        boolean[] arr3 = {true, false, true};
        
        System.out.println("The array of integer elements: " + Arrays.toString(arr));
        System.out.println("The array of String elements: " + Arrays.toString(arr1));
        System.out.println("The array of character elements: " + Arrays.toString(arr2));
        System.out.println("The array of boolean elements: " + Arrays.toString(arr3));


        // Array (primitive): Declaring with size initially
        int[] arr4 = new int[3]; // integer array of size 3
        String[] arr5 = new String[5]; // String array of size 5
        // Same as above, We can create arrays of boolean, character or object for that matter as well... 
        
        for (int i = 0; i < 3; i++){
            System.out.print("Enter element " + (i+1) + " for integer array: ");
            arr4[i] = sc.nextInt();
        }
        sc.nextLine();


        for (int i = 0; i < 5; i++){
            System.out.print("Enter element " + (i+1) + " for string array: ");
            arr5[i] = sc.nextLine();
        }

        System.out.println("The array of integer elements [pre-defined size]: " + Arrays.toString(arr4));

        System.out.println("*---------------------*---------------------*---------------------*");

        System.out.println("The array of String elements [pre-defined size]: " + Arrays.toString(arr5));



        // Array Exception: Index out of bounds Exception
        int[] arr6 = new int[5];
        for (int i = 0; i < 6; i++){
            System.out.print("Enter element " + (i+1) + " for arr6 : ");
            
            // Don't worry about try-catch for now, Just focus on line 67 and ignore the try-catch! :)
            try {
                arr6[i] = sc.nextInt();   
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Index out of bounds Exception occured!");
            }
        }


        // -----------------------------------------------------------------------------------------------------------------------------------------------


        // Object-Array
        // The way we have created integer/string/boolean/etc arrays, Same way we can create object-arrays...
        Studentt[] studentsObjArr = new Studentt[3];
        for (int i = 0; i < 3; i++){
            System.out.print("Enter age " + (i+1) + ": ");
            int age = sc.nextInt();

            sc.nextLine(); // ignore this line for now...

            System.out.print("Enter name " + (i+1) + ": ");
            String name = sc.nextLine();

            studentsObjArr[i] = new Studentt(age, name);
        }

        // for ex. { Object-Array of size 3 }
        // studentsObjArr: [studentt(12, harry), studentt(13, madhur), studentt(14, ron)]
        //              i:            0                     1                2

        // Refer to for-Each Example code (forEachEx.java)...
        for (Studentt s: studentsObjArr){
            System.out.println(s);
        }



        //--------------------------------------------------------------------------------------------------------------
        // javac arraysEx.java [file]
        // java arraysEx [class]


        // This was "Single-Dimensional Arrays", We will learn "Multi-Dimensional Arrays" later...
        
        

    }
}