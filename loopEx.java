
// Loop: given the condition consisting of sequential numbers indicating the index, finds the specific value through the location...

// Loop: something that repeats itself for n times...

// 1 2 3 4 5 6 7 8 9 10
//           *
// Iteration: 

// *

// for i in range(0, n) ->
// 		i ----> index

public class loopEx {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9}; 
		//           0 1 2 3 4 5 6 7 8 
		int n = arr.length;
		
//		for i in range(0, arr.length) -> i ---> indeces of my array
		// i --> 0    1 	2	3	4	5	6	7	8	
		
//		for i in range(0, 10) {
//			jump;
//		}
		
//		for i in range(0, n):
		
		// 1 - <= 10
		
		for (int i = 0; i < n; i++) {
			System.out.println("indeces of my arr: " + i);
		}
		// First iteration of our loop: i = 0; 0 < 9 ? true ---(It goes inside the loop-body)--> prints it ---> 0++ -> 1
		// 2nd iteration of our loop:   i = 1; 1 < 9 ? true -----------------------------------> prints it ---> 1++ -> 2
		// 3rd............
		// 9th iteration of our loop:   i = 8; 8 < 9 ? true -----------------------------------> prints it ---> 8++ -> 9
		// 10th iteration of our loop:  i = 9; 9 < 9 ? false ----------------------------------> breaks 🕘
	
		

		
        // WHILE-LOOP STARTS HERE
        //      *-------------------------------------*-------------------------------------*-------------------------------------*-------------------------------------
        //	    int x = 0;
        //	    while (x < n) { // checking the condition first, [Suggestion, run it with n == 0]
        //	    	System.out.println("Indeces of my arr: " + x);
        //	    	x++;
        //	    }
        	    // If you know the range in advance, go with the for loop'
        	    // else use while
        	    
        	    // <i === x>
        		// First iteration of our loop: i = 0; while(0 < 9) ? true ---(It goes inside the loop-body)--> prints it ---> 0++ -> 1
        		// 2nd iteration of our loop:   i = 1; while(1 < 9) ? true -----------------------------------> prints it ---> 1++ -> 2
        		// 3rd............
        		// 9th iteration of our loop:   i = 8; while(8 < 9) ? true -----------------------------------> prints it ---> 8++ -> 9
        		// 10th iteration of our loop:  i = 9; while(9 < 9) ? false ----------------------------------> breaks 🕘
        
        //      *-------------------------------------*-------------------------------------*-------------------------------------*-------------------------------------
        // WHILE-LOOP ENDS HERE
	
		
		
		
        // DO-WHILE-LOOP STARTS HERE
        //      *-------------------------------------*-------------------------------------*-------------------------------------*-------------------------------------
        int x = 0;
        do {
        	System.out.println("Indeces of my arr: " + x);
        	x++;
        } while (x < n); // checking the condition later, [Suggestion, run it with n == 0]
        
        // <i === x>
        // First iteration of our loop: i = 0; (It goes inside the loop-body) prints it ---> 0++ -> 1 ---(It checks the condition)--> while(1 < 9) ? true 
        // 2nd iteration of our loop:   i = 1; -----------------------------  prints it ---> 1++ -> 2 ------------------------------> while(2 < 9) ? true 
        // 3rd............
        // 9th iteration of our loop:   i = 8; -----------------------------  prints it ---> 8++ -> 9 ------------------------------>  while(9 < 9) ----> breaks 🕘
        // 10th iteration didn't even occured
        
        //  *-------------------------------------*-------------------------------------*-------------------------------------*-------------------------------------
        
        // DO-WHILE-LOOP ENDS HERE
		
	}
}
