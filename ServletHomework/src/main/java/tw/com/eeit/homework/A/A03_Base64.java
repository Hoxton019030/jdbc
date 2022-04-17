package tw.com.eeit.homework.A;

import java.io.FileInputStream;
import java.nio.file.Paths;
import java.util.Base64;

/*
 * 1.請撰寫程式，讀取指定路徑的圖片，將圖片(二進資料byte[])轉成文字(字串String)，並列印在Console區
 * 2.可能使用到的Google關鍵字：【JAVA Base64轉換】、【HTML Base64顯示】
 * 3.【執行本程式請使用】右鍵 → Run As → Java Application (若用Run on Server會無法執行)
 * */
public class A03_Base64 {
	public static void main(String[] args) throws Exception {
		// 取得圖片路徑
		String imgPath = Paths.get("").toAbsolutePath().toString() + "\\src\\main\\webapp\\image\\A.jpg";
		System.out.println(imgPath);
		FileInputStream input = new FileInputStream(imgPath);
		byte[] bytes = input.readAllBytes();
		String encodedString = Base64.getEncoder().encodeToString(bytes);
		System.out.println(encodedString);

//		String string = "hello world";
//		byte[] encodedBytes = Base64.getEncoder().encode(string.getBytes());
//		String encodedStr = new String(encodedBytes);
//		System.out.println(encodedStr);
//		
//		byte[] decodeedBytes = Base64.getDecoder().decode(encodedStr.getBytes());
//		String decodedStr = new String(decodeedBytes);
//		System.out.println(decodedStr);

	}

}
