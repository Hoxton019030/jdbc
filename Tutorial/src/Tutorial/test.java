package Tutorial;

class Cperson{
	private int age;
	public void ShowAge(int age) {
		this.age = age;
		age = age+2;
		System.out.println("�ǤJ��age�ܦ�"+age);
		System.out.println("this age = " + this.age);
	}

}

public class test{
	public static void main(String[] args) {
		Cperson Joe = new Cperson();
		Joe.ShowAge(20);
	}
}


