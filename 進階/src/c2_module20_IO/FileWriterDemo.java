package c2_module20_IO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
	public static void main(String[] args) {
		try (FileWriter fw = new FileWriter("C:\\img\\新文字文件.txt"); BufferedWriter bw = new BufferedWriter(fw)) {
			fw.write("每朝健康綠茶");
			fw.flush();
			System.out.println("ok");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

}
