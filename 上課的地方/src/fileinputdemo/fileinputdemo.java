package fileinputdemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.imageio.stream.FileImageInputStream;

public class fileinputdemo {
	public static void main(String[] args) {
		File file = new File("C:\\img\\新文字文件.txt"); // 建立檔案物件
		FileImageInputStream fis = null; // 宣告fileinputstream物件
		try {
			fis = new FileImageInputStream(file); // 建立fileinputstream物件
			int data = 0; // 提供讀取資料變數
			while ((data = fis.read()) != -1) { // 當回傳值為-1時表示結尾
				System.out.println(data); // 印出讀到的數據
				byte[] b = new byte[1];
				b[0] =(byte)data;
			}
			fis.close(); // 關閉連線
			/// ----------例外處理---------
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("找不到檔案");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

}
