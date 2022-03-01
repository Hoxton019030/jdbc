package c2_module20_IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		try (FileReader fr = new FileReader("C:\\img\\新文字文件.txt")) {
			int c =0;
			while((c=fr.read())!=-1){
				System.out.println((char)c);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
