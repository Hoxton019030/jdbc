package 上課的地方;

public class Clazz2 {
	public static void main(String[] args) {
		Clazz clazz = new Clazz();
		System.out.println(clazz.publicInt);
		System.out.println(clazz.protectedInt);
		System.out.println(clazz.defaultInt);
		//如何才能捕捉存取範圍子的錯誤(private)
		try{
			System.out.println(clazz.privateInt);
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
	}
	

}
