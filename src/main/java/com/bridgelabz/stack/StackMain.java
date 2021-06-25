package com.bridgelabz.stack;

public class StackMain {

	public static void main(String[] args) {
		StackOperations obj = new StackOperations();

		// insert Stack value
		obj.push(70);
		obj.push(30);
		obj.push(56);

		// print Stack elements
		obj.display();
		
		// print Top element of Stack
        System.out.printf("\nTop element is %d\n", obj.peek());
 
        // Delete top element of Stack
        obj.pop();
        obj.pop();
 
       // print Stack elements
        obj.display();
 
        // print Top element of Stack
        System.out.printf("\nTop element is %d\n", obj.peek());
  

	}

}
