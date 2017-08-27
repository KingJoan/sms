package com.clps.sms.sys.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.MDC;

import com.clps.sms.sys.service.AccountService;
import com.clps.sms.sys.service.impl.AccountServiceImpl;
import com.clps.sms.util.servlet.ServletUtil;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	AccountService accountService;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
        accountService=new AccountServiceImpl();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		HttpSession session = request.getSession();
		
		MDC.put("IP",ServletUtil.getRemoteHost(request));
		MDC.put("session",session.getId());
		
		if(accountService.login(username, password)){
			session.setAttribute("username", username);
			response.sendRedirect(request.getContextPath()+"/jsp/test.jsp");
//			request.getRequestDispatcher(request.getContextPath()+"/jsp/test.jsp");
			request.setAttribute("resultLogin", "登录成功!");
			System.out.println("登录成功");
		}else{
			session.setAttribute("username", "");
			response.sendRedirect(request.getContextPath());
			request.setAttribute("resultLogin", "用户名或密码错误!");
			System.out.println("注销成功");
		}
	}

}
