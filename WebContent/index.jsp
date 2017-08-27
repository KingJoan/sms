<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta charset="utf-8" />
        <title>登录</title>
        <link rel="stylesheet" href="css/login.css" />
        <script type="text/javascript" src="js/jquery-3.1.1.min.js" ></script>
        <script type="text/javascript" src="js/login.js" ></script>
    </head>
    <body>
        <div align="center" class="login">
            <h3>登录</h3>
            <form action="Login" method="post">
                <input id="username" name="username" type="text" placeholder="用户名"/>
                <input id="password" name="password" type="password" placeholder="密码" />
                <input id="loginButton" type="submit" value="登录"/><br>
            </form>
            
            <div class="forget">
                <a href="#">忘记密码</a>
            </div>
            
        </div>
        
    </body>
</html>