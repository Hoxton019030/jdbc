package Collection;

import java.util.*;

public class ArrayListDemo {
	public static void main(String[] args) {
		System.out.println();
		ArrayList<String> night = new ArrayList<String>();
		List<String> place = List.of("�y��", "�Ὤ", "�Ѳ�", "�Ὤ", "�x�F");
//		for (String p :place)
//			night.add(p);
//		System.out.println("����W���]�J�a�I:" +night);
//		System.out.println("����W���]�J�a�I:" +night.size());
//		night.add("����");
//		night.add(4,"���W");
//		System.out.println();
//		System.out.println("�]�J�Ѳ��b�ĴX��?"+(night.indexOf("�Ѳ�")+1));
//		
		LinkedList<String> queue = new LinkedList<>(night);
		for (int j = queue.size() - 1; j >= 0; j--) {
			queue.getFirst();
			queue.removeFirst();

		}

	}
}
