package Tutorial;

import java.util.Scanner;
//�ڹ��᭱���G���j�M�k���P�_���ӲM��
public class binarySearch_�ݧ��� {

	public static void main(String[] args) {
		int[] array = new int[10];
		Scanner scanner = new Scanner(System.in);
		System.out.println("�п�J�@��0~100���Ʀr :");
		int input_number = scanner.nextInt();

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 100);
		}
		System.out.println("�ƦC�e");
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
		System.out.println("�ƦC��");
		for (int number : array) {
			System.out.print(number + "\t");
		}
do {
	int low = 0;
	int high = array.length;
	int mid = (low+high)/2;
	
	if (array[mid]==input_number){
		System.out.println("���ߡI");
		break;
	}
	else if (array[mid]>input_number) {
		
		
	}
}while(true);
	}

}
