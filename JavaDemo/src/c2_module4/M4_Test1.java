package c2_module4;
//測試用-主程式
//示範用的程式的實踐方式
public class M4_Test1 {
	int a=100;
	public static void main(String[] args) {
		M4_Demo1 md1=new M4_Demo1();
		System.out.println(md1.getA());
		md1.addNum(5, 8);
		double culBMI1 = md1.culBMI(169, 105);
		double culBMI2 = M4_Demo1.culBMI(10, 10);
		System.out.println(culBMI1);
		
		
		
		
		
		
		
		
//		M4_Demo1 m4demo1=new M4_Demo1();
//		int addNum = m4demo1.addNum(2, 4);
//		m4demo1.print(addNum);
//		double cBMI = m4demo1.culBMI(1.69,105);
//		System.out.println(cBMI);
//		m4demo1=null;
//		System.gc();
//		System.out.println();
//		M4_Test1 m4Obj= new M4_Test1();
//		m4Obj.a=5;
		
	}
	

}

