<%--
  Created by IntelliJ IDEA.
  User: 13326
  Date: 2020/2/14
  Time: 14:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>登录</title>
    <meta name="viewport" content="width=device-width,initial-scale=1">
    <link rel="stylesheet" href="css/auth.css">
</head>
<body>
<div class="lowin">
    <div class="lowin-brand">
        <img src="images/kodinger.jpg" alt="logo">
    </div>
    <div class="lowin-wrapper">
        <div class="lowin-box lowin-login">
            <div class="lowin-box-inner">
                <form action="${pageContext.request.contextPath}/user/login.do" method="post">
                    <p>Sign in to continue</p>
                    <div class="lowin-group">
                        <label>Name</label>
                        <input type="text" required="required"  name="username" autocomplete="name" class="lowin-input">
                    </div>
                    <div class="lowin-group password-group">
                        <label>Password <a href="#" class="forgot-link">Forgot Password?</a></label>
                        <input type="password" required="required"  name="password" autocomplete="current-password" class="lowin-input">
                    </div>
                    <button class="lowin-btn login-btn">
                        Sign In
                    </button>

                    <div class="text-foot">
                        Don't have an account? <a href="/user/register.do" class="register-link">Register</a>
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
