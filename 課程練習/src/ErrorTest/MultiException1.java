package ErrorTest;

import javax.management.openmbean.ArrayType;

public class MultiException1 {
	public static void main(String[] args) {
		int[] myarray = new int[10];
		try {
			int test = 120 / 5;
			myarray[5] = 120;
			int n = Integer.parseInt("你好嗎");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("例外內容:" + e.toString());
			System.out.println("也就是:超出陣列索引範圍的例外發生");
			
		}catch (ArithmeticException e) {
		}System.out.println("Done");
			System.out.println("例外內容:" + e.toString());
		}catch(Exception e)
	{

	}System.out.println("例外內容:"+e.toString());

}
