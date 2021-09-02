package com.javaGG.ex;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormEx
 */
@WebServlet("/FormEx")
public class FormEx extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormEx() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("doGet!!");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		System.out.println("doPost!!");
		
		request.setCharacterEncoding("EUC-KR"); //한글세팅 UFT-8
		
		String name = request.getParameter("name"); //이름 파라미터값 가져오기
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		String[] hobby = request.getParameterValues("hobby"); 
		//취미는 여러개의 값을 가져오게 되므로 배열로 선언하고 getparameterValuese 메서드로 받아옴
		String major = request.getParameter("major");
		String protocol = request.getParameter("protocol");
		
		response.setContentType("text/html; charset=EUC-KR");
		PrintWriter writer = response.getWriter();
		
		writer.println("<html><head></head><body>");
		writer.println("안녕하세요."+ name + "님 반갑습니다." + "<br/>" +
						name + "님의 취미는 " + Arrays.toString(hobby) + "입니다."); 
		                                   //배열값을 문자열로 반환
		writer.println("입력하신 아래 가입 정보를 확인하시기 바랍니다.<br/>");
		writer.println("이름 : " + name + "<br/>");
		writer.println("아이디 : " + id + "<br/>");
		writer.println("비밀번호 : " + pw + "<br/>");
		
		writer.println("전공 : " + major + "<br/>");
		writer.println("프로토콜 : " + protocol + "<br/>");
		
		writer.println("</body></thml>");
		
		writer.close();
		
		
	}

}