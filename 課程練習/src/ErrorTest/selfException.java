package ErrorTest;

class MyExcetion extends Exception {
	private String name;

	MyExcetion(String name) {
		this.name = name;
	}

	public String toString() {
		return "�o��MyException�ҥ~�F";
	}

	public String getMessage() {
		return "�~�����i�H100000�H�W";

	}

	public void showData() {
		System.out.println("���u" + name + "���~���]�w���~");
	}

}

class Employee {
	private int money;
	private String name;

	Employee(String name) {
		this.name = name;
		System.out.println("���u:" + name);

	}

	void setMoney(int money) throws MyExcetion {
		if (money < 100000)
			this.money = money;
		else
			throw new MyExcetion(name);
	}

	void showData() {
		System.out.println("�~��:" + money + "\n");
	}
}

public class selfException {
	public static void main(String[] args) {
		try {
			Employee e1 = new Employee("Peter");
			e1.setMoney(50000);
			e1.showData();
			Employee e2 = new Employee("Mary");
			e2.setMoney(100000);
			e2.showData();
		}catch(MyExcetion e) {
			System.out.println(e.toString());
			System.out.println(e.getMessage());
			System.out.println(e.getLocalizedMessage());
			e.showData();
		}
		
	}

}
