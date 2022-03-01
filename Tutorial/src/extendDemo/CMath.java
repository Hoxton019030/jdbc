package extendDemo;

class CMath {
	public void getMax(int a, int b) {
		int bigNum;
		if (a > b)
			bigNum = a;
		else 
			bigNum = b;
		
		System.out.printf("%d與%d的最大數為%d",a,b,bigNum);

	}
}

class SonCMath extends CMath{
	public void getFactorial(int a) {
		int ans = 1,i;
		System.out.println(ans);
		
	}
}