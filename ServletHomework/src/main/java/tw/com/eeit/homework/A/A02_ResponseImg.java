package tw.com.eeit.homework.A;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/page/ResponseImg.do")
public class A02_ResponseImg extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/*
	 * 1.請撰寫程式碼，取得【A02_GeImage.html】頁面送過來的圖片名稱。 2.回應對應的圖片給瀏覽器。(只回應圖片即可，無須回應圖片名稱)
	 * 3.部分參考方法如下方「參考方法()」，根據寫法可達成：「使用者輸入完整名稱(ex:A.jpg)，回應對應圖片」 或
	 * 「使用者輸入部分名稱(ex:A)，回應對應圖片」
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("image/jpg;charset=UTF-8");
		String imgId = request.getParameter("ImgId");
		
		if(!imgId.contains(".jpg")) {
			imgId=imgId+".jpg";
		}
		
		ServletContext context = getServletContext();
		String realPath = context.getRealPath("image/")+imgId;
		FileInputStream input = new FileInputStream(realPath);
		byte[] bytes = input.readAllBytes();
		input.close();
		
		ServletOutputStream out = response.getOutputStream();
		out.write(bytes);
		out.close();
		
		
		
		參考方法(); //依序執行參考方法的內容，此列可刪除。
		// 以下請完成：根據使用者輸入的內容，回傳對應的圖片給瀏覽器
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	private void 參考方法() {
		// 取得圖片儲存資料夾(image)的路徑，並列印在Console區域
		String imgDirectoryPath = getServletContext().getRealPath("") + "\\image";
		System.out.println("【imgDirectoryPath】\t" + imgDirectoryPath);

		// 根據路徑建立File物件，以便做後續操作
		File imgDirectory = new File(imgDirectoryPath);

		// 使用File物件中的.list()方法，取得此資料夾下的所有檔案名稱，並存成陣列
		String[] imgNameArray = imgDirectory.list();

		// 將陣列轉換成List<String>，較彈性且能用的方法較多；列印在Console以確認內容
		List<String> imgNameList = Arrays.asList(imgNameArray);
		System.out.println("【imgNameList】\t\t" + imgNameList);
	}

}
