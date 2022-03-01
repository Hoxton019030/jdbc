package c2_module9.a;

import java.io.Serializable;

public class Clazz implements Serializable{
	
	public final String publicString="I am public";
	protected String protectedString="I am protected";
	String defaultString="I am default";
	private String privateString="I am private";
	
	public static void main(String[] args) {
		Clazz clazz=new Clazz();
		System.out.println(clazz.publicString);
		System.out.println(clazz.protectedString);
		System.out.println(clazz.defaultString);
		System.out.println(clazz.privateString);
		clazz.A();
	}
	
	public final void A() {
		
	}
	
}
