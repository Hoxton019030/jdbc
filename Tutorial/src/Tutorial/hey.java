package Tutorial;

public class hey {
	public static void main(String[] args) {
		int array[] = { 11,54,18,87,101 };
		int temporary;
		
		for (int j=0; j==array.length;j++) {
			if (array[j] > array[j + 1]) {
				temporary = array[j];
				array[j] = array[j+1];
				array[j+1] = temporary;
		}
		
		}
		for (int numer :array) {
			System.out.println(numer);
		}

	}
}


