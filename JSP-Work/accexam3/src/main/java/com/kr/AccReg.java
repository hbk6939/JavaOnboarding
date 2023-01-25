package com.kr;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kr.vo.Account;

/**
 * Servlet implementation class AccReg
 */
@WebServlet("/accreg")
public class AccReg extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AccReg() {
		super();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	// 이번에는 세션
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");

		String id = request.getParameter("id");
		String name = request.getParameter("name");
		int money = Integer.parseInt(request.getParameter("money"));

		HttpSession session = request.getSession();
		Account acc = (Account) session.getAttribute(id);

		if (acc == null) {
			session.setAttribute(id, new Account(id, name, money));
		} else {
			acc.setMoney(acc.getMoney() + money);
		}

		// ? 시키는 방법
//		RequestDispatcher rds = request.getRequestDispatcher("acclist.jsp");
//		rds.forward(request, response);
		
		// 데이터 넘길 필요 없을 때
		response.sendRedirect("acclist.jsp");
	}

}