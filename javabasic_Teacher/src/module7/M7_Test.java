package module7;

public class M7_Test {

	public static void main(String[] args) {
		System.out.println("100+3="+(100+3));
		System.out.println("100-3="+(100-3));
		System.out.println("100*3="+(100*3));
		System.out.println("100/3="+(100/3d));
		long i=127;
		float d=i;
		short s=(short) i;
		byte b=(byte) i;
		Object o=i;
		System.out.println(o.getClass().getSimpleName());
		--b;
		System.out.println(b);
		System.out.println("100%3="+(100%3));
	}

}
