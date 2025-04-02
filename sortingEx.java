package revisionEx;

import java.util.Arrays;

public class sortingEx {
	public static void main(String[] args) {
		
		int[] arr = {12,3,4,5,13,41,35,63,2,-13,0,564,234,-123};
		
		// searching
		// - linear & binary
		int target = 4;
//		int res = linear_search(arr, target);
		
//		int res = binary_search(arr, target); // it by-default returns the index only...
		
//		int[] sorted_arr = selection_sort(arr, arr.length);
		
		int[] sorted_arr = bubble_sort(arr, arr.length);
		
		System.out.println(Arrays.toString(sorted_arr));
		
	}
	
	// time comp: O(n2) & omega(n)
	public static int[] bubble_sort(int[] arr, int n) {
		// for i from 0 to n-1 -----> n steps
		// for j from 0 to n-2 -----> n steps
		// we compare elements at i & j and if they are out of order, We swap them...
		
		// 
		
		// larger values starts bubbling their way upto end / to the right side...
		
		// [5,4,3,1,2] ---> [1,4,3,5,2] ---> [1,2,3,5,4] ---> [1,2,3,5,4] ---> [1,2,3,4,5]
		//  0 1 2 3 4 
		
		// [5,4,3,1,2] arr[5] ---> throw indexoutofboundException ----> [4,5,3,1,2] ---> [4,3,5,1,2] (larger values starts bubbling it's way to the end)
		//  0 1 2 3 4
		
		// --------> [4,3,1,5,2] -------> [4,3,1,2,5]
		
		// i = 0;
		// j = 0 - (5-0-1) [0-4 (4 iterations)]
		// if (arr[j] > arr[j+1])
		// if ( arr[0]   >  arr[1] )
		// swap happens
		
		// i = 0;
		// j = 1
		// if (arr[1] > arr[2])
		// swap happens
		
		
		// i = 0;
		// j = 2
		// if (arr[2] > arr[3])
		// swap happens
		
		
		// i = 0;
		// j = 3
		// if (arr[3] > arr[4])
		// swap happens
		
		// i = 0;
		// j = 4; it'll stop here & it get's out of the j loop's 1st iteration
		
//		for(int i = 0; i < n-1; i++) {
//			for (int j = 0; j < n-i-1; j++) {
//				if (arr[j] > arr[j+1]) {
//				// swap: 5 <!> 2
//					int temp = arr[j];
//					arr[j] = arr[j+1];
//					arr[j+1] = temp;
//				}
//			}
//		}
//		return arr;
		
		
		// Method II ------------------------------------------------------------------------------------
		// [5,4,3,1,2] ----after the 1st iteration of j ----> [4,5,3,1,2] --> [4,3,5,1,2] ---> [4,3,1,5,2] ---> [4,3,1,2,5]
		//  0 1 2 3 4
		
		// i = 4   -<----
		// s_h = 0
		// j = 0   ----->+
		
		// if (arr[j] > arr[j+1])
		// if (arr[0] > arr[1])
		// swap happens ---> s_h = 1;
		
		// i = 4
		// s_h = 1
		// j = 1
		// if (arr[1] > arr[2])
		// swap happens ---> s_h = 1;
		
		// i = 4
		// s_h = 1
		// j = 2
		// if (arr[2] > arr[3])
		// swap happens ---> s_h = 1;
		
		// i = 4
		// s_h = 1
		// j = 3
		// if (arr[3] > arr[4])
		// swap happens ---> s_h = 1;
		
		// In this method, When j is done with it's first iteration & we get out of our j loop, We will check if swap_happened variable is 0 or 1, if 0, we break
		
		for (int i = n-1; i >= 0; i--) {
			int swap_happened = 0;
			for (int j = 0; j <= i-1; j++) {
				// swap
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swap_happened = 1;	
				}
			}

			if (swap_happened == 0) {
				System.out.println("swap_happened: " + swap_happened);
				break; // When we perform the "break", The program stopsssssss...
			}
		}
		return arr;
	}
	
	
	// time comp: O(n^2) & omega(n^2) 
	// space comp: O(n)
	
	public static int[] selection_sort(int[] arr, int n) {
		// for i from 0 to n-1 -------------> n steps
		// we find the smallest value and 
		// swap it with the ith index...
		
		// n * ( n-1 ) ----> n2 - n
		
		// [5,4,3,1,2]; n = 5    
		//  0 1 2 3 4 
		// i = 0 ------> 5 iterations
		// for every iteration of i, j will run from i+1 ----> n iterations
		
		
		// 1st iteration (i-loop)
		// i = 0; min_idx = i(0)
		// j = 1-5 (4 iterations)
		// if (arr[j] < arr[min_idx])
		// if (   4   <     5       )
		// min_idx = j (1) ----------> What we can conclude: In each iteration we are on the look for the index which has the smallest value...

		// ------> [1,4,3,5,2]
		
		
		// 2nd iteration (i-loop)
		// i = 1; min_idx = 1;
		// j = 2-5 (3 iterations)
		// if (arr[j] < arr[min_idx])
		// if (    3  <     4 )
		// min_idx = j (2)
		
		// ------> [1,2,3,5,4]
		
		
		// 3rd iteration (i-loop)
		// i = 2; min_idx = 2;
		// j = 3-5 (2 iterations)
		// if (arr[j] < arr[min_idx])
		// if (   1   <     2       )
		// min_idx = j (3)
		
		
		// 4th iteration (i-loop)
		// i = 3; min_idx = 3;
		// j = 4-5 (1 iteration)
		// if (arr[j] < arr[min_idx])
		// if (  2    <    1        ) this will evaluate to false, Hence ------> doesn't goes inside the if condition
		
		
		
		
//		i = 0 | j = 1
//	    i = 1 | j = 2
//		i = 3 | j = 4
		
		for (int i = 0; i < n; i++) {
			int min_idx = i;
			for (int j = i+1; j < n; j++) {
				if (arr[j] < arr[min_idx]) {
					min_idx = j;
				}
			}
			// swap 
			int temp = arr[i];
			arr[i] = arr[min_idx];
			arr[min_idx] = temp;
			
			// Ron, You have 2 glasses full of 2 drinks (mango-shake | coffee)
			// simpler ---> get a third glass ---> pour one drink into this new third glass
			// & now swap the other drink to this first glass
			
			
		}
		return arr;
	}
	
	
	public static int binary_search(int[] arr, int target) {
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		// [-123, -13, 0, 2, 3, 4, 5, 12, 13, 35, 41, 63, 234, 564]
		
		int left = 0, right = arr.length-1;
		
		while (left <= right) {
			int mid = ((left + right)/ 2);
			
			if (target == arr[mid]) {
				return mid;
			}
			else if (target < arr[mid]) {
				right = mid-1; // left <-> mid
			}
			else {
				left = mid+1; // mid <-> right
			}
		}
		
		return -1;
	}
	
	public static int linear_search(int[] arr, int target) {
		int res = -1; // primitive
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] == target) {
//				res = i;
//				return res;
//			}
//		}
		
		for (int x: arr) {
			if (x == target) {
				res = x;
				return res; // Can not return index...
			}
		}
		return res;
	}
}
