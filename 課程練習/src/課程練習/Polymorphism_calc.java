package ½Òµ{½m²ß;

import java.awt.GraphicsEnvironment;

public class Polymorphism_calc {
	public static void main(String[] args) {
		Polymorphism_calc test = new Polymorphism_calc();
		Circle c1 = new Circle(10, "white", 1.0);
		Circle c2 = new Circle(20, "black" , 1.0);
		MyRectangel r1 = new MyRectangel(10, 20, "green", 1.0);
		test.displayGeometricObject(c1);
		test.displayGeometricObject(c2);
		test.displayGeometricObject(r1);
		boolean answer =test.GeometricTest(c1, c1);
		System.out.println(answer);
		
		
	}
	
	public boolean GeometricTest(GeometricObject g1,GeometricObject g2) {
		return g1.findArea()==g2.findArea();
	}
	public void displayGeometricObject(GeometricObject g3) {
		System.out.println("­±¿n¬O"+g3.findArea());
	}

}

class GeometricObject {
	protected String color;
	protected double weight;

	public GeometricObject(String color, double weight) {
		super();
		this.color = color;
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double findArea() {
		return 0;

	}

}

class Circle extends GeometricObject {
	private double radius;

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public Circle(double radius, String color, double weight) {
		super(color, weight);
		this.radius = radius;
		// TODO Auto-generated constructor stub
	}

	public double findArea() {
		double area = radius * radius * 3.14159;
		return area;

	}

}

class MyRectangel extends GeometricObject {
	private double width;
	private double height;

	public void setWidth(double width) {
		this.width = width;

	}

	public double getWidth() {
		return weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public MyRectangel(double width, double height, String color, double weight) {
		super(color, weight);
		this.width = width;
		this.height = height;
		// TODO Auto-generated constructor stub
	}

	public double findArea() {
		double area = width * height;
		return area;

	}

}