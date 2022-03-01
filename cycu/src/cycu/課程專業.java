package cycu;

import javax.swing.JOptionPane;

public class 課程專業 {
	public static void main(String[] args) {
		String choice = JOptionPane.showInputDialog(null, "123?\n" + "A. 心情不好的時候，需要逛一下\r\n" + "B. 有事沒事逛一下，看看有什麼好買\r\n"
				+ "C. 沒事不逛街，有缺東西才會進商店選購\r\n" + "D. 新品推出，徹夜排隊也要第一個買到\r\n", "心理測驗", JOptionPane.QUESTION_MESSAGE);
		System.out.println(choice);

		switch (choice) {
		case "A":
			System.out.println(
					"A. 衝動購物型\r\n" + "選擇這一項的你，把購物當作一種發洩的方法，在購物的過程中能夠帶給你滿足感，" + "表示你是一個懂得去排解自己情緒、很懂得愛自己的人！在別人眼中，可能會覺得你"
							+ "「怎麼又買東西了」、「這些東西確定用得到嗎？」，但你一點都不在意！因為自己賺" + "的錢、自己花！別人管不著～～");
			break;
		case "B":
			System.out.println("B. 日常生活型\r\n"
					+ "好像該去 shopping 了～（殊不知上次下單是兩天前）把購物當成習慣的你，像有一個鬧鐘在身體，時間一到就會「鈴鈴玲！該購物啦！」你是一個喜好多元的人，每個商品都有吸引你的地方、都買來試用看看？這樣的你，是個具包容力、心胸寬大的人！");
			break;
		case "C":
			System.out.println("C. 實事求是型\r\n"
					+ "噹啷！要頒發你「實事求是、腳踏實地」獎！認為購物就是解決生活上的需求、跟多於浪費說掰掰的你，是一個很能克制自己慾望的人！你是不是常常被別人說，是一個誠誠懇懇、認真上進的好青年呢？選擇這一項的你，是一個考慮他人比自己多、容忍度相當高的人！");
			break;
		case "D":
			System.out.println("D 時尚尖端型\r\n"
					+ "先讓我推測一番，當時 airpods 一代剛上市，你是朋友間第一個擁有的對吧？愛好追逐流行、喜歡嘗試新事物的你，會透過購物來讓自己走在時尚最前端！選擇這一項的你，是一個好勝心強、不願意認輸的人！換句話說，你的字典裡沒有「失敗」這兩個字！");
			break;
		}
	}

}
