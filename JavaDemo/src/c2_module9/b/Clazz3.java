package c2_module9.b;

import c2_module9.a.Clazz;

public class Clazz3 extends Clazz {
	

	

	public Clazz3() {
		super();
		super.publicString="";
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Clazz3 clazz=new Clazz3();
		System.out.println(clazz.publicString);
		System.out.println(clazz.protectedString);
//		System.out.println(clazz.defaultString);
//		System.out.println(clazz.privateString);

	}
	
	@Override
	public void A() {
		// TODO Auto-generated method stub
		super.A();
	}
	

}
