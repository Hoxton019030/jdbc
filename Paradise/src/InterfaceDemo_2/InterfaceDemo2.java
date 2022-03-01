package InterfaceDemo_2;

interface IMove {
	public void showSpeed();
}

interface IFly {
	public void showFly();
}

interface IAnimal extends IMove, IFly {
	public void showAttack();
}

class CAirPlane implements IMove, IFly {
	public void showSpeed() {
		System.out.println("飛機每一次加速，會增加20公里!");
	}

	public void showFly() {
		System.out.println("飛機的最快移動方式，就是飛行!");

	}
}

class CSiteTaMan implements IAnimal {
	public void showSpeed() {
		System.out.println("賽亞人每一次加速，會增加20公里!");

	}

	@Override
	public void showFly() {
		// TODO Auto-generated method stub
		System.out.println("賽亞人飛的速度比光還快!");

	}

	@Override
	public void showAttack() {
		// TODO Auto-generated method stub
		System.out.println("賽亞人攻擊會使用龜派氣功波");

	}
}

public class InterfaceDemo2 {

	public static void main(String[] args) {

	}

}
