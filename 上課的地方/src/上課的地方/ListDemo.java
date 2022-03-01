package 上課的地方;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		List strList = new ArrayList();
		strList.add("每朝健康綠茶");
		strList.add("飲冰室茶集綠奶茶");
		strList.add("茶裏王無糖綠");
		strList.add(1, "原萃");
		System.out.println(strList.get(2));
//		strList.remove("每朝健康綠茶");
//		strList.remove(0);
		strList.set(0, "每晚不健康紅茶");

		System.out.println(strList);
		System.out.println(o);
	}

}
