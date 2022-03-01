package c2_module3;

import c2_module01.Pokemon;

public class M3_Demo2 {
	

	public static void main(String[] args) {
		
		
		
		
		Pokemon p1=new Pokemon();
		p1.weight=120;
		Pokemon p2=new Pokemon();
		p2.weight=50;
		Pokemon p3=new Pokemon();
		p3.weight=16;
		Pokemon p4=new Pokemon();
		p4.weight=25;
		Pokemon[] pList= {p1,p2,p3,p4};
		for (Pokemon pokemon : pList) {
			pokemon.weight=500;
		}
		for (Pokemon pokemon : pList) {
			System.out.println(pokemon.weight);
		}
		
		
		int[] arr= {1,2,3,4};
//		for (int i=0;i<arr.length;i++) {
//			arr[i]=100;
//		}
		for (int i : arr) {
			i=100;
			System.out.println(i);
		}
		for (int i : arr) {
			System.out.println(i);
		}
	}

}
