package ½Òµ{½m²ß;

public class PersonTest {
	public static void main(String[] args) {

		Person p1 = new Person();
		p1.eat();

		Man man = new Man();
		man.eat();
		man.age = 25;
		man.earnMoney();

		//
		System.out.println("*****************");
		Person p2 = new Man();
		Person p3 = new Woman();
		
		p2.eat();
		p2.walk();
		
	}

}
