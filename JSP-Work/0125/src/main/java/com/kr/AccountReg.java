package com.kr;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AccountReg
 */
@WebServlet("/account")
public class AccountReg extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AccountReg() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// getParameter는 setAttribute로 매핑해줘야하고
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		int money = Integer.parseInt(request.getParameter("money"));
		String type = request.getParameter("type");
		String grade = request.getParameter("grade");
		
//		request.setAttribute("id", id);
//		request.setAttribute("name", name);
//		request.setAttribute("money", money);
//		request.setAttribute("type", type);
//		request.setAttribute("grade", grade);
		
		response.setCharacterEncoding("utf-8");
		
		// getRequestDispatcher로 "accinfo.jsp"에다가 처리를 요청
		RequestDispatcher dispatcher = request.getRequestDispatcher("accinfo.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
