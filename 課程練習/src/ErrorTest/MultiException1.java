package ErrorTest;

import javax.management.openmbean.ArrayType;

public class MultiException1 {
	public static void main(String[] args) {
		int[] myarray = new int[10];
		try {
			int test = 120 / 5;
			myarray[5] = 120;
			int n = Integer.parseInt("�A�n��");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�ҥ~���e:" + e.toString());
			System.out.println("�]�N�O:�W�X�}�C���޽d�򪺨ҥ~�o��");
			
		}catch (ArithmeticException e) {
		}System.out.println("Done");
			System.out.println("�ҥ~���e:" + e.toString());
		}catch(Exception e)
	{

	}System.out.println("�ҥ~���e:"+e.toString());

}
