package Collection;
import java.util.*;
public class LinkedListDemo {
	public static void main(String[] args) {
		var place = List.of("Apple","Pear","Banana","Kiwi","Guava");
		var night = new ArrayList<>();
		for (String p : place)
			night.add(p);
		System.out.println("串列元素前後順序");
		for(int i = 0; i<night.size();i++)
			System.out.println("第"+(i+1)+"個:"+night.get(i));
		
		var stack = new LinkedList<>(night);
		System.out.println("\n 取出方式(堆疊): 後進先出");
		while(true) {
			System.out.println(stack.removeLast()+"");
			if(stack.isEmpty())
				break;
		}
		
	}

}
