package com.clps.sms.log.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import com.clps.sms.log.factory.LogFactory;
import com.clps.sms.log.service.LogAccountService;

import net.sf.json.JSONArray;

/**
 * Servlet implementation class LogAccountController
 */
@WebServlet("/accountLog")
public class LogAccountController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	static LogFactory logFactory;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LogAccountController() {
        super();
        // TODO Auto-generated constructor stub
        logFactory=new LogFactory();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		String al_action =request.getParameter("action").trim();
//		String al_action_content	=request.getParameter("content").trim();
//		String al_type =request.getParameter("type");
//		String al_created_name	=request.getParameter("name").trim();
//		String start =request.getParameter("start").trim();
//		String end	=request.getParameter("end").trim();			
//		int begin	=Integer.parseInt(request.getParameter("begin").trim());
//		int num	=Integer.parseInt(request.getParameter("num").trim());
//		JSONArray jsonArray=logFactory.getLogAccountServiceInstance().queryAll();
//		
//		PrintWriter printWriter=response.getWriter();
//		printWriter.write(jsonArray.toString()+"--------"+new Date().toString());
		logFactory.test();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String al_action =request.getParameter("action").trim();
		String al_action_content	=request.getParameter("content").trim();
		String al_type =request.getParameter("type");
		String al_created_name	=request.getParameter("name").trim();
		String start =request.getParameter("start").trim();
		String end	=request.getParameter("end").trim();			
		int begin	=Integer.parseInt(request.getParameter("begin").trim());
		int num	=Integer.parseInt(request.getParameter("num").trim());
//		JSONArray jsonArray=logFactory.getLogAccountServiceInstance().queryAll();
//		
//		PrintWriter printWriter=response.getWriter();
//		printWriter.write(jsonArray.toString());
	}

}
