package stack;

import java.util.Scanner;

public class mywork {
	public static void main(String[] args) {
		System.out.println("請輸入10個數字");
		Scanner scn = new Scanner(System.in);
		Stack stack=  new Stack(10);
		
		for (int i=0 ; i<stack.stack.length;i++) {
			int value = scn.nextInt();
			stack.push(value);
			
		}
		while(!stack.isempty()) {
			stack.pop();
			
		}
	}

}
