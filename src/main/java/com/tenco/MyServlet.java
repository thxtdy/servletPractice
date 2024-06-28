package com.tenco;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
// http://localhost:8080/hello/MyServlet
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MyServlet() {
		super();
		System.out.println("호출1");
	}

	public void init(ServletConfig config) throws ServletException {
		System.out.println("호출2");
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("호출3");
		System.out.println("서비스 메소드 호출 확인");
		response.setContentType("text/html; charset=UTF-8");
		// 부모 클래스 메소드 호출
		super.service(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doGet 메소드 호출");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doPost 메소드 호출");
	}

	public void destroy() {
		System.out.println("destroy() 메소드 호출");
		super.destroy();
	}

}
