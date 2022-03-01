package extendDemo;

public class while_another {
	public static void main(String[] args) {

		boolean pass =false;
		do {
			int score = (int) (Math.random() * 100);
			if (score > 60) {
				System.out.println(score+"及格");
				pass =true;
				
			} else {
				System.out.println(score+"不及格");
				
			}
		} while (!pass);

	}
}
