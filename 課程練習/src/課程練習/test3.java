package ½Òµ{½m²ß;import java.awt.dnd.DropTargetAdapter;

public class test3 {


	public static void main(String[] args) {
		tesht t = new tesht();
		t.print();
		t.setA(20);
		t.print();
		System.out.println(DropTargetAdapter());
		
		
	}

}
class tesht {
	private double a = 10;
	
	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}
	public void print() {
		System.out.println(a);
	}
	
	
}

