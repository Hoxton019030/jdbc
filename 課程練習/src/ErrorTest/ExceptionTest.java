package ErrorTest;

public class ExceptionTest {
	public static void main(String[] args) {
		int [] myarray = new int[10];
		try {
			myarray[10] = 250;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�ҥ~���e:" + e.toString());
			System.out.println("�]�N�O:�W�X�}�C���޽d��");
		}
		System.out.println("�{���̫�@����槹��");
	}

}
