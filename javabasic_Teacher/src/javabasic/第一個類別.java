package javabasic;

import java.math.BigDecimal;

public class 第一個類別 {
	static int i=101;
	public static void main(String[] args) {
		
		
		System.out.print("\"");
		System.out.print("\\");
		System.out.print('\'');
		System.out.println("aaaaaaaaaaaaaaaa\n"
				+ "aaaaaaaaaaaaaaaaaaaaaaaaaaa\r"
				+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaa\r\n"
				+ "aaaaaaaaaaaaaaaa巨槌瑞斯");
		System.out.println(i);
		i++;
		c();

	}
	
	public static void c()
	{
		System.out.println(i);
	}
}
