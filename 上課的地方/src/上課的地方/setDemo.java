package 上課的地方;

import java.util.HashSet;
import java.util.Set;

public class setDemo {
	public static void main(String[] args) {
		Set <String>strSet = new HashSet<String>();	
		strSet.add("蘋果");
		strSet.add("香蕉");
		strSet.add("香蕉");
		System.out.println(strSet);
		for (String string : strSet) {
			System.out.println(string);
			
		}
		
//		

	}

}
