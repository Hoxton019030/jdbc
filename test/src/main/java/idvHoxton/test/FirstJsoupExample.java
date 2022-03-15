package idvHoxton.test;

import java.io.IOException;
import java.net.URL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author Shane - shanelee.co.uk
 */

public class FirstJsoupExample {
	public static void main(String[] args) {
		// 獲取請求 須全程聯網
		try {
			String url = "https://search.jd.com/Search?keyword=java&enc=utf-8&suggest=1.rem.0.SAK7|MIXTAG_SAK7R,SAK7_M_AM_L5406,SAK7_M_COL_U17677,SAK7_S_AM_R,SAK7_SC_PD_R,SAK7_SM_PB_R,SAK7_SS_PM_R|&wq=Java&pvid=485a7677e7e14521ac33356469e7bc6c";
			Document document = Jsoup.parse(new URL(url), 30000);
			// 解析網頁(Jsoup返回的Document 就是瀏覽器的Document對象)
			Element element = document.getElementById("J_goodsList");
			// 所有你在JS中可以使用的方法，這裡都能用。
//		System.out.println(element.html());
			// 可以先Print看看，Print的出來就代表沒啥問題
			Elements elements = element.getElementsByTag("li");
			for (Element element1 : elements) {
				String price = element1.getElementsByClass("p-price").eq(0).text();
				String name = element1.getElementsByClass("p-name").eq(0).text();
				String img = element1.getElementsByTag("img").eq(0).attr("src");
				String img2 = element1.getElementsByTag("img").eq(0).attr("data-lazy-img");

				System.out.println("==================");

				System.out.println(img);
				// 關於這種圖片特別多的網站，它所有的都是延遲載入的。
				System.out.println(img2);
				// 所以要找到它真正儲存的位置。

				System.out.println(price);
				System.out.println(name);

			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}