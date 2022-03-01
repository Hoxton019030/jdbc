
public class oddAI implements AI {

	@Override
	public void guessNumber() {

		// TODO Auto-generated method stub

		int aiAnswer = (int) (Math.random() * 100);
		while (true) {
			if (aiAnswer % 2 == 1 && aiAnswer > Main.min && aiAnswer < Main.max) {
				break;
			} else {
				aiAnswer = (int) (Math.random() * 100);
			}
		}
		if (aiAnswer > Main.answer) {
			Main.max = aiAnswer;
		} else if (aiAnswer < Main.answer) {
			Main.min = aiAnswer;
		} else {
			System.out.println("猜對了，好棒！");
		}
		// TODO Auto-generated method stub

	}

	@Override
	public void nameSelf() {
		// TODO Auto-generated method stub

	}

}
