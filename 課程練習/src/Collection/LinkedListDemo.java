package Collection;
import java.util.*;
public class LinkedListDemo {
	public static void main(String[] args) {
		var place = List.of("Apple","Pear","Banana","Kiwi","Guava");
		var night = new ArrayList<>();
		for (String p : place)
			night.add(p);
		System.out.println("��C�����e�ᶶ��");
		for(int i = 0; i<night.size();i++)
			System.out.println("��"+(i+1)+"��:"+night.get(i));
		
		var stack = new LinkedList<>(night);
		System.out.println("\n ���X�覡(���|): ��i���X");
		while(true) {
			System.out.println(stack.removeLast()+"");
			if(stack.isEmpty())
				break;
		}
		
	}

}
