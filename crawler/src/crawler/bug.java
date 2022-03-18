package crawler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author Shane - shanelee.co.uk
 */

public class bug {
	public static void main(String[] args) {

//		for (int page = 1; page < 2; page++) {

		String url = "https://data.gov.tw/suggests?p=2&size=10&s=sid_desc";
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new URL(url).openStream()));
			String s="";
			while ((s=br.readLine())!=null) {
				System.out.println(s);
			}
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		// 獲取請求 須全程聯網
//			Document document;
//			try {
//				System.out.println(1);
//				document = Jsoup.parse(new URL(url), 30000);
//				Elements elements = document.select("a");
//				for (Element x : elements) {
//					System.out.println(x);
//				}
//				System.out.println(document);
//				System.out.println(2);
//				for (Element el : elements) {
//					String title = el.getElementsByClass(".v-data-table__mobile-row__cell").eq(0).text();
//					System.out.println(title);
//
//				}
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			// 解析網頁(Jsoup返回的Document 就是瀏覽器的Document對象)

//		}
	}
}