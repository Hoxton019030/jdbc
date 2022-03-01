package module7;

public class M7_Test3 {

	public static void main(String[] args) {
		int i=-2;//10
//		boolean b=1==1||++i>2;//i==1
		System.out.println(i>>1);
//		System.out.println(Integer.toBinaryString(i));
		System.out.println(i>>>1);
		
		System.out.println(add(0,5));

	}
	
	public static int add(int a,int b) {
		while(true){
		
		if(b==0)
		{
			return a;
		}
		int sum=a^b;
		int temp = a&b;
		int carry = temp<<1;
		a=sum;
		b=carry;
		//遞迴
		}
	}

}
