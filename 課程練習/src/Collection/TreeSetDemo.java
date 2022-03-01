package Collection;

import java.util.*;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<Integer> array = new TreeSet<>();
		int [] number = {23,45,9,-4,18,93,100,76,54,66,89,34,0,-55,-27,61};
		
		for(int n:number)
			array.add(n);
		System.out.println("物件內的內容");
		System.out.println(""+ array);
		System.out.println("第一個元素內容"+ array.first());
		System.out.println("最後一個元素內容"+ array.last());
		
		Scanner keyin = new Scanner(System.in);
		int num = 0;
		while(true) {
			System.out.println("請輸入一個整數?");
			try {
				num = Integer.parseInt(keyin.nextLine());
			}catch(NumberFormatException ex) {
				System.out.println("請輸入數值!");
				continue;
			}
			if (num >= (int)array.first() &&  num<=(int) array.last())
				break;
			else
				System.out.println("範圍錯誤");
		}
		System.out.println("元素內容大於等於"+ num +"者:");
		System.out.println(array.tailSet(num));
		keyin.close();
	}

}
