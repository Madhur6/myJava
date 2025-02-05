import java.util.*;


public class consumBuffer {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many times loop should run: ");
        int n = sc.nextInt();

        ArrayList<String> listNames = new ArrayList<>();
        ArrayList<Integer> listIds = new ArrayList<>();

        for (int i = 0; i < n; i++){
            int id = -1;  // scanner might think that there is something left in the input buffer...(input stream from cli)
            // SO WHEN USER ENTERS A INT, IT MIGHT ASSUME THAT THERE IS A SPACE LEFT, \0
            // sc.nextLine();
            while (true){
                try {
                    System.out.print("Enter id: ");
                    id = sc.nextInt(); //USER INPUT: 101_, WILL CONSUME 101 AS IT IS, BUT THERE IS _ LEFT IN THE BUFFER...
                    sc.nextLine();
                    break;
                } catch(Exception e){
                    System.out.println("Invalid input, Try again!");

                    sc.nextLine(); // i was expecting an INTEGER, but got an STRING, so my code went to catch block, 
                }
            }

            // Is while(true) is needed here? Because we want to continuosly get input from user untill user enters correct input?
          

            listIds.add(id); // assume that i will input correctly......

            // System.out.print("Enter name: ");
            // String name; // THIS nextLine() WHICH SUPPOSE TO TAKE STRING AS INPUT, IS ACTUALLY GOING TO CONSUME
            // // WHATEVER LEFT-OVER BY THE LAST INPUT[SC.NEXTINT()].

            // // while (true){
            //     try {
            //         name = sc.nextLine();
            //         // break;
            //     } catch(Exception e){
            //         System.out.println("Invalid input, Try again!");
            //     }
            // // }

            // listNames.add(name);
        }

        System.out.println(listIds);
        System.out.println(listNames);
    }
}


// *------------------------------------* -------------------------------------------------------* -----------------------

        // Let's create a design rule: if u are ever taking a string input or in other words sc.nextLine() or sc.next() after
        // you have taken a sc.nextInt() in previous line of your code, then and only then a followup sc.nextLine() after sc.nextInt() is
        // required!

        // 1----------------------------------
        // int a = sc.nextInt(); sc.nextLine();
        // String s = sc.nextLine();
           
        // 2----------------------------------
        // String f = sc.nextLine(); // nextLine consumes everything at once...
        // int x = sc.nextInt();