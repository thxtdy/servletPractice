package com.tenco;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
/*
 * HttpServlet 클래스를 상속 받아서 내가 정의한 클래스가 선언이 된다.
 * why? HTTP 프로토콜을 통한 request, response 처리를 할 수 있기 때문
 * 
 * URL 맵핑에 대한 개념을 알자. (www.naver.com) 요청 시 그에 맞는 서블릿 실행
 * 클라이언트가 특정 URL을 요청했을때 해당 URL에 대응하는 서블릿을 실행하도록 설정하는 것을 의미한다.
 * URL 맵핑 - 2가지 방법 알아봤음. 1. java 코드에서 @WebServlet으로 설정하기 || 2. xml 파일에서     <url-pattern>/hello-servlet</url-pattern> 걸어주기
 * 재활용용가리~~~~~~~
 */
@WebServlet(urlPatterns = "/friday", loadOnStartup = 1)
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	// 생성자
    public HelloServlet() {
        super();
        System.out.println("생성자가 호,,출출하네...");
    }
    
    // 해당 서블릿 클래스가 인스턴스화 될때 단 한번 실행되는 메소드
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init Method 호출");
	}
	
	// 메모리에서 내려가기 직전에 호출되는 메소드
	public void destroy() {
		System.out.println("destory 호출");
	}
	
	// GET 요청으로 들어올때 동작하는 메소드
	// 주소 설계 - http://localhost:8080/hello/hello_servlet
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// MIME TYPE - 인터넷 세상에서 데이터의 유형을 나타내는 표준 방식  
		
		response.setContentType("application/pdf");
		response.setCharacterEncoding("UTF-8");
		response.getWriter().write("<html><body><h1>hello</h1></body></html>");
		
	}

	// POST 요청으로 들어올때 동작하는 메소드
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		System.out.println("POST 동작함");
	}

}
