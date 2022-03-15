package idvHoxton.test;

import java.io.IOException;
import java.net.URL;
import java.util.Iterator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws IOException {
		String url = "https://tw.stock.yahoo.com/cryptocurrencies";
		Document document = Jsoup.parse(new URL(url), 10000);
		Elements element = document.getElementsByClass("List(n)");
//		System.out.println(element.html());
		
		for(Element x : element ) {
			String coinName =x.getElementsByClass("Lh(20px) Fw(600) Fz(16px) Ell").eq(0).text();
			String coinPrice =x.getElementsByClass("Fxg(1) Fxs(1) Fxb(0%) Ta(end) Mend($m-table-cell-space) Mend(0):lc Miw(90px)").eq(0).text();
			
			System.out.println(coinName);
			System.out.println(coinPrice);
		}

	}

}
