<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>welcome</title>
</head>
<body>
    <h1>Welcome：<%= request.getSession().getAttribute("username") %></h1><br>
    <a href="../logout">注销</a>
    
    <form method="post" enctype="multipart/form-data" action="../Upload">
             <input type="file"  name="filename"/>
              <input type="submit"  value="上传"/>
     </form>
     <br/>
     <a href="../Download">下载：e://upload/test.txt</a> 
    
</body>
</html>