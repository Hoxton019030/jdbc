package 爬蟲;

import java.io.IOException;
import java.net.URL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/**
 *
 * @author Shane - shanelee.co.uk
*/


public class Crawler {
    public static void main(String[] args) {
    	String url ="https://search.jd.com/Search?keyword=Java&enc=utf-8&suggest=1.rem.0.SAK7|MIXTAG_SAK7R,SAK7_M_AM_L5406,SAK7_M_COL_U17677,SAK7_S_AM_R,SAK7_SC_PD_R,SAK7_SM_PB_R,SAK7_SS_PM_R|&wq=Java&pvid=485a7677e7e14521ac33356469e7bc6c";
    	//獲取請求 須全程聯網
    try {
		Document document = Jsoup.parse(new URL (url), 30000);
		//解析網頁(Jsoup返回的Document 就是瀏覽器的Document對象)
		document.get
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    	
    			
              
    }
    
}