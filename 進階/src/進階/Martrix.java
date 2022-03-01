package 進階;

public class Martrix {
	public static void main(String[] args) {

		int[][] array = { { 1, 2, 3,4 }, {  5, 6, 7,8 }, {  9, 10, 11,12 } };
		Route route = new Route();
		route.do_route(array);
		

	}

}

class Route {
	public void do_route(int[][] array) {
		int[][] new_array = new int[4][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				 new_array[j][2-i] = array[i][j];
			}
			System.out.println();

		}
		for (int[] js : new_array) {
			for (int i : js) {
				System.out.print(i+",");
			}
			System.out.println();
		} 
		
		

	}
}
