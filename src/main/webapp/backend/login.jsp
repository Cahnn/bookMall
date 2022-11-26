<%--
  Created by IntelliJ IDEA.
  User: 86183
  Date: 2022/11/23
  Time: 23:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>login</title>
    <link href="css/login.css" rel="stylesheet">
</head>

<body>
<div id="loginDiv" style="padding: 50px 0;height: 400px;width: 450px">
    <form action="/bookMall/loginServlet" id="form"  method="post">
        <h1 id="loginMsg">LOGIN IN</h1>
        <div id="errorMsg" style="text-align: center;color: red">${login_msg} ${register_msg}</div>
        <table>
            <tr>
                <td>用户名</td>
                <td class="inputs">
                    <input id="username" name="username" value="${cookie.username.value}" type="text" style="height: 40px">
                </td>

            </tr>
            <tr>
                <td>密码</td>
                <td class="inputs">
                    <input id="password" name="password" type="password" value="${cookie.password.value}" style="height: 40px">
                </td>
            </tr>
            <tr>
                <td>记住我</td>
                <td class="inputs">
<%--                    值为1代表已勾选--%>
                    <input id="remember" name="remember" type="checkbox" value="1" style="float: left">
                </td>
            </tr>
        </table>

        <div id="subDiv">
            <input type="submit" class="button" value="登录">
            <input type="reset" class="button" value="重置">&nbsp;&nbsp;&nbsp;
            <a href="register.jsp">没有账号？点击注册</a>
        </div>
    </form>
</div>

</body>
</html>
