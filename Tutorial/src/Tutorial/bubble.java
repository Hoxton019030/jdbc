package Tutorial;

public class bubble {
	public static void main(String[] args) {
		int array[] = { 100, 90, 80, 70, 60, 50, 40, 30, 20,10 };
		int temporary;
		for (int i = 0; i < array.length-1; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] > array[j + 1]) {
					temporary = array[j + 1];
					array[j + 1] = array[j];
					array[j] = temporary;
					

				}

			}
			System.out.print("²Ä"+(i+1)+"¦¸ :");

			for (int number : array) {
				System.out.print(number+",");
				
			}
			System.out.println();
		}
		
	}
}
