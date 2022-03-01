package PolymorphismDemo1;

import java.util.Scanner;

abstract class Share {
	abstract double area(double X, double Y);
}

class Triangle extends Share {
	public double area(double H, double B) {
		return (H * B) / 2;
	}
}

class Rectangle extends Share {
	public double area(double H, double W) {
		return (H * W);
	}
}

public class PolymorphismDemo1 {
	public static void main(String[] args) {
		double high;
		double base;
		Share sha;
		Triangle tri = new Triangle();
		Rectangle rec = new Rectangle();

		Scanner scn = new Scanner(System.in);
		while (true) {
			System.out.println("請輸入數字選擇形狀:1.triangle 2.rectangle 0.leave");
			int item = scn.nextInt();
			if (item == 1) {
				System.out.println("請輸入高?");
				high = scn.nextDouble();
				System.out.println("請輸入底?");
				base = scn.nextDouble();
				System.out.println("三角形高=" + high + "底=" + base);
				sha = tri;
			} else if (item == 2) {
				System.out.println("請輸入長?");
				high = scn.nextDouble();
				System.out.println("請輸入寬?");
				base = scn.nextDouble();
				System.out.println("矩形高=" + high + "寬=" + base);
				sha = rec;

			}
			else {
				scn.close();
				break;
			}
			System.out.println("面積"+sha.area(high, base));
		}
	}

}
