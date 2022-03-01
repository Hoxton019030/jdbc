package module12;

import javax.swing.JOptionPane;

public class M12_Demo1 {

	public static void main(String[] args) {
		int i = 101;
		do{
			System.out.println("執行迴圈");
		}while(i<101);
		// 當寫到while迴圈時->離開條件
		// 前測迴圈->執行迴圈裡面的內容會先進行測試
		//
		// 長度不一，沒有規則性=>他有結束條件
//		boolean exitFlag = false;
//		while (!exitFlag) {
//			String inpStr = JOptionPane.showInputDialog("請輸入數字");
//			if (inpStr == null || "exit".equals(inpStr)) {
//				exitFlag = true;
//			}
//
//		}

		// 定義程式開始 目的=>1+.....100
		int count = 1;
		int total = 0;
		while (count <= 100) {
			total += count;

			count++;
		}
		System.out.println("計算結果為:" + total);

	}

}
