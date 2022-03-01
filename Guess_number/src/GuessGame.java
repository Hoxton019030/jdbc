
public class GuessGame {
	private int min=0;
	private int max=100;
	private int answer;
	int number;

	public void creatAnswer() {
		setAnswer((int) (Math.random() * 100)); // 問題:如何知道這個數字，只能透過println嗎?

	}

	public boolean guess(int number) {
		this.number = number;
		if(answer == number)
			return true;
		else {if(number>min) {
			this.min=number;
		}else {
			
		}
			
		}
		return false;

	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getMin() {
		return min;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public int getAnswer() {
		return answer;
	}

	public void setAnswer(int answer) {
		this.answer = answer;
	}

}
