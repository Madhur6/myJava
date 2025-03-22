package Testing;



// null <---- 1 <---->  2 <---->  3 <----->  4 ---> null
// head                                             tail

// Object class -----> "mother-class" of all the classes...

// Class Object is the root of the class hierarchy. Every class has Object as a superclass.
// All objects, including arrays, implement the methods of this class.

class Nodee {
	Object val;
	Nodee next;
	Nodee prev;
	
	public Nodee(Object val) {
		this.val = val;
		this.next = null;
		this.prev = null;
	}
}


// myList:
// null <------> 1 <------> 2 <-------> 3 <--------  4.next ------> prev.5.next [4.next = 5] ---->  null
//            head                                    tail


// Before updating the "tail" pointer, Perform this line: new_node.prev = this.tail;

// new node = 5 ^, myList.tail == 5


class DoublyLinkedList {
	private Nodee head;
	public Nodee tail;
	public int length;
	
	public Nodee getHead() {
		return head;
	}
	
	public DoublyLinkedList() {
		this.head = null;
		this.tail = null;
		this.length = 0;
	}
	
	// Appending a element / node ...
	public DoublyLinkedList addLast(Object val) {
		// Just a measure to make sure the input argument for "Object val" is correct...
		if (!((val instanceof String) || (val instanceof Integer) || (val instanceof Float))) {
			throw new IllegalArgumentException("Only String or Integer or Foat values are allowed!");
		}
		
		
		Nodee new_node = new Nodee(val);
		
		// 1). if this is the first time creating the list, That means our list is empty...
		// null
		// head
		if (this.head == null) {
			System.out.println("First my code goes here");
			// null --- new_node
			//         head / tail
			// After we have added our first node and declared it as head, What would be the tail?
			this.head = new_node;
			// Since there is only one node in the list, Our tail would also be pointing at "head node" only...
			this.tail = this.head;
			
			
		} else { 		// 2). else...it's not empty
			// null <--- head (1) <----> 2 <------> 3 <----> tail(4) ----> null + [we want to add 5 here]
			
			System.out.println("Then it stays here");
			
			this.tail.next = new_node; // tail(4) ---> 5, But also shift the tail to point at our new tail(5)...
			
			new_node.prev = this.tail; // Never perform this line before line [this.tail = new_node;]
			
			this.tail = new_node; // ...4 ----> tail(5)
		}
		this.length++;
		
		return this; 
	}
	
	
	public DoublyLinkedList addFirst(Object val) {
		if (!((val instanceof String) || (val instanceof Integer) || (val instanceof Float))) {
			throw new IllegalArgumentException("Value can only be String / Integer or Float val");
		}
		
		Nodee new_node = new Nodee(val);
		
		if (this.head == null) {
			this.head = new_node;
			this.tail = this.head;
		} else {
			new_node.next = this.head;
			this.head.prev = new_node;
			this.head = new_node;
		}
		this.length+=1;
		return this;
	}
	
	
	
	
	
	public Nodee deleteLast() {
		if (this.head == null) {
			return null;
		}
		
		Nodee popped = this.tail;
		
		if (this.length == 1) {
			this.head = null;
			this.tail = null;
		}
		
		else {
			this.tail = popped.prev;
			this.tail.next = null;
			popped.prev = null;
		}
		
		this.length-=1;
		
		return popped;
	}
	
	
	public Nodee deleteFirst() {
		if (this.head == null) {
			return null;
		}
		
		Nodee popped = this.head;
		
		if (this.length == 1) {
			this.head = null;
			this.tail = null;
		}
		
		else {
			this.head = popped.next;
			this.head.prev = null;
			popped.next = null;
		}
		this.length-=1;
		return popped;
	}
	
	
	
	public Nodee Get(int index) {
		if (index < 0 || index >= this.length) {
			return null;
		}
		
		Nodee current = null;
		int counter = 0;
		
		if (index < this.length/2) {
			current = this.head;
			counter = 0;
			while (counter != index) {
				current = current.next;
				counter+=1;
			}
			return current;
		} else {
			current = this.tail;
			counter = this.length-1;
			while (counter != index) {
				current = current.prev;
				counter-=1;
			}
			return current;
		}
	}
	
	
	
	
	public boolean Add(int index, Object val) {
		if (index < 0 || index > this.length) {
			return false;
		}
		
		else if (index == this.length) {
			return this.addLast(val) != null;
		} else if (index == 0) {
			return this.addFirst(val) != null;
		}
		Nodee new_node = new Nodee(val);
		Nodee previous = this.Get(index-1);
		Nodee next_node = previous.next;
		
		new_node.next = next_node;
		new_node.prev = previous;
		
		previous.next = new_node;
		next_node.prev = new_node;
		
		this.length+=1;
		return true;
	}
	
	
	
	public boolean Remove(int index) {
		if (index < 0 || index >= this.length) {
			return false;
		}
		else if (index == 0) {
			return this.deleteFirst() != null;
		}
		else if (index == this.length-1) {
			return this.deleteLast() != null;
		}
		Nodee removed = this.Get(index);
		Nodee previous = removed.prev;
		Nodee after = removed.next;
		
		previous.next = after;
		after.prev = previous;
		
		removed.next = null;
		removed.prev = null;
		
		this.length-=1;
		
		return true;
	}
	
	
	
	public void printList() {
		Nodee current = this.head;
		while (current != null) {
			System.out.println(current.val);
			current = current.next;
		}
	}
	
	public int size() {
		return this.length;
	}
}



public class DoublyList {
	public static void main(String[] args) {
		DoublyLinkedList myList = new DoublyLinkedList();
		// 1
		myList.addLast(1);
		myList.addLast(2);
		
		myList.addLast(3).addLast(4);
		
		myList.printList();
		System.out.println("Head: " + myList.getHead().val + " | Tail: " + myList.tail.val + " | Length: " + myList.length);
		System.out.println("Head's next: " + myList.getHead().next.val + " | Tail's prev: " + myList.tail.prev.val);
		
		myList.addLast(5); // 😊
		
		int resSize = myList.size();
		System.out.println("The size of our linked-list is: " + resSize);
		
		
		
		System.out.println("-----------------------*-----------------------*-----------------------*");
		myList.addFirst(0);
		myList.printList();
		
		System.out.println("-----------------------*-----------------------*-----------------------*");
		myList.deleteFirst();
		myList.printList();
		
		System.out.println("-----------------------*-----------------------*-----------------------*");
		myList.deleteLast();
		myList.printList();
		
		System.out.println("-----------------------*-----------------------*-----------------------*");
		myList.Add(0, "a");
//		myList.printList();
		myList.Add(1, "b");
//		myList.printList();
		myList.Add(2, "c");
//		myList.printList();
		myList.Add(3, "d");
		myList.printList();
		
		
		System.out.println("-----------------------*-----------------------*-----------------------*");
		myList.Remove(0);
//		myList.Remove(1);
//		myList.Remove(2);
//		myList.Remove(3);
		myList.printList();	
		
		
		System.out.println("-----------------------*-----------------------*-----------------------*");
		System.out.println(myList.Get(1).val);
	}
}








