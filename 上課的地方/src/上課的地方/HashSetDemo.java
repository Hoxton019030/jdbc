package 上課的地方;
import java.util.HashSet;
import java.util.Scanner;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<String> hset = new HashSet<String>();
//		var hset = new HashSet<>();
		int order = 1;
		String st;
		Scanner keyin = new Scanner(System.in);
		System.out.println("輸入四個不重複的英文字串...");
		while (order <=4) {
			System.out.println("第"+order+"個字串?");
			st = keyin.nextLine();
			if(hset.add(st))
				order++;
			else
				System.out.println(""+st+"個字串重複輸入!");
		}
		System.out.println("四個字串分別為");
		System.out.println(hset);
		System.out.println("輸入要找尋的英文字串?");
		String findSt1 =keyin.nextLine();
		if(hset.contains(findSt1))
			System.out.println(""+findSt1+"字串存在集合物件中");
		else
			System.out.println(""+findSt1+"字串不在集合物件中");
		
		System.out.println("輸入要刪除的字串?");
		String findSt2 = keyin.nextLine();
		if (hset.remove(findSt2))
			System.out.println(""+findSt2+"字串已刪除");
		else
			System.out.println(""+findSt2+"字串不在集合物件中");
		System.out.println("目前集合物件的元素個素為:" + hset.size());
		keyin.close();
		
	}

}
