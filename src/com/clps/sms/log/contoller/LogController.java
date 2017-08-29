package com.clps.sms.log.contoller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.clps.sms.log.factory.LogServiceFactory;
import com.clps.sms.log.service.LogService;

import net.sf.json.JSONArray;

@Controller
public class LogController {
	
	@RequestMapping(value = "manageLog")
	public String userlogin() {
		return "/jsp/log/manageLog";
	}
	
	@ResponseBody
	@RequestMapping(value="log",method = RequestMethod.POST,produces="text/html;charset=UTF-8")
	public String log(HttpServletRequest request, HttpServletResponse response){
		String log =request.getParameter("log").trim();
		String action =request.getParameter("action").trim();
		String content	=request.getParameter("content").trim();
		String type =request.getParameter("type");
		String name	=request.getParameter("name").trim();
		String start =request.getParameter("start").trim();
		String end	=request.getParameter("end").trim();			
		int page	=Integer.parseInt(request.getParameter("page").trim())-1;
		
		LogService logService = null;
		JSONArray jsonArray = null;
		switch (log) {
			case "登录":
				logService=LogServiceFactory.getLogAccountServiceInstance();
				break;
			case "账户会议":
				logService=LogServiceFactory.getLogAccountMeetingServiceInstance();
				break;
			default:
				break;
		}
		if(logService!=null&&page>=0){
			if(type.equals("全部")){
				type="";
			}
			if( (start.equals("")||end.equals(""))&&name.equals("")){
				jsonArray=logService.listLogsGeneral(action, content, type, page);
			}else if(start.equals("")||end.equals("")){
				
				jsonArray=logService.listLogsByName(action, content, type, name, page);
			}else if(name.equals("")) {
				jsonArray=logService.listLogsByTimeRange(action, content, type, start, end, page);
			}else {
				jsonArray=logService.listLogsByNameAndTimeRange(action, content, type, name, start, end, page);
			}
		}
		System.out.println(jsonArray.toString());
		return jsonArray.toString();
	}
}
