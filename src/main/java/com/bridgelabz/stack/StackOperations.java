package com.bridgelabz.stack;

import static java.lang.System.exit;

//Create Stack Using Linked list
class StackOperations {
	// create global top reference variable global
	Node top;

	// Constructor
	StackOperations() {
		this.top = null;
	}

	public void push(int x) // insert at the beginning
	{
		// create new node temp and allocate memory
		Node temp = new Node();

		// check if stack (heap) is full. Then inserting an
		// element would lead to stack overflow
		if (temp == null) {
			System.out.print("\nHeap Overflow");
			return;
		}

		// initialize data into temp data field
		temp.data = x;

		// put top reference into temp next
		temp.next = top;

		// update top reference
		top = temp;
	}

	// Utility function to check if the stack is empty or not
	public boolean isEmpty() {
		return top == null;
	}

	 public int peek()
	    {
	        // check for empty stack
	        if (!isEmpty()) {
	            return top.data;
	        }
	        else {
	            System.out.println("Stack is empty");
	            return -1;
	        }
	    }
	 
	    // Utility function to pop top element from the stack
	    public void pop() // remove at the beginning
	    {
	        // check for stack underflo
	        if (top == null) {
	            System.out.print("\nStack Underflow");
	            return;
	        }
	 
	        // update the top pointer to point to the next node
	        top = (top).next;
	    }

	public void display() {
		// check for stack underflow
		if (top == null) {
			System.out.printf("\nStack Underflow");
			exit(1);
		} else {
			Node temp = top;
			while (temp != null) {

				// print node data
				System.out.printf("%d->", temp.data);
				// assign temp next to temp
				temp = temp.next;
			}
		}
	}
}
