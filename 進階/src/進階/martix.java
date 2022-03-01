package 進階;

import java.util.Arrays;

public class martix {
	static int[][] array = { { 0, 1, 2, 3 }, { 4, 5, 6, 7 }, { 8, 9, 10, 11 } }; //3x4

	public static void main(String[] args) {
		martix m=new	 martix();
		Print_martix print_martix = m.new Print_martix();
		
	
	}

	class Print_martix {
		public void print_martix1(int[][] print_Array) { //
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 4; j++) {
					System.out.print(array[i][j] + ",");
				}
				System.out.println();

			}

		}
	}

	 class route {
		 int[][] new_array = new int[4][3];

		public static void do_route(int[][] route_array) {
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 4; j++) {
					route.new_array[j][i] = route_array[i][j];
				}
			}
			System.out.println(Arrays.deepToString(new_array));
		}

	}
}
