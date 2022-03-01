package cycu;

public class for迴圈_次方項_無用練習 {
	public static void main(String[] args) {
		for (var i = 1; i <= 100; i++)
			//for(運算式1;運算式2;運算式3;)
			//運算式1:用來宣告變數
			//運算式2:判斷是否離開迴圈
			//運算式3:每次跑完迴圈後會做什麼

		{
			System.out.println(i + "平方是:" + (int) Math.pow(i, 2));
			//Math.pow(值,幾次方) = 用來計算次方
		}
	}

}
