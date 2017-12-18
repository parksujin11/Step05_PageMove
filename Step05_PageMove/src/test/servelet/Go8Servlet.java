package test.servelet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/go8")
public class Go8Servlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
	System.out.println("/go8 요청 처리중...");
	
	//요청 전달자 객체 얻어오기
	RequestDispatcher rd=request.getRequestDispatcher("view1.jsp");
	//view.jsp 페이지(서블릿) 에 응답을 위임한다. 요청은 서블릿이하고 응답은 jsp가 받는 상황
	rd.forward(request, response);

	}
}
