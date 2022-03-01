package PolymorphismDemo2;

import java.util.Scanner;

interface Share {
	double area();
}

class Circle implements Share {
	private double radius;

	public Circle(double r) {
		this.radius = r;
	}

	public double area() {
		return 3.14 * radius * radius;
	}
}

class Tapezoid implements Share {
	private double upBase;
	private double downBase;
	private double hight;

	public double area() {
		return (upBase + downBase) * hight / 2;
	}

}

public class PolymorphismDemo2 {
	public static void main(String[] args) {
		double radius;
		double upbase;
		double downbase;
		double hight;
		Share sha;
		Circle cir;
		Tapezoid tap;

		Scanner scn = new Scanner(System.in);
		while (true) {
			System.out.println("請輸入數字選擇形狀:1.circle 2.tapezoid 0.leave");
			int item = scn.nextInt();
			if (item == 1) {
				System.out.println("請輸入半徑?");
				radius = scn.nextDouble();
				cir = new Circle(radius);
				sha = cir;

			} else if (item == 2) {
				System.out.println("請輸入上底?");
				upbase = scn.nextDouble();
				System.out.println("請輸入下底?");
				downbase = scn.nextDouble();
				System.out.println("請輸入高?");
				hight = scn.nextDouble();

			} else {
				scn.close();
				break;
			}
		}
	}

}
