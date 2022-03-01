package module15;

public class M15_Demo2 {

	public static void main(String[] args) {
		String s = "The class String includes methods for examining individual characters of the sequence, for comparing strings, for searching strings, for extracting substrings, and for creating a copy of a string with all characters translated to uppercase or to lowercase. Case mapping is based on the Unicode Standard version specified by the Character class.";
		int index = 0;
		while ((index = s.toLowerCase().indexOf("string", index)) != -1) {
			System.out.println(index);
			index++;
		}
		System.out.println(s.toUpperCase());
		String str = String.format("%s %d %.2f", "A", 10, 0.1);
		System.out.println(str);
		// ^[A-Z][12][0-9]{8}
		String[] array = new String[8];
		// {0,0,0,0,0,0,0,0}
		int[] arr2 = { 0, 1, 2, 3, 4, 5, 6, 7 };
		int[] arr3 = null;
		array[1]="100";
		System.out.println(array[0]);
		String s1= array[1];
		System.out.println(array.length);

	}

}
