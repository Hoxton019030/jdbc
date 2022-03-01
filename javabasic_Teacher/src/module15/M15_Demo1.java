package module15;

public class M15_Demo1 {

	public static void main(String[] args) {
		String a="a";
		String a2 ="a";
		String a3 =new String("a");
		char[] a4c= {'a'};
		String a4=new String(a4c);
		
		System.out.println(a.equals(a2));//T
		System.out.println(a.equals(a3));//F
		System.out.println(a.equals(a4));//F
		System.out.println(a2.equals(a3));//F
		System.out.println(a2.equals(a4));//F
		System.out.println(a3.equals(a4));//F
		
		String q = "String資料型別是不是基本資料型別(Y/N)";
		
		System.out.println("q長度="+q.length());
		System.out.println(q.indexOf("資料"));
		System.out.println(q.substring(6));
		System.out.println(q.substring(6,8));
	}

}
