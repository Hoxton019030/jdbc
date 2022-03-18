import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class URLStream {

	public static void main(String[] args) {
		try {
			URL url=new URL("https://data.tainan.gov.tw/dataset/48b5f3bb-7f19-41ab-bd54-29af1dd7fbab/resource/0ef6f0b0-ea3b-4711-ba17-5fb49826331a/download/11101.csv");
			InputStream in = url.openStream();
			InputStreamReader inr=new InputStreamReader(in);
			BufferedReader br=new BufferedReader(inr);
			String line="";
			while((line=br.readLine())!=null) {
				System.out.println(line);
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
