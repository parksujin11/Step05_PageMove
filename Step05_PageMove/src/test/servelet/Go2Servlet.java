package test.servelet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/go2")
public class Go2Servlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
	System.out.println("/go2 요청 처리중...");
	
	/*
	 * redirect 이동하라는 응답하기
	 * -클라이언트에게 새로운 요청을 하라고 강제하는 응답
	 * response.sendRedirect 
	 * go1 누르면 http://localhost:8888/step05_PageMove/go1
	 * go2 누르면 http://localhost:8888/step05_PageMove/result2.jsp
	 * result2로 가라고 강제시킨응답
	 */
	response.sendRedirect("result2.jsp");
	}
}
