import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// ******************** Linked-List Implementation ********************
// Node class representing a single element in a linked list
class Node {
    Object val;  // Value stored in the node
    Node next;   // Pointer to the next node in the list

    // Constructor to initialize a new node
    public Node(Object val) {
        this.val = val;
        this.next = null;
    }       
}

public class listEx {
    public static void main(String[] args) {

        // ************************ Collection Types in Java ************************
        // | Collection Type | Interface | Common Implementations | Key Features |
        // |----------------|------------|----------------------|------------------------------|
        // | List           | List       | ArrayList, LinkedList | Ordered, Allows Duplicates |
        // | Queue          | Queue      | LinkedList, PriorityQueue | FIFO Processing |
        
        // Predefined Java Data Structures
        List<Integer> myList = new LinkedList<>();
        Queue<Integer> myList1 = new LinkedList<>();
        System.out.println(myList);

        
        // ****************************** Arrays in Java ******************************
        // Arrays: 
        // - Contiguous memory allocation
        // - Not easily resizable
        // - Supports random access (O(1) complexity)
        // - Insertion takes O(n) in worst-case (requires shifting elements)
        // - Searching takes O(n) in worst-case (linear search required)
        
        int[] arr = {1, 2, 344, 56, 0};
        System.out.println(arr[2]); // Accessing an element (O(1))
        
        
        // **************************** Linked Lists ****************************
        // Linked List Properties:
        // - Each node contains: value + pointer to the next node
        // - Nodes are scattered in memory, unlike arrays
        // - No direct indexing (O(n) search complexity)
        // - Insertions & deletions can be O(1) if done efficiently
        
        // Example Representation:
        // [ 2 | -> ] --> [ 6 | -> ] --> [ 5 | -> ] --> [ 10 | -> ] --> [ 18 | -> ] --> [ 25 | -> null ]
        
        // Steps to Insert '2' in a Sorted Linked List:
        // 1) Connect 2's pointer to 3
        // 2) Disconnect 1's pointer from 3
        // 3) Connect 1's pointer to 2
        // 4) Done! 😊
        
        // Before Insertion:
        // [ 1 ] ---> [ 3 ] ---> [ 4 ] ---> [ 5 ] ---> [ 24 ] ---> null
        
        // Step-I:
        // [ 1 ] ---> [ 3 ] ---> [ 4 ] ---> [ 5 ] ---> [ 24 ] ---> null
        //               ↑
        //               |
        //              [ 2 ]
        
        // Step-II:
        // [ 1 ]        [ 3 ] ---> [ 4 ] ---> [ 5 ] ---> [ 24 ] ---> null
        //               ↑
        //               |
        //              [ 2 ]
        
        // Step-III:
        // [ 1 ]        [ 3 ] ---> [ 4 ] ---> [ 5 ] ---> [ 24 ] ---> null
        //     |        ↑
        //     |        |
        //     -------->[ 2 ]
        
        // ******************** Summary ********************
        // Arrays vs Linked Lists:
        // - Arrays provide fast indexing (O(1)) but are not easily resizable
        // - Linked lists allow dynamic resizing but have slower element access (O(n))
        // - Arrays are contiguous in memory, whereas linked lists are scattered
        // - Insertions in arrays may require shifting elements, while linked lists use pointers
    }
}