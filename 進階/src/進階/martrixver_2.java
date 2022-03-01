package 進階;

public class martrixver_2 {
	public static void main(String[] args) {
		
	int[][] array = {{1,2},{3,4},{5,6},{7,8}}; //4x2//
	
	int[][] new_array = new int[2][4];
	
	for (int i=0;i<4;i++) {
		for(int j = 0 ; j <2 ; j++) {
			new_array[j][i]= array[i][j];
		}
	}
	for (int[] is :new_array) {
		for (int i : is) {
			System.out.print(i+",");
		}
		System.out.println();
	}
	
		
	}
	

}
