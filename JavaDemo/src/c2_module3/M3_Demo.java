package c2_module3;

public class M3_Demo {

	public static void main(String[] args) {
		int[][] intListList= {{1,2,3},{4,5,6},{7,8,9}};
		//for(元素:疊代對象)
		for (int[] is : intListList) {
			for(int 一個東西:is) {
				System.out.print(一個東西+",");
				
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int[] is = intListList[2];//二維陣列取一維陣列出來
//		int[] is2 = new int[3];//建立一個尺寸為3的int一維陣列
//		System.out.println(intListList.length);
//		//intListList.length我的二維陣列裡面有多少個一維陣列
//		for(int i=0;i<intListList.length;i++) {
//			//i從0開始(int i=0)直到(;) i小於intListList的陣列長度{原因:索引值最大值為該陣列的長度-1}
//			//(<intListList.lengh;)若完成迴圈則i+1//
//			is2[i]=intListList[i][1];
//			//is2這個陣列的第i個索引值裡面的值(is2[i]) 是(=) 
//			//intListList的第i個陣列的索引值為1的數
//			//intListList[i][1];			
//		}
//		
//		for(int i=0;i<is.length;i++) {
//			System.out.print(is[i]);
//		}
//		System.out.println();
//		for(int i=0;i<is2.length;i++) {
//			System.out.print(is2[i]);
//		}
//		System.out.println(intListList[0][2]);
	}

}
