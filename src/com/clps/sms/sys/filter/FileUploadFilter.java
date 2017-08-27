package com.clps.sms.sys.filter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.apache.log4j.Logger;

/**
 * Servlet Filter implementation class FileUploadFilter
 */
@WebFilter( filterName="/FileUploadFilter",urlPatterns={"/Upload"},servletNames={"HttpServlet"})
public class FileUploadFilter implements Filter {
	static Logger logger = Logger.getLogger(FileUploadFilter.class);
	List<String> fileFilter = new ArrayList<>();
	int max;

	/**
	 * Default constructor.
	 */
	public FileUploadFilter() {
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		HttpServletRequest httpServletRequest = (HttpServletRequest) request;
		HttpServletResponse httpResponse = (HttpServletResponse) response;
		Part part = httpServletRequest.getPart("filename");
		String header = part.getHeader("content-disposition");

		/**
		 * 判断 header 是否为空
		 */
		if (header.trim().equals("")) {
			httpResponse.sendRedirect(httpServletRequest.getContextPath() + "/jsp/test.jsp");
			logger.info("header 为空");
			return;
		}
		// header = [filename="xxxx.xxx"]

		String nameKey = "filename=\"";
		int position = header.indexOf(nameKey);

		/**
		 * 判定文件名是否为空
		 */
		if (position < 0) {
			httpResponse.sendRedirect(httpServletRequest.getContextPath() + "/jsp/test.jsp");
			logger.info("文件名为空");
			return;
		}

		String filename = header.substring(position + nameKey.length(), header.length() - 1);
		System.out.println("上传文件名 ：" + filename);
		for (String s : fileFilter) {
			if (filename.endsWith(s)) {
				httpResponse.sendRedirect(httpServletRequest.getContextPath() + "/jsp/test.jsp");
				logger.info("禁止 " + s + " 文件上传");
				return;
			}
		}

		/**
		 * 判断文件是否超过最大限制 （-1：无限制）
		 */
		if ((max != -1) && part.getSize() > max) {
			httpResponse.sendRedirect(httpServletRequest.getContextPath() + "/jsp/test.jsp");
			logger.info("文件超过最大限制");
			return;
		}

		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("begin do the file filter!");

		// String killFile=fConfig.getInitParameter("killFile");
		String killFile = ".txt,.exe";
		String[] killFiles = killFile.split(",");
		for (String s : killFiles) {
			if (!s.trim().equals("")) {
				fileFilter.add(s);
			}
		}

		// String maxString=fConfig.getInitParameter("max");

		String maxString = "100000000";
		System.out.println("max：" + maxString);
		if ((maxString == null) || (maxString.trim().equals(""))) {
			max = -1;
		} else {
			max = Integer.parseInt(maxString);
		}

	}

}
