package stack;

public class Stack {
	int[] stack;
	int top = -1;
	int a ;

	Stack(int arraysize) {
		this.stack = new int[arraysize];

	}

	public void push(int arraynumber) {
		if (top < stack.length) {
			stack[++top] = arraynumber;
		} else {
			System.out.println("is full");
		}

	}

	public void pop() {
		if (top == -1) {
			System.out.println("it's emtpy");
		} else {
			System.out.println(stack[top--]);
		}
	}

	public boolean isempty() {
		if (top == -1) {
			return true;
		} else {
			return false;
		}

	}

}
