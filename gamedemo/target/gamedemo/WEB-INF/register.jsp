<%--
  Created by IntelliJ IDEA.
  User: 13326
  Date: 2020/2/15
  Time: 15:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
    <meta name="viewport" content="width=device-width,initial-scale=1">
    <!-- Bootstrap CSS -->
<%--    <link rel="stylesheet" href="./css/bootstrap.min.css" >--%>

<%--    <!-- Loding font -->--%>
<%--    <link href="./css/fonts.css?family=Montserrat:300,700" rel="stylesheet">--%>

<%--    <!-- Custom Styles -->--%>
<%--    <link rel="stylesheet" type="text/css" href="./css/styles.css">--%>

    <link rel="stylesheet" href="/css/auth.css">
</head>
<body>
<%--<form action="${pageContext.request.contextPath}/user/register.do" method="post">--%>
<%--    用户名:<input type="text" required="required" placeholder="账户" name="username">--%>
<%--    <br/>--%>
<%--    密码:<input type="password" required="required" placeholder="密码" name="password">--%>
<%--    <br/>--%>
<%--    <input type="submit" value="注册">--%>
<%--</form>--%>

<div class="lowin">
    <div class="lowin-brand">
        <img src="/images/kodinger.jpg" alt="logo">
    </div>
    <div class="lowin-wrapper">

        <div class="lowin-box lowin-register">
            <div class="lowin-box-inner">
                <form action="/user/register.do" method="post">
                    <p>Let's create your account</p>
                    <div class="lowin-group">
                        <label>Name</label>
                        <input type="text" required="required"  name="username" autocomplete="name" class="lowin-input">
                    </div>
                    <div class="lowin-group">
                        <label>Password</label>
                        <input type="password" required="required"  name="password" autocomplete="current-password" class="lowin-input">
                    </div>
                    <button class="lowin-btn">
                        Sign Up
                    </button>

                    <div class="text-foot">
                        Already have an account? <a href="/index.jsp" class="login-link">Login</a>
                    </div>
                </form>
            </div>
        </div>
    </div>


</div>

<script src="/js/auth.js"></script>
<script>
    Auth.init({
        login_url: '#login',
        forgot_url: '#forgot'
    });
</script>
</body>
</html>
