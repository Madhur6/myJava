


class Node{
    Object val;
    Node next;

    public Node(Object val){
        this.val = val;
        this.next = null;
    }
}


class SinglyLinkedList{
    private Node head;
    private Node tail;
    private int length;

    public SinglyLinkedList(){
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    // method to push
    public SinglyLinkedList push(String val){
        Node new_node = new Node(val);
        if (this.head == null){
            this.head = new_node;
            this.tail = this.head;
        } else {
            this.tail.next = new_node;
            this.tail = new_node;
// #             #                           self.tail     next
// #             # [head] ----> [tail]----> [new_node]---->[___]
        }
        this.length+=1;

        return this; // #Returns update list, returns updated instance of Singly linked list
                     // #allows for the chaining of methods
    }


    // method to pop
    public Node pop(){
        if (this.head == null){
            return null;
        }
        Node current = this.head;
        Node new_tail = current;

        while (current.next != null){
            new_tail = current;
            current = current.next;
        }
        // return new_tail;

        this.tail = new_tail;
        this.tail.next = null;
        this.length-=1;


        // Edge case
        if (this.length == 0){
            this.head = null;
            this.tail = null;
        }

        return current;
    }


    // method to shift
    public Node Shift(){
        if (this.head == null){
            return null;
        }

        Node removed = this.head;
        this.head = removed.next;
        removed.next = null;

        this.length-=1;
        
        // edge case
        if (this.length == 0){
            this.tail = null;
        }

        return removed;
    }


    // method to unshift
    public SinglyLinkedList unshift(String val){
        Node new_node = new Node(val);
        if (this.head == null){
            this.head = new_node;
            this.tail = this.head;
        } else {
            new_node.next = this.head;
            this.head = new_node;
        }
        this.length+=1;

        return this;
    }


    // method to get
    public Node Get(int index){
        if (index < 0 || index > this.length){
            return null;
        }
        Node current = this.head;
        int counter = 0;
        while (counter != index){
            current = current.next;
            counter+=1;
        }
        return current;
    }


    // method to Set
    public boolean Set(int index, Object value){
        Node found_node = this.Get(index);
        if (found_node != null){
            found_node.val = value;
            return true;
        }
        return false;
    }


    // method to Insert
    public boolean Insert(int index, String val){
        if (index < 0 || index > this.length){
            return false;
        }
        if (index == this.length){
            // not not truthy == always true ><
            return this.push(val) != null;
        }
        if (index == 0){
            return this.unshift(val) != null;
        }
        Node new_node = new Node(val);
        Node prev = this.Get(index-1);
        Node temp = prev.next;

        new_node.next = temp;
        prev.next = new_node;

        this.length+=1;

        return true;
    }



    // method to remove
    public boolean Remove(int index){
        if (index < 0 || index >= this.length){
            return false;
        }
        else if (index == this.length-1){
            return this.pop() != null;
        }
        else if (index == 0){
            return this.Shift() != null;
        }
        Node prev = this.Get(index-1);
        Node removed = prev.next;
        Node after = removed.next;

        prev.next = after;
        removed.next = null;

        this.length-=1;
        return true;
    }


    // method to reverse
    public void Reverse(){
        Node node = this.head;
        this.head = this.tail;
        this.tail = node;
        
        Node prev = null;

        while (node != null){
            Node next_node = node.next;
            node.next = prev;
            prev = node;
            node = next_node;
        }
    }


    // method to print
    public void print_list(){
        Node current = this.head;
        while (current != null){
            System.out.println(current.val);
            current = current.next;
        }
    }


    // method to get length
    public int get_len(){
        return this.length;
    }
}


public class SinglyList {
    public static void main(String[] args) {

// #**----------------------------------------------------------------------------------------------------------------------------------------**
// # DATA-STRUCTURES

// # ARRAY : contiguous sequence of memory | not easily resizeable | random access(INDEXING) | INSERTING INTO AN ARRAY: 0(n){When you insert an element into an array, you may need to create a new array of size n+1 to accommodate the new element & copy all the existing elements to the new_arr & New array which is going to be of size (n+1), So n-steps.}
// #         omega(1){If we got an array which is already empty(space available)}
// # Accessing: o(1) : 'Calculation of memory address.'

// # LINKED-LISTS : Nodes(needs twice as original data) | resizeable | more dynamic(can grow and shrink without having to touch the original data) | values are spread out randomly 
//                 #  Searching a linked-list: 0(n) : no random access (linked-lists are represented by just the single add. of very 1st node | Computers doesn't have bird's eye views, can only follow pointers) | 
//                 #  Inserting into linked-list: 0(n) : can achieve constant time, But then have to sacrifice sortability
//                 #  (Excluding beg. & end insertions)
// # GO TO PRAC.C

// #--------------------------------------------------------------------
// # SINGLY: Inserting : 0(1) & Deleting : 0(n) or 0(1) {for beg. & end}

// # DOUBLY: Inserting : 0(1) & Deleting : 0(1)

// # searching & accessing is same for both... 0(n)

// # Space complexity: 0(n), where n is the no. of nodes
// #--------------------------------------------------------------------
        


        // Singly-Linked-List-------------------------------------------
        // push----------------------------------------
        SinglyLinkedList list = new SinglyLinkedList();
        list.push("hello")
            .push("byy")
            .push("what");

        list.print_list();
        int len = list.get_len();
        System.out.println(len);


        // pop----------------------------------------
        Node res = list.pop();
        System.out.println("pop: " + res.val);

        list.print_list();
        int len2 = list.get_len();
        System.out.println(len2);


        // shift-------------------------------------
        // list.Shift();
        // list.print_list();
        // int len2 = list.get_len();
        // System.out.println(len2);


        // unshift-----------------------------------
        // list.unshift("unshifted");
        // list.print_list();
        // int len2 = list.get_len();
        // System.out.println(len2);

        
        // Get---------------------------------------
        // Node res = list.Get(-1);
        // System.out.println("Get res: " + res.val);

        
        // Set---------------------------------------
        // System.out.println("*-*-*-*-*-*-*-*-*");
        // list.Set(0, "set");
        // list.print_list();
        // int len2 = list.get_len();
        // System.out.println(len2);


        // Insert------------------------------------
        // System.out.println("*-*-*-*-*-*-*-*-*");
        // list.Insert(4, "inserted");
        // list.print_list();
        // int len2 = list.get_len();
        // System.out.println(len2);


        // Remove------------------------------------
        // System.out.println("*-*-*-*-*-*-*-*-*");
        // list.Remove(-1);
        // list.print_list();
        // int len2 = list.get_len();
        // System.out.println(len2);


        // Reverse----------------------------------
        // list.Reverse();
        // list.print_list();
        // int len2 = list.get_len();
        // System.out.println(len2);
             
    }
}