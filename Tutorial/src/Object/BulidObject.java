package Object;

public class BulidObject {
	public static void main(String[] args) {
		Ccar car1;
		car1 = new Ccar();
		Ccar car2 = new Ccar();
		car1.gas = 40;
		car1.tbo = 13.6;
		car1.maxDist();
		double distance = car1.dist(20);
		System.out.println("car1 �T����T :");
		System.out.printf("�̤j���o�q: %s L", car1.gas);
		System.out.printf("�����Ӫo�q: %s km/L", car1.tbo);
		System.out.printf("�[���o�i��p: %s km", car1.max_dist);
		System.out.printf("�[��20L�i��p: %s km", distance);

		car2.gas = 60;
		car2.tbo = 9.5;

	}
}
