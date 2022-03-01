package cycu;

import java.util.Scanner;

public class swtich練習_輸入一個1位數_判斷是否為質數 {
	public static void main(String[] args) {
		System.out.println("輸入一個1~10的整數，會回傳是否是質數");
		Scanner number = new Scanner(System.in);
		int input_number = number.nextInt();
		//Swtich只支援Int Char Str或是Enum類別的判斷
		

		
		if (input_number > 10) {
			System.out.println("看不懂中文?輸入1~10");
		}

		else {
			switch (input_number) {
			case 2:
			case 3:
			case 5:
			case 7:
			case 9:
				System.out.println("質數");
				break;
				//可以用這個方式處理相同結果
				//break不可省略
			case 1:
				System.out.println("不是質數也不是合數");
				break;
			default:
				System.out.println("偶數");
				break;
				//default通常放在最後，用來處理最後剩下的情況
			}

		}

	}
		
}
