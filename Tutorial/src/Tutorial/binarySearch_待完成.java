package Tutorial;

import java.util.Scanner;
//我對於後面的二分搜尋法的判斷不太清楚
public class binarySearch_待完成 {

	public static void main(String[] args) {
		int[] array = new int[10];
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入一個0~100的數字 :");
		int input_number = scanner.nextInt();

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 100);
		}
		System.out.println("排列前");
		for (int number : array) {
			System.out.print(number + "\t");
		}

		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temporary = array[j + 1];
					array[j + 1] = array[j];
					array[j] = temporary;

				}
			}

		}
		System.out.println();
		System.out.println("排列後");
		for (int number : array) {
			System.out.print(number + "\t");
		}
do {
	int low = 0;
	int high = array.length;
	int mid = (low+high)/2;
	
	if (array[mid]==input_number){
		System.out.println("恭喜！");
		break;
	}
	else if (array[mid]>input_number) {
		
		
	}
}while(true);
	}

}
