package c2_module4;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object o=300;
		Object o2=300;
		System.out.println(o==o2);
		//print format
		String format = String.format("%s先生/小姐 ，歡迎光臨","XXX");
		System.out.println(format);
		System.out.printf("您一共消費了%(-9d元%n",-10000);
		System.out.printf("您一共消費了%9.2f元",10000000.004);
	}

}
