
public class Main主要方法 {
	public static void main(String[] args) {
		
		HumanPlayer humanplayer = new HumanPlayer();
		GuessGame guessgame = new GuessGame();
		humanplayer.nameSelf();
		System.out.println("準備開始猜數字囉！");
		System.out.println("請輸入一個1~100之間的數字");
		guessgame.creatAnswer();
		
		

	}

}
