package 進階;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.FileSystemAlreadyExistsException;

public class fileoutputdemo {
	
	public static void main(String[] args) {
		File file = new File("C:\\img\\新文字文件.txt");
		try(FileOutputStream fos = new FileOutputStream(file);
				BufferedOutputStream bo = new BufferedOutputStream(fos)){
			String str = "茶裏王無糖綠 ";
			byte[] bytes = str.getBytes();
			fos.write(bytes);
			System.out.println("ok");
		}catch(FileSystemAlreadyExistsException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
