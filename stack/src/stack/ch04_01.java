package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class StackByArray {
	private int[] stack;
	private int top;

	public StackByArray(int stack_size) {
		stack = new int[stack_size];
		top = -1;
	}

	public void push(int data) {
		if (top >= stack.length) {
			System.out.println("It's full");
		} else {
			stack[++top] = data;
		}
	}

	public boolean empty() {
		if (top == -1)
			return true;
		else
			return false;
	}

	public int pop() {
		if (empty()) {
			return -1;
		} else {
			return stack[top--];
		}
	}
}

public class ch04_01{
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader buf;
		int value;
		StackByArray stack = new StackByArray(10);
		buf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("10 datas");
		for (int i =0; i<10 ;i++) {
			value = Integer.parseInt(buf.readLine());
			stack.push(value);
			
		}
		System.out.println("=======================");
		while (!stack.empty()) {
			System.out.println("the order is"+ stack.pop());
		}
	
	}
}
