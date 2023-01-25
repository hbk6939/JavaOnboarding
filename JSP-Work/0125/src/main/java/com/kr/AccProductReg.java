package com.kr;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kr.vo.Account;

/**
 * Servlet implementation class AccProductReg
 */
@WebServlet("/accreg")
public class AccProductReg extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private HashMap<String, Account> accs = new HashMap<>();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AccProductReg() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		int money = Integer.parseInt(request.getParameter("money"));
		
		if (accs.containsKey(id)) {
			Account acc = accs.get(id);
			acc.setMoney(acc.getMoney() + money);
		}else {
			accs.put(id, new Account(id, name, money));
		}
		
		request.setAttribute("accs", accs);
		RequestDispatcher rds = request.getRequestDispatcher("acclist.jsp");
		rds.forward(request, response);
		
	}

}
