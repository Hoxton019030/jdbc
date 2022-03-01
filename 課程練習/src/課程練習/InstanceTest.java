package ½Òµ{½m²ß;


public class InstanceTest{
	public static void main(String[] args) {
		InstanceTest test = new InstanceTest();
		test.method(new Graduate());
	}
	public void method(Person3 e) {
		String info =e.getInfo();
		System.out.println(info);
	}
}
class Person3 {
	protected String name = "person";
	protected int age = 50;

	public String getInfo() {
		return "Name:" + name + "\n" + "age:" + age;
	}
}

class Student extends Person3 {
	protected String school = "pku";

	public String getInfo() {
		return "Name" + name + "\nage:" + age + "\nschool:" + school;
	}
}

class Graduate extends Student {
	public String major = "IT";

	public String getInfo() {
		return "Name:" + name + "\nage:" + age + "\nschool" + school + "\nmajor" + major;
	}
}
