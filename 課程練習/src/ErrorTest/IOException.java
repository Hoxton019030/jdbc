package ErrorTest;

public class IOException {
	public static void main(String[] args) {
		try {
			showSalary("�����", 35000);;
			showSalary("�����", 50000);;

		} catch (IllegalArgumentException e) {
			System.out.println("�ҥ~���e :"+ e.getMessage()+e.toString());

		}
	}
	static void showSalary(String name , int money) throws IllegalArgumentException{
		System.out.println("���u:"+name);
		if(money >= 20000 && money<=40000) {
			System.out.printf("\t ���~: %d\t ����:%.1f %n",money,(int)money*0.08);
		}
		else
			throw new IllegalArgumentException("�I�s��k�޼ƿ��~");
	}

}
