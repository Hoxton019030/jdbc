package cycu;

import java.util.stream.IntStream;

public class 陣列練習 {
	public static void main(String[] args) {
		int[] a = new int[3];
		// 創建一個名字為a，大小為3的陣列。

		int[] b = { 53, 26, 37, 94 };
		// 創建一個名字為b，內容為53,26,37,94的陣列。

		int[] c = IntStream.range(1, 100).toArray();
		// 創建一個名字為c，內容是1~100的陣列。

		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
			// 利用迴圈的方式逐一Print每個值。
			//c.length取得各值的長度

		}

		//--------二維陣列---------------------
		int [][] two_d = {{1,2,3},{4,5,6},{7,8,9}};
		int sum = 0 ;
		System.out.println(two_d [1][2]);
		for (int x=0;x<two_d.length;x++)
		{
			for (int y=0 ; y <two_d[0].length;y++)
			{
				sum += two_d[x][y];
			}
			
		
		}
		System.out.println();
		System.out.println("陣列總和:"+sum);
		
		
	
	}
	

}
