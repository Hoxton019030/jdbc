package Tutorial;

import java.util.Arrays;

public class bubbleSort {
	public static void main(String[] args) {
	    int[] array = new int[] { 69, 91, 12, 56, 23, 78 };
		System.out.print("排序前->");
		for (int i : array) {
			System.out.print(i + " ");

		}
		System.out.println();
		System.out.print("排序前->");
		for (int i : array) {
			System.out.print(i + " ");
		}

	}

	 static void bSort(int[] vArray) {
		Arrays.sort(vArray);
	}
}
