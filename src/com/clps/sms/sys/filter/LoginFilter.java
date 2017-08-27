package com.clps.sms.sys.filter;

import java.io.IOException;  
import javax.servlet.Filter;  
import javax.servlet.FilterChain;  
import javax.servlet.FilterConfig;  
import javax.servlet.ServletException;  
import javax.servlet.ServletRequest;  
import javax.servlet.ServletResponse;  
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;  

import org.apache.log4j.MDC;  
  
public class LoginFilter implements Filter{  
  
       
    private final static double DEFAULT_USERID= Math.random()*100000.0;    
  
    @Override
    public void destroy() {  
    }  
  
    
    @Override
    public void doFilter(ServletRequest request, ServletResponse response,  
           FilterChain chain) throws IOException, ServletException {  
    	
    	HttpServletRequest httpRequest=(HttpServletRequest)request;
        HttpServletResponse httpResponse=(HttpServletResponse)response;
        HttpSession session=httpRequest.getSession();
        
        System.out.println("Login..........");
        if (session==null){  
            MDC.put("username",DEFAULT_USERID);
            httpResponse.sendRedirect(httpRequest.getContextPath());
        }  
        else{  
            String name=(String) session.getAttribute("username");  
            if (name==null){  
            	MDC.put("username",DEFAULT_USERID);   
            	httpResponse.sendRedirect(httpRequest.getContextPath());
            }  
            else  
            {  
            	MDC.put("username",name);   
            	chain.doFilter(request, response);
            }  
        }  
        //logger.info("test for MDC.");  
    }  
    
    @Override
    public void init(FilterConfig Config) throws ServletException {  
  
    }  
}
