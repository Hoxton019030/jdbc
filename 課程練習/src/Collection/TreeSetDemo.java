package Collection;

import java.util.*;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<Integer> array = new TreeSet<>();
		int [] number = {23,45,9,-4,18,93,100,76,54,66,89,34,0,-55,-27,61};
		
		for(int n:number)
			array.add(n);
		System.out.println("���󤺪����e");
		System.out.println(""+ array);
		System.out.println("�Ĥ@�Ӥ������e"+ array.first());
		System.out.println("�̫�@�Ӥ������e"+ array.last());
		
		Scanner keyin = new Scanner(System.in);
		int num = 0;
		while(true) {
			System.out.println("�п�J�@�Ӿ��?");
			try {
				num = Integer.parseInt(keyin.nextLine());
			}catch(NumberFormatException ex) {
				System.out.println("�п�J�ƭ�!");
				continue;
			}
			if (num >= (int)array.first() &&  num<=(int) array.last())
				break;
			else
				System.out.println("�d����~");
		}
		System.out.println("�������e�j�󵥩�"+ num +"��:");
		System.out.println(array.tailSet(num));
		keyin.close();
	}

}
