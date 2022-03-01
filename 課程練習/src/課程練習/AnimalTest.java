package 課程練習;

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

		System.out.println(" 動物，進食");
	}

	public void shout() {
		System.out.println("動物，叫");
	}

}

class Dog extends Animal {
	public void eat() {

		System.out.println("狗，吃骨頭");
	}

	public void shout() {
		System.out.println("汪");
	}
}

class Cat extends Animal {
	public void eat() {

		System.out.println(" 狗，吃魚");
	}

	public void shout() {
		System.out.println("喵");
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