
class Student {
    public String name;
    public int age;

    //----- Constructors: Doesn't contain the return-type in the definition...

    // non-parameterized constructor
    public Student(){
    }

    // parameterized constructor
                //  <    parameters     >
    public Student(int age, String name){
        this.age = age;
        this.name = name;   
    }


    //---- Methods: Behaviours or actions represented by class
    //              They are non-static

    // access-modifier     return-type        name
    public                 void               speak(){
        System.out.println("Hello, World!");
    }




}

public class whatIsOops {
    //---- Main method: Entry point of our program
    // contains access-modifier      static/non-static         return-type         name (parameter) {}
    public static void main(String[] args){
        whatIsOops w = new whatIsOops(); // ignore this now

        int x = 12;
        int y = 20;

  
        int result = w.add(x, y); // invocation of a method...(ignore w. for now)
        // How can i use it here?
        // Invocation,
        // Phone, Instagram... if u have opened ur phone, at your homescreen...
        // Tap that logo, invoking the instagram

        System.out.println("The result of addition is: " + result);


    }



    // Method: Behaviour / Action

    // access-modifier     return-type        name ( < parameter > ) {}
    public int add(int a, int b){
        return a + b;
    }
}



// // There are "access modifiers"
// // - Private
// // - public
// // - default
// // - protected





// -----------------------------------------------------------------------------------------------------------------------------







// // Function / Method:

// // Input (parameters / arguments) -------------> [ Mathematical formula / Black-Box ] ----------------> Output (return value)
// //                                                         (a * b)
// // 2,4                                                                                                     0.5




// -----------------------------------------------------------------------------------------------------------------------------




// // Instagram: 1k, likes ur post, +1

// // Remembering / Storing information

// // Structure: table / desk / box / brain / some sort of structure to hold something... 
// // Data-Structure:  Structure that holds data... Arrays/ Linked-Lists / Graphs / Stacks / HashMaps / Queues / Tries / Tress / Binary Search Trees / ...

// // array: [ , , , , , , , , ] Sequence of contiguous values...

// // place 2nd: 3

// // [1, 2, 3, 4, 5, 6, 7, 8, 9] // size of our array is increasing as we insert values in our array...
// //  0   1  2 3 4 5 6  7 8  9
// // Size of this array: 9

// // Blob[]: ["1", "hello, world", "ron", "apple", "123.0"]




// -----------------------------------------------------------------------------------------------------------------------------





    // int/string/boolean/any data-type/object
    // void (this method has no return type)

    // If i say "add" method is our black-box, 
    // Maria Identify the input and output?
    // Maria says: input -> a & b
    // output -> a + b, Are u sure? yes, 100 points, Hurayyyyyyyyy