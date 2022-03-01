
public class BuildArrayFromPermutation {

	public static void main(String[] args) {
		int[] num = { 9,8,7,3,4,0,1,2,5,6 };
		int[] ans = new int[num.length];
		for (int i = 0; i < num.length; i++) {
			ans[i] = num[num[i]];

		}
		for (int i : ans) {
			System.out.print(i+",");
		}

	}
}
