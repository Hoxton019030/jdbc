package Tutorial;

public class bulidObject {
	public static void main(String[] args) {
		Ccar car1;
		car1 = new Ccar();
		car1.gas = 40;
		car1.tbo = 13.6;
		car1.maxDist();
		double distance = car1.dist(20);
		System.out.println("car1 �T����T :");
		System.out.printf("�̤j���o�q : %s L",car1.gas );
	}

}
