package ErrorTest;

public class finallyDemo {
	public static void main(String[] args) {

		int[] myarray = new int[10];
		try {
			myarray[20] = 120;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�ҥ~���e" + e.toString());
			System.out.println("�]�N�O:�W�X�}�C���޽d��");

		} finally {
			System.out.println("����finally�϶�");
		}
		System.out.println("�{�����T����");
	}

}
