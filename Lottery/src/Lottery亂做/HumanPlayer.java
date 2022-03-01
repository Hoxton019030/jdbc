package Lottery亂做;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class HumanPlayer implements Player {
	Set<Integer> humanChosenNumber = new TreeSet<Integer>();

	public void chosenNumber() {
		Scanner scn = new Scanner(System.in);
		for (int i = 0; humanChosenNumber.size() < 6; i++) {
//			if (scn.nextInt() < 50 && scn.nextInt() > 0)  不知道為什麼這邊不能順利執行，不能達到我想要的結果。
			humanChosenNumber.add(scn.nextInt());
//			else {
//				System.out.println("你輸入的數字" + scn.nextInt() + "超出範圍" + "請重新輸入");
//				humanChosenNumber.clear();
//			}

		}
		System.out.println("你選的數字是" + humanChosenNumber);

	}

}
