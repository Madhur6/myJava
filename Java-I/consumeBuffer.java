package begin;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class consumeBuffer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
    	// ✨ 1.
    	// Classic scanner + I/P buffer situation 😮
    	// ____________________________________________________________________________________________________________________
		
		//💡 Concept: I/P buffer?
		// 		- When we type something in the console and press Enter, JAVA receives: <I/P> + '\n'
		//		- That entire line is stored in I/P buffer. -> abc⏎
		//		- Buffer contains: "abc\n"
		
		
		//💡 If we remove sc.nextLine() inside the "catch" block [with invalid input]?
		//		- Scanner tries to parse an Integer -> Sees "abc" (Not an Integer)
		//		- Throws InputMismatchException (!Scanner doesn't consume the bad input)
		//		- Hence, Buffer still contains: "abc\n"
		//		- Control goes to catch -> Infinite Loop 🔁
		//		- Becoz, Scanner sees the same abc again & again -> Throws Exception again & again
		
		
		//💡 With valid input [code never enters the catch-block]?
		//		- Scanner tries to parse an Integer -> Sees "1\n"
		//		- Consumes only the number "1"
		//		- Leaves the "\n" in the buffer, Buffer contains: "\n"
		//		- Loop continuous normally
		//		- Because in the next iteration, It(sc.nextInt()) expects an Integer, So it's not bothered about the "\n" in the buffer 😊
		
    	// ____________________________________________________________________________________________________________________
		
//		for (int i = 0; i < 3; i++) {
//			int id = -1;
//			while (true) {
//				try {
//					System.out.print("Enter invalid input(string): ");
//					id = sc.nextInt();
//					break;
//				} catch (InputMismatchException e) { // I was expecting an INTEGER, but got a STRING instead, so my code went to catch block, 
//					System.out.println("Invalid input!");
//					
////					sc.nextLine(); // Read the above explanation (If we remove sc.nextLine() inside the "catch" block [with invalid input]?)
//				}
//			}
//		}
//		
//		System.out.println("Out of the loop!");
		
		


		
		
		// ✨ 2.
    	// Design Rule ☆*: .｡. o(≧▽≦)o .｡.:*☆
    	// ____________________________________________________________________________________________________________________
		
		//💡 Let's create a design rule,
		// 		- if u are ever taking a string input or in other words sc.nextLine() or sc.next() after
		//           you have taken a sc.nextInt() in previous line of your code,
        // 	    - then and only then a follow-up sc.nextLine() after sc.nextInt() is required!
		
		//💡 Not always true🌠
    	// ____________________________________________________________________________________________________________________

		
		ArrayList<Integer> intArray = new ArrayList<>();
		ArrayList<String> strArray = new ArrayList<>();
		
		for (int i = 0; i < 4; i++) {
			System.out.print("Enter int " + (i+1) + ": ");
			intArray.add(sc.nextInt());
			
			sc.nextLine(); // Additional ➕
			
			System.out.print("Enter str" + (i+1) + ": ");
			strArray.add(sc.nextLine());
		}
		
		System.out.println("Integer array: " + intArray);
		System.out.println("String array: " + strArray);
		
		
		
    	// ✨ 3.
    	// Conclusion 😊
    	// ____________________________________________________________________________________________________________________
		
		//💡 💫 Without additional sc.nextLine(),
		// 		- ⚠⚠⚠ nextInt() leaves '\n' in the I/P buffer..
		//		- Which remains in the I/P buffer and will be consumed first by the "next" sc.nextLine() before user's next i/p.
		
		//💡 💫 With additional sc.nextLine() here,
        // 	    - Whatever left in the input-buffer('\n') will be consumed! 😉

		//💡 sc.next() -> Skips white-space..
    	// ____________________________________________________________________________________________________________________
		
		
		sc.close();
	}
}