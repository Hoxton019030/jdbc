package Collection;

import java.util.*;

public class ArrayListDemo {
	public static void main(String[] args) {
		System.out.println();
		ArrayList<String> night = new ArrayList<String>();
		List<String> place = List.of("宜蘭", "花蓮", "天祥", "花蓮", "台東");
//		for (String p :place)
//			night.add(p);
//		System.out.println("初期規劃夜宿地點:" +night);
//		System.out.println("初期規劃夜宿地點:" +night.size());
//		night.add("知本");
//		night.add(4,"池上");
//		System.out.println();
//		System.out.println("夜宿天祥在第幾天?"+(night.indexOf("天祥")+1));
//		
		LinkedList<String> queue = new LinkedList<>(night);
		for (int j = queue.size() - 1; j >= 0; j--) {
			queue.getFirst();
			queue.removeFirst();

		}

	}
}
