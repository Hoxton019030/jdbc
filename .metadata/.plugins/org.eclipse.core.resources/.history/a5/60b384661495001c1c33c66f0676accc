
public class evenAI implements AI {
	@Override
	public void guessNumber() {
		// TODO Auto-generated method stub

		int aiAnswer = (int) (Math.random() * 100);//2問題:有辦法直接指定ramdom的範圍嗎?
		while (true) {
			if (aiAnswer % 2 == 0 && aiAnswer > Main.min && aiAnswer < Main.max) {
		        //3短路運算用在這邊可以嗎
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

	}

	@Override
	public void nameSelf() {
		return;
		// TODO Auto-generated method stub

	}
}
