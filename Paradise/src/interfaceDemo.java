
interface IBrand{
	

	public String brand = "yamaha";
}
interface IMove {
	public int ENGINE_NUM = 1;

	public void addSpeed(int s);
}

class PiliCar implements IMove {
	private int speed;

	public void addSpeed(int s) {
		System.out.println("霹靂車目前速度:" + speed);
		speed += s;
		System.out.println("霹靂車加速後" + speed);
	}
}

class BMXCar implements IMove,IBrand {
	private int speed;

	public void addSpeed(int s) {
		System.out.println("BMX目前速度" + speed);
		speed += s;
		if (speed <= 200) {
			System.out.println("BMX加速後" + speed);
		} else {
			System.out.println("BMX最大速度200 無法再加速了");
		}

	}
}

public class interfaceDemo {
	public static void main(String[] args) {
		System.out.println("所有車子有" + IMove.ENGINE_NUM + "個引擎!");
		PiliCar car1 = new PiliCar();
		car1.addSpeed(150);
		car1.addSpeed(120);
		System.out.println("霹靂車有" + IMove.ENGINE_NUM + "個引擎!");
		BMXCar car2 = new BMXCar();
		car2.addSpeed(150);
		car2.addSpeed(120);
		System.out.println("BMX有" + IMove.ENGINE_NUM + "個引擎!");

	}

}
