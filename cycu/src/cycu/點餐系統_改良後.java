package cycu;

import java.util.Scanner;
import java.util.Arrays;
public class 點餐系統_改良後 {

	public static void main(String[] args) 
	{
		// 變數區
		String[][] menu = new String[3][];
		int 幾類商品 = 3;
		menu[0] = new String[] { "凱薩沙拉", "和風沙拉" };
		menu[1] = new String[] { "香煎雞腿排", "經典牛排", "海陸雙拼" };
		menu[2] = new String[] { "綠茶", "咖啡", "柳橙汁", "冰醋" };
		
		//變數區
		int[] sel = new int [幾類商品];
		Arrays.fill(sel, 0);
		Scanner scn = new Scanner(System.in);

		for (int i = 0; i < menu.length; i++) 
		{
			System.out.println("**請選擇**");
			for (int p = 0; p < menu[i].length; p++) 
			{
				System.out.println(menu[i][p] + "->輸入" + (p + 1));

			}
			sel[i] = scn.nextInt() - 1;
			System.out.println();
			

		}
		
		System.out.println("你點的餐點是:");
		for (int i=0;i<幾類商品;i++)
		{
			System.out.print(menu[i][sel[i]]+"\t");
		}
		

//		Scanner 點餐順序 = new Scanner(System.in);
//		System.out.println("**請選擇**"+"\n"+"凱薩沙拉->輸入1"+"\n"+"和風沙拉->輸入2");
//		int 開胃菜 = 點餐順序.nextInt();
//		System.out.println("**請選擇**"+"\n"+"香煎雞腿排->輸入1"+"\n"+"經典牛排->輸入2"+"\n"+"海陸雙拼->輸入3");
//		int 主餐 = 點餐順序.nextInt();
//		System.out.println("**請選擇**"+"\n"+"綠茶->輸入1"+"\n"+"咖啡->輸入2"+"柳橙汁->輸入3"+"冰醋->輸入4");
//		int 飲料 = 點餐順序.nextInt();
//		System.out.println(appetizer[開胃菜-1]);
//		System.out.println(main_dish[開胃菜-1]);
//		System.out.println(beverage[開胃菜-1]);

	}
}
