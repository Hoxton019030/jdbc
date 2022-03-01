package 進階;

public class M4_Demo1 {
	public static void main(String[] args) {
		M4_Demo1 m4demo1 = new M4_Demo1();
		int addNum = m4demo1.addNum(2, 4);
		System.out.println(addNum);
		addNum(1,3); // 為什麼不能直接呼叫，要先定義成static嗎?

	}

	public int addNum(int a, int b) {
		int c = a + b;
		return c;

		// 動詞開頭
	}
	public void print(int a) {
		System.out.println(a);
		
	}


}
