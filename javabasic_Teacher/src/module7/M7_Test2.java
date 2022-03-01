package module7;

public class M7_Test2 {

	public static void main(String[] args) {
		int age  = 0b1100;
		int age2 = 0b1010;
				//   1110=14
		System.out.println(Integer.toBinaryString(age|age2));
		System.out.println(Integer.toBinaryString(age&age2));
		System.out.println(Integer.toBinaryString(age^age2));
		System.out.println(Integer.toBinaryString(~age2));
		System.out.println(age2);
		System.out.println(Integer.toHexString(age2));
		System.out.println(!(age > 18));
		if (age > 18) {
			System.out.println("全票");
		} else {
			System.out.println("半票");
		}

	}

}
