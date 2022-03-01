package c2_module10;

public class HelloWorld {
	public static int count =0;
	
	static {
		System.out.println("Hello static!!");//1
	}//"類別"內部的初始化[!!!***"不是物件"***!!!]
	
	{
		System.out.println("Hello non-static!!");//2
		count++;
	}//"物件"內部的初始化

	public static void main(String[] args) {
		HelloWorld h=new HelloWorld();
		HelloWorld h2=new HelloWorld();
		System.out.println("Hell. world!!");//3
	}

}
