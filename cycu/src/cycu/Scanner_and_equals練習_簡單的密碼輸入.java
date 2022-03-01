package cycu;

import java.util.Scanner;

public class Scanner_and_equals練習_簡單的密碼輸入 {
	public static void main(String[] args) {

		while (true) {
			Scanner account_detail = new Scanner(System.in);
			System.out.println("account_number:");
			String account_number = account_detail.nextLine();
			// 輸入帳號
			System.out.println("account_password:");
			String account_password = account_detail.nextLine();
			// 輸入密碼
			if (account_number.equals("hao123") & account_password.equals("hao987")) {
				// 判斷是否相等，不能用 account_number ==hao123, 而要用 account_number.equals("hao123")
				System.out.println("good");
			}

			else {
				System.out.println("請重新輸入");
			}
		}
	}

}
