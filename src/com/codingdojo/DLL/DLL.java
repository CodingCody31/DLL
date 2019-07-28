package com.codingdojo.DLL;

public class DLL {
//	void printValuesBackward(): This method prints the values of the nodes from the tail to the head.
	
//	Node pop(): This method removes the last node of our DLL and returns it.
	
//	boolean contains(Integer value): This method returns a boolean whether the value in the argument is in the list or not. Return true if the value exists, else, return false.
	
//	int size(): Returns the number of nodes in the list.

	public Node head;
	public Node tail;
	
	public DLL() {
		this.head = null;
		this.tail = null;
	}
	// the push method will add a new node to the end of the list
	public void push(Node newNode) {
		// if there is no head in the list, aka, an empty list, we set the newNode to be the head and tail of the list
        if(this.head == null) {
            this.head = newNode;
            this.tail = newNode;
            return;
        }
        
        // first find the lastNode in the list
        // then, set the lastNode's next to be the newNode;
        // then, we have to set the previous of the lastNode to the lastNode that we found previously.
        // finally, set the list's tail to be the node that we have added
        Node lastNode = this.tail;
        lastNode.next = newNode;
        newNode.previous = lastNode;
        this.tail = newNode;
    }
	
	public Node pop() {
		Node lastNode = this.tail;
		Node current = lastNode.previous;
		current.next = null;
		this.tail = current;
		return lastNode;
	}
    
    public void printValuesForward() {
        // find the first node, aka head.
        Node current = this.head;
        
        // while the current node exists...
        while(current != null) {
            // print it's value
            System.out.println(current.value);
            // and move on to it's next node.
            current = current.next;
        }
    }
    
    public void printValuesBackward() {
    	Node current = this.tail;
    	
    	while(current != null) {
    		System.out.println(current.value);
    		current = current.previous;
    	}
    }
	public boolean contains(int i) {
		Node current = this.head;
		boolean status = current != null;
		return status;
	}
    
	public int size() {
		Node current = this.head;
		int count = 0;
		while(current != null) {
			count++;
			current = current.next;
		}
		return count;
	}	
	
	
}
