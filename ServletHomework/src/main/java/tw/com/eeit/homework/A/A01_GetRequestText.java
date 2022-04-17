package tw.com.eeit.homework.A;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/page/xxxSevrlet")
public class A01_GetRequestText extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/*  1.請撰寫程式碼，取得【A01_SendUserDetail.html】頁面送過來的、HTTP請求的附加參數。
	 *  2.取得後使用PrintWriter物件，將表單內容輸出成HTML檔案給瀏覽器。
	 *  3.輸出內容範例：【姓名:Allen 性別:男 ...略】
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		
		String userName = request.getParameter("userName");
		String gender = request.getParameter("gender");
		String[] hobbylist = request.getParameterValues("hobby");
		PrintWriter out = response.getWriter();
		out.print("姓名:"+userName);
		out.print("<br>");
		out.print("性別:"+gender);
		out.print("<br>");
		out.print("興趣:");
		for(String item:hobbylist) {
			out.write(item);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
