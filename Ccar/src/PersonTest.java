
public class PersonTest {
	public static void main(String[] args) {
		Person b = new Person();
		b.setAge(12);
		b.getAge();
		System.out.println(b.getAge());
		
	}
	
}
class Person {
	private int age ;
	public void setAge(int year ){
		if (year>0 && year <130){
			age = year;
		}
		else {
			System.out.println("���~�A���s����");
		}
	}
	public int getAge() {
		return age;
	}
	
}