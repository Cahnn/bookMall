<%--
  Created by IntelliJ IDEA.
  User: 86183
  Date: 2022/11/23
  Time: 23:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>register</title>
  <link href="css/register.css" rel="stylesheet">
</head>
<body>


<div class="form-div">
  <form id="reg-form" action="/bookMall/regServlet" method="post">
    <h1 id="registerMsg">Welcome to register</h1>
    <div id="loginMsg"><span>已有帐号？</span> <a href="login.jsp">登录</a></div>
    <table>

      <tr>
        <td>用户名</td>
        <td class="inputs">
          <input name="username" type="text" id="username">
          <br>

        </td>

      </tr>


      <tr>
        <td>密码</td>
        <td class="inputs">
          <input name="password" type="password" id="password">
          <br>
          <span id="password_err" class="err_msg" style="display: none">密码格式有误</span>
        </td>
      </tr>

      <tr>
        <td>验证码</td>
        <td class="inputs">
          <input name="checkCode" type="text" id="checkCode">
          <img id="checkCodeImg" src="/bookMall/checkCodeServlet">
          <a href="#" id="changeImg">看不清？</a>
        </td>
      </tr>
    </table>

    <p class="err_msg" style="text-align: center">${register_msg}</p>

    <div class="buttons">
      <input value="注 册" type="submit" id="reg_btn">
    </div>
    <br class="clear">
  </form>

  <script>
    // 点击看不清更换图片
    document.getElementById("changeImg").onclick = function (){
      document.getElementById("checkCodeImg").src = "/bookMall/checkCodeServlet?"+new Date().getMilliseconds();
    }

    // 点击图片更换图片
    document.getElementById("checkCodeImg").onclick = function (){
      document.getElementById("checkCodeImg").src = "/bookMall/checkCodeServlet?"+new Date().getMilliseconds();
    }
  </script>

</div>
</body>
</html>
