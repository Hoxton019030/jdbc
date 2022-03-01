package module12;

public class M12_Lab01 {
	static int i = 100;

	public static void main(String[] args) {
		String q = "String資料型別是不是基本資料型別(Y/N)";
		boolean 及格 = false;
		do {
			String ans = javax.swing.JOptionPane.showInputDialog(q);
			if ("N".equals(ans)) {
				System.out.println("及格");
				及格 = true;
			} else {
				System.out.println("不及格");
			}

		} while (!及格);

		System.out.println("程式結束");

//		String q = "String資料型別是不是基本資料型別(Y/N)";
//		String ans = JOptionPane.showInputDialog(q);
//		if ("N".equals(ans)) {
//			System.out.println("及格");
//		} else {
//			System.out.println("不及格重考");
//			boolean 重考及格 = false;
//			while (!重考及格) {
//				String reans = JOptionPane.showInputDialog(q);
//				if ("N".equals(reans)) {
//					System.out.println("及格");
//					重考及格 = true;
//				}else {
//					System.out.println("重考不及格");
//				}
//			}
//		}

	}

}
