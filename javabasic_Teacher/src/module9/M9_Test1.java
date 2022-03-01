package module9;

import java.util.Scanner;


public class M9_Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("輸入你的年齡：");
		String ageStr = sc.next();
//		int age = sc.nextInt();//#1
		
//		String name2 = JOptionPane.showInputDialog("輸入您的大名：");
		Integer age = Integer.valueOf(ageStr);//#2
		if(age<15) {
			System.out.print("半");

		}else if(age<60) {
			System.out.print("全");
			
		}else {
			System.out.print("敬老");
			
		}
		System.out.println("票");
		

	}

}
