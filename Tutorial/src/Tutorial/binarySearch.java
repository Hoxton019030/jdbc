package Tutorial;
import java.util.Arrays;
public class binarySearch {
	public static void main(String[] args) {
		int[] num = new int[]{1,2,3,5,6};
		int n1 = Arrays.binarySearch(num, 2);
		int n2 = Arrays.binarySearch(num, 4);
		
		System.out.println(n1);
		System.out.println(n2);
	}

}
