package tw.com.eeit.homework.A;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 1.請撰寫程式碼，使用正規表達式列印字串myImgString，之中的所有圖片路徑，ex:http://localhost/project/dog.jpg
 * 2.可能會使用到的Google關鍵字:greedy、lazy、regex expression
 * 3.正規表達式真要研究，內容足以出一本書，在此僅需知道有此工具即可。
 * 4.私有方法simpleWebCrawler()為java爬蟲簡單實現，需要自行修改圖片輸出路徑才可運行。
 */
public class A04_RegularExpression {
	public static void main(String[] args) throws Exception {
		
		String doMain="localhost:8080";
		String myImgString = "<div>My dog:<img src='http://localhost/project/dog.jpg'></div><div>My cat:<img src='http://localhost/project/cat.jpg'></div></div><div>My rabbit:<img src='http://localhost/project/rabbit.jpg'></div>";
//		String pattern1 = "^(\\bhttp://\\w*/\\w*/\\w*.jpg)";
		String pattern2 = "\\bhttp://\\w*/\\w*/\\w*.jpg";
		String answer ="(http|https).*?(.jpg|.png)";

		Pattern p = Pattern.compile(pattern2);
		Matcher m = p.matcher(myImgString);

		while (m.find()) {

			System.out.println(m.group());
		}
//		Pattern r =Pattern.compile(pattern);
//		Matcher m =r.matcher(myImgString);
//		if(m.find()) {
//			System.out.println("Found value :" +m.group(0));
//			System.out.println("Found value :" +m.group(1));
//			System.out.println("Found value :" +m.group(2));
//			
	}

	private static void simpleWebCrawler() throws Exception {
		// 定義常數，輸出路徑與爬蟲目標
		final String FILE_OUTPUT_FOLDER = "C:\\Users\\user\\Desktop\\temp";
		final String CRAWLER_URL = "https://www.freepik.com/search?format=search&query=food";

		// 根據目標URL建立HTTP連結
		HttpURLConnection u = (HttpURLConnection) new URL(CRAWLER_URL).openConnection();

		// 讀取目標URL回傳的HTML檔案，並存成區域變數htmlFile
		BufferedReader br = new BufferedReader(new InputStreamReader(u.getInputStream()));
		String readTemp;
		String htmlFile = "";
		while ((readTemp = br.readLine()) != null) {
			htmlFile += readTemp;
		}

		// 使用正規表達式分析爬蟲結果
		Pattern zp = Pattern.compile("(?<=src=\")(?:http|https).*?(?:jpg|png)");
//		Matcher m = p.matcher(htmlFile);

		int i = 0; // 只爬前100張圖片
//		while (m.find() && i <= 100) {
		File f = new File(FILE_OUTPUT_FOLDER + "\\" + i + ".jpg");
		try { // 即使出錯也要繼續執行
//				URL fileUrl = new URL(m.group());

			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(f));
//				bos.write(fileUrl.openStream().readAllBytes());
			bos.close();

			i++;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//		br.close();

	/*
	 * 1.會有錯誤訊息是因為正規表達式沒有寫好。 2.這是最簡單的網路爬蟲實現，實務上會採用第三方套件，配合正規表達式做處理。
	 * 3.有些網站會擋爬蟲(java端送出錯誤的header)，此時需要模擬HttpRequest的Header，以繞過網站檢查。
	 */
}
