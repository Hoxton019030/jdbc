package �ҵ{�m��;

import java.sql.Connection;

public class AnimalTest {
	public static void main(String[] args) {
		
		AnimalTest test = new AnimalTest();
		test.func(new Dog());
		
		test.func(new Cat());

	}

	public void func(Animal animal) {
		animal.eat();
		animal.shout();
	}

}

class Animal {

	public void eat() {

		System.out.println(" �ʪ��A�i��");
	}

	public void shout() {
		System.out.println("�ʪ��A�s");
	}

}

class Dog extends Animal {
	public void eat() {

		System.out.println("���A�Y���Y");
	}

	public void shout() {
		System.out.println("�L");
	}
}

class Cat extends Animal {
	public void eat() {

		System.out.println(" ���A�Y��");
	}

	public void shout() {
		System.out.println("�p");
	}
}


class Order {
	public void method ( Object obj) {
		
	}
}

//class Driver{
//	public void doData (Connection conn) {conn = new MySQLConnection()
//		
//		
//	}
//	
//}