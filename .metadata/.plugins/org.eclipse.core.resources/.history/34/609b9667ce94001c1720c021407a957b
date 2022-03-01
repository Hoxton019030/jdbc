import java.util.Scanner;

public class Main {
	static int max = 100;
	static int min = 0; // 問題6:什麼時候會把一個屬性、方法設為static，是希望它一被宣告，就能被所有程式接收到嗎，還是說因為各個Class都有很大機率會用到這個屬性,所以設成static比較方便?
	final static int answer = (int) (Math.random() * 100);

	public static void main(String[] args) {
	}

		Humanplayer humanplayer = new Humanplayer();
		AI evenai = new evenAI(); 
		AI oddai = new oddAI();
		//問題7:如果我想要創造不只一位humanplayer,不只一位evenai,不只一位oddai，請問我該怎麼做
		//
		

		humanplayer.nameSelf();
		System.out.println(answer);
		System.out.println("請輸入一個數字");
		do
		 {
			humanplayer.guessNumber();
			humanplayer.setTheCounter();
			evenai.guessNumber();
			humanplayer.setTheCounter();
			oddai.guessNumber();
			humanplayer.setTheCounter();
			//}while(answer!=)
				//do-while 處理 ab-ab型迴圈
				//問題8:我希望這一塊的邏輯是「當任意玩家(humanplayer或aiplayer)輸入正確答案後會結束這個迴圈，我應該要怎麼寫呢?
				

	}

}
