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
		
		request.setCharacterEncoding("EUC-KR"); //�ѱۼ��� UFT-8
		
		String name = request.getParameter("name"); //�̸� �Ķ���Ͱ� ��������
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		String[] hobby = request.getParameterValues("hobby"); 
		//��̴� �������� ���� �������� �ǹǷ� �迭�� �����ϰ� getparameterValuese �޼���� �޾ƿ�
		String major = request.getParameter("major");
		String protocol = request.getParameter("protocol");
		
		response.setContentType("text/html; charset=EUC-KR");
		PrintWriter writer = response.getWriter();
		
		writer.println("<html><head></head><body>");
		writer.println("�ȳ��ϼ���."+ name + "�� �ݰ����ϴ�." + "<br/>" +
						name + "���� ��̴� " + Arrays.toString(hobby) + "�Դϴ�."); 
		                                   //�迭���� ���ڿ��� ��ȯ
		writer.println("�Է��Ͻ� �Ʒ� ���� ������ Ȯ���Ͻñ� �ٶ��ϴ�.<br/>");
		writer.println("�̸� : " + name + "<br/>");
		writer.println("���̵� : " + id + "<br/>");
		writer.println("��й�ȣ : " + pw + "<br/>");
		
		writer.println("���� : " + major + "<br/>");
		writer.println("�������� : " + protocol + "<br/>");
		
		writer.println("</body></thml>");
		
		writer.close();
		
		
	}

}