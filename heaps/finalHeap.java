package ron.heaps;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class finalHeap {
	
// *----------------------*-----------------------*---------------------------*	
//	Best-case: O(1)
//
//	Worst-case: O(log n) (same as iterative)
//
//	⚠️ Slightly slower than iterative due to function call overhead and stack usage
// *----------------------*-----------------------*---------------------------*
	
	// Ron, this is for calculating the actual value of our heap...
//	public static int getValue(int[] heap, int idx) {
//		if (idx == 0) {
//			return heap[0];
//		}
//		return heap[idx] + getValue(heap, (idx-1)/2);
//	}


	
	
	
// *----------------------*-----------------------*---------------------------*
//	getValue(int[] heap, int idx)
//	Best-case: O(1) → when idx == 0.
//
//	Worst-case: O(log n) → traverses from idx up to the root (log n levels in a binary heap).
// *----------------------*-----------------------*---------------------------*
	public static int getValue(int[] heap, int idx) {
		int result = 0;
		while (idx != 0) {
			result += heap[idx];
			idx = (idx-1)/2;
		}
		return result+heap[0];
	}
	
	
	
	
	
	
// *----------------------*-----------------------*---------------------------*	
//	 swapAndUpdate(int[] heap, int i, int j)
//	 Internally calls getValue multiple times (up to 4).
//
//	 Best-case: O(1) → if both indices are 0 (root).
//
//	 Worst-case: O(log n) → each getValue() call could take up to O(log n).
// *----------------------*-----------------------*---------------------------*
	public static void swapAndUpdate(int[] heap, int i, int j) {
		int valOne = getValue(heap, i);
		int valTwo = getValue(heap, j);
		
		if (i == 0) {
			heap[i] = valTwo;
		} else {
			int parentIdxOne = (i-1)/2;
			int parentOne = getValue(heap, parentIdxOne);
			heap[i] = valTwo - parentOne;
		}
		
		if (j == 0) {
			heap[j] = valOne;
		} else {
			int parentIdxTwo = (j-1)/2;
			int parentTwo = getValue(heap, parentIdxTwo);
			heap[j] = valOne - parentTwo;
		}
	}
	
	
	
	
	

// *----------------------*-----------------------*---------------------------*
//	 heapify(int[] heap, int n, int i)
//	 Each comparison involves getValue, which is O(log n).
//
//	 Recursive call may go down up to height of heap O(log n).
//
//	 Best-case: O(log n) (1 level, no swaps, but still calls getValue)
//	 Worst-case: O(log² n) → O(log n) levels, and each level calls getValue (which itself is O(log n)).
// *----------------------*-----------------------*---------------------------*
	public static void heapify(int[] heap, int n, int i) {
		int largest = i;
		int leftChildIdx = 2*i + 1;
		int rightChildIdx = 2*i + 2;
		
		int valOne = getValue(heap, i);
		int leftChild = (leftChildIdx < n) ? getValue(heap, leftChildIdx) : Integer.MIN_VALUE;
		int rightChild = (rightChildIdx < n) ? getValue(heap, rightChildIdx) : Integer.MIN_VALUE;
		
		if (leftChildIdx < n && leftChild > valOne) {
			largest = leftChildIdx;
		}
		
		if (rightChildIdx < n && rightChild > getValue(heap, largest)) {
			largest = rightChildIdx;
		}
		
		
		if (largest != i) {
			swapAndUpdate(heap, i, largest);
			heapify(heap, n, largest);
		}
	}

	
	
	
	
	
	
// *----------------------*-----------------------*---------------------------*
//	buildHeap(int[] heap)
//	Calls heapify() on n/2 elements.
//
//	Worst-case per heapify: O(log² n)
//	Total calls: O(n)
//
//	So:
//
//	Best-case: O(n log n) (if heapify does minimal work but still calls getValue)
//
//	Worst-case: O(n log² n)
// *----------------------*-----------------------*---------------------------*
	public static void buildHeap(int[] heap) {
		int n = heap.length;
		for (int i = (n/2)-1; i >= 0; i--) {
			heapify(heap, n, i);
		}
	}
	
	
	
	
	
	
	
// *----------------------*-----------------------*---------------------------*
//	heapInsert(int[] heap, int key)
//	Copying array: O(n)
//
//	getValue() in loop: O(log n) each
//
//	In worst case, element bubbles up all the way to the root: O(log n) iterations
//
//	So:
//
//	Best-case: O(n) (element is placed correctly with no swaps)
//
//	Worst-case: O(n + log² n) (copy + bubble up with getValue)
// *----------------------*-----------------------*---------------------------*
	public static int[] heapInsert(int[] heap, int key) {
		int n = heap.length;
		int[] newHeap = Arrays.copyOf(heap, n+1);
		
		int parentIdx = (n-1)/2;
//		int parent = getValue(heap, parentIdx);
		int parent = n == 0 ? 0 : getValue(heap, parentIdx);
		newHeap[n] = key - parent;
		
		int idx = n;
		int currVal = key;
		while (idx > 0) {
			int pIdx = (idx-1)/2;
			currVal = getValue(newHeap, idx);
			int parentValue = getValue(newHeap, pIdx);
			
			if (currVal > parentValue) {
				swapAndUpdate(newHeap, idx, pIdx);
				idx = pIdx;
				currVal = getValue(newHeap, idx);
			} else {
				break;
			}
		}
		
		return newHeap;
	}
	
	
	
	
	
// *----------------------*-----------------------*---------------------------*
//	addToKeys(int[] heap, int c)
//	Just adds c to the root.
//
//	Best-case & Worst-case: O(1)
// *----------------------*-----------------------*---------------------------*
	public static void addToKeys(int[] heap, int c) {
		heap[0] += c;
	}
	
	
	public static int[] getActualHeap(int[] heap) {
		int[] actual = new int[heap.length];
		for(int i = 0; i < heap.length; i++) {
			actual[i] = getValue(heap, i);
		}
		return actual;
	}
	
	
	
	
	
// *----------------------*-----------------------*---------------------------*		
//	Loops through all n elements
//
//	Each getValue() is O(log n)
//
//	Best-case: O(log n) – if value is at index 0

//	Worst-case: O(n log n)
// *----------------------*-----------------------*---------------------------*
	
//	public static Integer findInHeap(int[] A, int z) {
//		for (int i = 0; i < A.length; i++) {
//			if (getValue(A, i) == z) {
//				return i;
//			}
//		}
//		return null;
//	}
	
	
	
	
	
	

//	public static Integer findInHeap(int[] A, int z) {
//		return findInHeapRecurssive(A, z, 0);
//	}
//	
	
// *----------------------*-----------------------*---------------------------*	
//	/**
//	 * Time Complexity:
//	 * Let n be the number of elements in the heap.
//	 * 
//	 * Best Case: O(log n)
//	 * - When the target element is found early (e.g., at the root).
//	 * 
//	 * Worst Case: O(n log n)
//	 * - When the element is not present or is near the bottom, and most nodes need to be checked.
//	 * - Each getValue(A, i) operation takes O(log n), and may be called for many nodes.
//	 */
// *----------------------*-----------------------*---------------------------*
//	public static Integer findInHeapRecurssive(int[] A, int z, int i) {
//		if (i >= A.length) return null;
//		int value = getValue(A, i);
//		if (value < z) return null;
//		if (value == z) return i;
//		
//		Integer left = findInHeapRecurssive(A, z, 2*i+1);
//		if (left != null) return left;
//		
//		return findInHeapRecurssive(A, z, 2*i + 2);
//	}
	
	
	
	
	
	
// *----------------------*-----------------------*---------------------------*
//	findInHeap(int[] heap, int z) (BFS)
//	Worst-case: traverses entire heap → O(n)
//
//	Each visit calls getValue() → O(log n)
//
//	So:
//
//	Best-case: O(log n) (found at root or shallow depth)
//
//	Worst-case: O(n log n)
// *----------------------*-----------------------*---------------------------*
	
	// using BFS
	public static Integer findInHeap(int[] A, int z) {
		if (A.length == 0) {
			return null;
		}
		
		Queue<Integer> queue = new LinkedList<>();
		queue.add(0);
		
		while (!queue.isEmpty()) {
			int i = queue.poll();
			if (i >= A.length) {
				continue;
			}
			
			int value = getValue(A, i);
			if (value == z) {
				return i;
			}
			
			if (value >= z) {
				int left = 2*i + 1;
				int right = 2*i + 2;
				if (left < A.length) {
					queue.add(left);
				}
				if (right < A.length) {
					queue.add(right);
				}
			}
		}
		return null;
	}

	
	
	
	
	public static void main(String[] args) {
		int[] heap = {100, 70, 60, 20, 50, 10};
		int[] modifiedHeap = new int[heap.length];
		
		modifiedHeap[0] = heap[0];
		for(int i = 1; i < heap.length; i++) {
			int parentIdx = (i-1)/2;
			modifiedHeap[i] = heap[i] - heap[parentIdx];
		}
		
		System.out.println("Original (actual) heap: " + Arrays.toString(heap));
		System.out.println("Modified heap (with diffs): " + Arrays.toString(modifiedHeap));
		
		buildHeap(modifiedHeap);
		
		System.out.println("After buildHeap (actual): " + Arrays.toString(getActualHeap(modifiedHeap)));
		
		modifiedHeap = heapInsert(modifiedHeap, 85);
		System.out.println("After inserting 85 (actual): " + Arrays.toString(getActualHeap(modifiedHeap)));
		
		
		addToKeys(modifiedHeap, 10);
		System.out.println("After addToKeys(+10): " + Arrays.toString(getActualHeap(modifiedHeap)));
		
		
		int target = 60;
		Integer index = findInHeap(modifiedHeap, target);
		if (index != null) {
			System.out.println("Value: " + target + " found at index: " + index);
		} else {
			System.out.println("Value: " + target + " not found at index in heap");
		}
		
	}
}
