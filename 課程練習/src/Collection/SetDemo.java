package Collection;

import java.util.*;

public class SetDemo {
	public static void main(String[] args) {
		var hset = new HashSet<String>();
		hset.add("¥Õªê");
		var chiaAnimal = Set.of("«CÀs","¦¶³¶","¥ÈªZ");
		for(String p : chiaAnimal)
			hset.add(p);
		String MyAni = "Å¹ÃK";
		hset.add(MyAni);
		System.out.println("¤¤°ê¯b¥Í"+ hset);
		

	}

}
