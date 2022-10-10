/**
 * 
 */
package mystack;

import java.util.*;

/**
 * @author Karen Franco 
 *
 */

// Stack using generics

// Complete the provided code

public class MyStack<T> {

	private class MyNode<T1> {
		T1 val;
		MyNode<T1> next;

		MyNode(T1 v, MyNode<T1> n) {
			val = v;
			next = n;
		}
	}

	private MyNode<T> theStack = null;

	/**
	 * 
	 */
	public MyStack() {
	}

	public T pop() {
		// TODO To complete
		T popElt = theStack.val;
		theStack = theStack.next;
		return null;
	}

	public void push(T v) {
		// TODO To complete
		theStack = new MyNode<T>(v, theStack);
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO To complete
		// Create a stack of Integer
		// Push 1 and 2
		// Pop
		// Push 5
		Stack<Integer> STACK = new Stack<Integer>();
		STACK.push(1);
		STACK.push(2);
		STACK.pop();
		STACK.push(5);
		
		// TODO To complete
		// Create a stack of Person
		// Push a person p1 with your name
		// Push a person p2 with my name
		Stack<String> STACK2 = new Stack<String>();
		STACK2.push("Karen Franco");
		STACK2.push("Christelle Scharff");
	}

}
