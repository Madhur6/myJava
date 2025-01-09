import java.util.*;


public class Basic {
    public static void main(String[] args){
        // System.out.println("Hello, World");

//**-------------------------------------------------------------------------------------**




        // Scanner sc = new Scanner(System.in);
        // int x = sc.nextInt();
        // int y = sc.nextInt();
        // if (x < y){
        //     System.out.println("x is less than y!");
        // } else if (x > y){
        //     System.out.println("x is greater than y!");
        // }
        // else {
        //     System.out.println("x is equals to y!");
        // }
//**-------------------------------------------------------------------------------------**


        // Scanner sc = new Scanner(System.in);
        // int score = sc.nextInt();
        // if (score >= 90){
        //     System.out.println("Grade A");
        // }
        // else if (score >= 80){
        //     System.out.println("Grade B");
        // }
        // else if (score >= 70){
        //     System.out.println("Grade C");
        // }
        // else if (score >= 60){
        //     System.out.println("Grade D");
        // }
        // else {
        //     System.out.println("Grade F");
        // }
//**-------------------------------------------------------------------------------------**




        // Scanner sc = new Scanner(System.in);
        // int x = sc.nextInt();
        // if (x % 2 == 0){
        //     System.out.println("Even");
        // } else {
        //     System.out.println("Odd");
        // }
        // if don't use static boolean, have to create instance of main
        // main m = new main();
        // if (m.isEven(x)) { // ps1
        //     System.out.println("Even");
        // } else {
        //     System.out.println("Odd");
        // }
//**-------------------------------------------------------------------------------------**




        // Scanner sc = new Scanner(System.in);
        // System.out.print("What's your name? ");
        // String name = sc.nextLine().trim().toLowerCase();
        // // System.out.println("does trim is: " + name + " working!");
        // if (name.equals("harry") || name.equals("hermionne") || name.equals("ron")){
        //     System.out.println("Gryffindor");
        // } else if (name.equals("hagrid")){
        //     System.out.println("Keeper of the Keys");
        // } else if (name.equals("padma")){
        //     System.out.println("Ravenclaw");
        // } else {
        //     System.out.println("Who?");
        // }
//**-------------------------------------------------------------------------------------**




        // Scanner sc = new Scanner(System.in);
        // System.out.print("What's your name? ");
        // String name = sc.nextLine().trim().toLowerCase();
        // switch (name){
        //     case "harry":
        //     case "ron":
        //     case "hermionne":
        //         System.out.println("Gryffindor");
        //         break;
        //     case "hagrid":
        //         System.out.println("Keeper of the Keys!");
        //         break;
        //     default:
        //         System.out.println("Who?");
        // }
        // sc.close();
//**-------------------------------------------------------------------------------------**




        // Scanner sc = new Scanner(System.in);
        // String x = sc.nextLine().toLowerCase().trim();
        // x = x.replaceAll(" ","");
        // if (x.equals("42") || x.equals("fortytwo") || x.equals("forty-two")){
        //     System.out.println("yes");
        // } else {
        //     System.out.println("no");
        // }
//**-------------------------------------------------------------------------------------**




        // Scanner sc = new Scanner(System.in);
        // String greeting = sc.nextLine().toLowerCase().trim();
        // if (greeting.startsWith("hello")){
        //     System.out.println("0$");
        // } else if (greeting.startsWith("h")){
        //     System.out.println("20$");
        // } else {
        //     System.out.println("100$");
        // }
//**-------------------------------------------------------------------------------------**



        // Scanner sc = new Scanner(System.in);
        // String filename = sc.nextLine().toLowerCase();
        // if (filename.endsWith(".pdf")){
        //     System.out.println("pdf file format!");
        // } else if (filename.endsWith(".jpg") || filename.endsWith(".jpeg")){
        //     System.out.println("jpeg file format!");
        // } else if (filename.endsWith(".png")){
        //     System.out.println(".png file format!");
        // } else {
        //     System.out.println("application/octect-stream!");
        // }
//**-------------------------------------------------------------------------------------**




        // Scanner sc = new Scanner(System.in);
        // System.out.print("what's your name? ");
        // String answer = sc.nextLine();
        // System.out.println("hello, " + answer);
        // System.out.printf("hello, %s %n", answer);
        // System.out.println("end");
//**-------------------------------------------------------------------------------------**


        // int counter = 0;
        // counter++;
        // System.out.println(counter);


//**-------------------------------------------------------------------------------------**

        // while (true){
        //     System.out.println("Jai Maa!");
        // }
        // int i = 0;
        // while (i < 3){
        //     System.out.println("Jai Maa!");
        //     i+=1;
        // }
        // for (int i = 0; i < 3; i++){
        //     System.out.println("Jai Maa!");
        // }
        // using lambda
        // IntStream.range(0, 100).forEach(i -> System.out.println("hello"));
        // using method reference
        // IntStream.range(0, 10).forEach(System.out::println);
//**-------------------------------------------------------------------------------------**


        // Scanner sc = new Scanner(System.in);
        // int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        // System.out.print("What's the number: ");
        // boolean error = false;
        // int n = -1;
        // try {
        //     n = sc.nextInt();
        // } catch (InputMismatchException e) {
        //     System.out.println("Invalid value!");
        //     error = true;
        // }

        
        // USING FOR-EACH...-------------------------------------------------------------
        // if (!error){
        //     boolean found = false;
        //     for (int i : numbers){
        //         if (i == n){
        //             found = true;
        //         }
        //     }
        //     if (found){
        //         System.out.println("Found: " + n);
        //     } else {
        //         System.out.println(n + " not found!");
        //     }
        // }



        // USING ARRAYS.BINARYSEARCH-----------------------------------------------------
        // if (!error){
        //     if (Arrays.binarySearch(numbers, n) >= 0){
        //         System.out.println("found " + n);
        //     } else {
        //         System.out.println(n + " not found!");
        //     }
        // }
//**-------------------------------------------------------------------------------------**




        // for (int i = 0; i < 101; i+=2){
        //     System.out.printf("i is now %d%n", i);
        //     System.out.println(i);
        // }
//**-------------------------------------------------------------------------------------**




        // Scanner sc = new Scanner(System.in);
        // int x = -1;
        // int y = -1;
        
        // If the input is not an integer, scanner.nextInt() throws an InputMismatchException, but the invalid input remains in the buffer 
        // because nextInt() only partially consumes input when an exception occurs...

        // while (true) {
        //     try {
        //         System.out.print("What's x: ");
        //         x = sc.nextInt();
        //         System.out.print("What's y: ");
        //         y = sc.nextInt();
        //         break;
        //     } catch (InputMismatchException e) {
        //         System.out.println("Invalid value, please only input the integer values!");
        //         sc.next(); // Clear the invalid input from the scanner buffer
        //     }
        // }

        // System.out.println(x + y);
        // Since the entire line has already been consumed, 
        // there's no leftover input in the buffer, so it doesn't go into an infinite loop.

        // while (true) {
        //     try {
        //         System.out.print("x: ");
        //         x = Integer.parseInt(sc.nextLine());
        //         System.out.print("y: ");
        //         y = Integer.parseInt(sc.nextLine());
        //         break;
        //     } catch (NumberFormatException e) {
        //         System.out.println("Invalid value, please only input integer values!");
        //     }
        // }
        // System.out.println("Sum: " + (x + y));
//**-------------------------------------------------------------------------------------**


        // Scanner sc = new Scanner(System.in);
        // int x = sc.nextInt();
        // float y = sc.nextFloat();
        // // System.out.println(x / y); // floor/integer division
        // // System.out.println(x % y); // remainder
        // System.out.println(x / y); // floating-point-division
//**-------------------------------------------------------------------------------------**



        // Scanner sc = new Scanner(System.in);
        // String str = sc.next();
        // if (str.equals("Y") || str.equals("y")){
        //     System.out.println("Agreed!");
        // } else if (str.equals("N") || str.equals("n")){
        //     System.out.println("Not Agreed!");
        // }
//**-------------------------------------------------------------------------------------**



        // for (int i = 0; i < 3; i++){
        //     System.out.println("Roar!");
        // }
        // Roar(6); // ps2
//**-------------------------------------------------------------------------------------**


        // int i = get_positive_int(); //ps3
        // System.out.println("Positive integer: " + i);
//**-------------------------------------------------------------------------------------**



        // int i = 1;
        // // while (true) { 
        // //     System.out.print(i);
        // //     i *= 2;
        // // }
        // i*=4;
        // System.out.println(i);


        // Repeat-------------------------------------------------------
        // String str = "hello".repeat(4);
        // System.out.println(str);


        // STRINGBUILDER-----------------------------------------------
        // StringBuilder str = new StringBuilder();
        // for (int i = 0; i < 10; i++) {
        //     str.append("hello");
        // }


        // System.out.println(((Object) str).getClass().getSimpleName()); // String builder object
        // System.out.println(str.toString());

//**-------------------------------------------------------------------------------------**




//BOX.java---------------------------------------------------------------------------------
        // for (int i = 0; i < 4; i++){
        //     System.out.println(i);
        // }
        // System.out.println();
        // System.out.println("hey");
        // BOX-------------------------------------------------
        // Scanner sc = new Scanner(System.in);
        // int m;
        // int n;
        // while (true){
        //     m = sc.nextInt();
        //     n = sc.nextInt();
        //     if ( m > 0 && n > 0){
        //         break;
        //     }
        // }
        // // System.out.println(m);
        // // System.out.println(n);
        // for (int i = 0; i < m; i++){
        //     for (int j = 0; j < n; j++){
        //         System.out.print(". ");
        //     }
        //     System.out.println();
        // }
//**-------------------------------------------------------------------------------------**






//AVG.java---------------------------------------------------------------------------------
        // int[] scores = {72, 73, 33};
        // int sum = 0;
        // for (int i: scores){
        //     sum += i;
        // }
        // float avg = (float) sum / scores.length; // typecasting to float
        // System.out.println("Average: " + avg);


        //--------------------------------------------------
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the total number of scores: ");
        // int TOTAL = sc.nextInt();
        // int[] scores = new int[TOTAL];
        // for (int i = 0; i < TOTAL; i++){
        //     System.out.print("Score " + (i+1) + ": ");
        //     int score = sc.nextInt();
        //     scores[i] = score;
        // }


        // System.out.println(Arrays.toString(scores));
        // int sum = 0;
        // for (int i: scores){
        //     sum += i;
        // }


        // double avg = (double) sum / scores.length;
        // System.out.println("Your average: " + String.format("%.1f", avg));
        // System.out.printf("Your average %.1f%n", avg);



        //--------------------------------------------------
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the total number of scores: ");
        // int TOTAL = sc.nextInt();

        // ArrayList<Integer> scores = new ArrayList<>();
        // for (int i = 0; i < TOTAL; i++){
        //         System.out.print("Score: " + (i+1) + ": ");
        //         int score = sc.nextInt();
        //         scores.add(score);
        // }


        // System.out.println(Arrays.toString(scores.toArray()));
        // int sum = 0;
        // for (int i = 0; i < scores.size(); i++){
        //         sum += scores.get(i);
        // }

        // double res = (double) sum / scores.size();
        // System.out.println("Your average: " + String.format("%.2f", res));
//**-------------------------------------------------------------------------------------**




//UPPERCASE.java-------------------------------------------------------------------------
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a text: ");
        // String str = sc.nextLine().toUpperCase();
        // System.out.println(str);


        //-------------------------------------------------------------
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter text: ");
        // String str = sc.nextLine();
        // System.out.print("After: ");
        // for (char c: str.toCharArray()){
        //     System.out.print(Character.toUpperCase(c));
        // }
        // System.out.println();



        //-------------------------------------------------------------
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter text: ");
        // String str = sc.nextLine();
        // // in Java, a char is essentially a 16-bit Unicode value, 
        // // which can be directly used as an integer
        // System.out.print("After: ");
        // for(char c: str.toCharArray()){
        //     if (c >= 'a' && c <= 'z'){
        //         System.out.print((char) (c - 32));
        //     } else if (c >= 'A' && c <= 'Z'){
        //         System.out.print((char) (c + 32));
        //     }
        // }



//**-------------------------------------------------------------------------------------**


//ARG & ARGC.java (javac main.java > java main harry)------------------------------------
        // if (args.length == 1){
        //     System.out.print("Hello, " + args[0]);
        // } else {
        //     System.out.print("Hello, world!");
        // }



//**-------------------------------------------------------------------------------------**



//EXIT.java------------------------------------------------------------------------------
// in java, cli arg, doesn't include the program name at index 0,

//        if (args.length != 1){
//            System.out.println("Missing cmd line argument!");
//            System.exit(0); // stands for true
//        }
//        System.out.println("Hello " + args[0]);
//        System.exit(1); // stands for false (echo $?)



//**-------------------------------------------------------------------------------------**
//        
        // int[] numbers = {2, 4, 6, 8};
        // for (int i: numbers) {
        //      if (i == 2){
        //         System.out.println("Found 2");
        //         System.exit(0);
        //      }   
        //      else {
        //         System.out.println("Not found!");
        //         System.exit(1);
        //      } 
        // }


        //------------------------------------------------
        // String[] names = {"harry", "hermionne", "ron"};
        // for (String s: names){
        //     if (s.equals("harry")){
        //         System.out.println("Found harry!");
        //         System.exit(0);
        //     } else {
        //         System.out.println("Harry not found!");
        //         System.exit(1);
        //     }
        // }
//**-------------------------------------------------------------------------------------**



// PHONEBOOK.java-------------------------------------------------------------------------
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> people = new HashMap<>();
        people.put("harry", "+101-434343");
        people.put("ron", "+102-3244435");
        
        System.out.print("What's the name: ");
        String name = sc.nextLine();


        if (people.containsKey(name)){
                System.out.println("Found: " + people.get(name));
        } else {
                System.out.println(name + " not found!");
        }


//**-------------------------------------------------------------------------------------**
    }
}