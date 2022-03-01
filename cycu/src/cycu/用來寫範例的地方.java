package cycu;

public class 用來寫範例的地方 {
	public static void main(String[] args) {

		int[] list = { 5, 3, 2, 1, 4 };
		int list_length = list.length;
		
		for(int i=0; i==(1+list_length)/2; i++ )
		{
			for(int j=0,y=5;j<y;y--)
			{
				if(list[j]>list[j+1])
				{
					int tem = list[j];
					list[j]=list[j+1];
					list[j+1] = tem;
				}
				
				
			}
		}
		for(int i=0;i<list_length;i++)
		System.out.println(list[i]);
	}

}
