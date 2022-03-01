package extendDemo;

public class whilepratice {

	public static void main(String[] args) {

		int score = (int) (Math.random() * 100);

		if (score > 60) {
			System.out.println("及格");
		} else {
			System.out.println(score+"不及格，重考");
			boolean pass = false;
			while (!pass) {
				int re_score = (int) (Math.random() * 100);
				if (re_score > 60) {
					System.out.println(re_score + "讚，及格");
					pass = true;
				} else {
					System.out.println(re_score + "不及格，重考");
				}

			}
		}

	}

}
