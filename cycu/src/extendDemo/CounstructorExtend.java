package extendDemo;

class CMath{
	protected int a = 1;
	CMath(){
		System.out.println("a = "+a);
	}
}

class SonCMath extends CMath{
	protected int b =2;
	SonCMath(){
		System.out.println("a+b="+(a+b));
	}
}

class GrandsonCMath extends SonCMath{
	protected int c = 4;
	GrandsonCMath(){
		System.out.println("a+b+c="+(a+b+c));
	}
}

public class CounstructorExtend {
	public static void main(String[] dick) {
		new GrandsonCMath();
		
	}

}
