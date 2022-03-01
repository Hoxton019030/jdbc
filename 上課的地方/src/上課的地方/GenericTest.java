package 上課的地方;

import java.util.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class GenericTest {

	public void test1() {
		ArrayList list = new ArrayList();
		list.add(78);
		list.add(76);
		list.add(89);
		list.add(88);
		Iterator<Integer> iterator =list.iterator();
		int stuScore = while(iterator.next());
		
		for(Object score: list) {
			int stuScore1 = (Integer)score;
			System.out.println(stuScore1);
		}
		
	}

	public void test2() {
>
	}

	public void test3() {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Tom", 87);
		map.put("Jerry", 17);
		map.put("Jack", 57);

//		map.put(1323, "abc");

		Set<Map.Entry<String, Integer>> entry = map.entrySet();
		Iterator<Map.Entry<String, Integer>> intetor = entry.iterator();
		
		while()

	}

}
