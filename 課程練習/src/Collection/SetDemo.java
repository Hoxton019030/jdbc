package Collection;

import java.util.*;

public class SetDemo {
	public static void main(String[] args) {
		var hset = new HashSet<String>();
		hset.add("�ժ�");
		var chiaAnimal = Set.of("�C�s","����","�ȪZ");
		for(String p : chiaAnimal)
			hset.add(p);
		String MyAni = "Ź�K";
		hset.add(MyAni);
		System.out.println("����b��"+ hset);
		

	}

}
