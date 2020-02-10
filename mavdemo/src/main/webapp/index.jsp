<%--
  Created by IntelliJ IDEA.
  User: zangye03@gmail.com
  Date: 2020/1/14
  Time: 21:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>管理员登录</title>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="./css/bootstrap.min.css" >

    <!-- Loding font -->
    <link href="./css/fonts.css?family=Montserrat:300,700" rel="stylesheet">

    <!-- Custom Styles -->
    <link rel="stylesheet" type="text/css" href="./css/styles.css">
</head>
<body>

<%--<form action="/name/login" method="post">--%>
<%--    <input type="text" placeholder="账户" name="username">--%>
<%--    <input type="password" placeholder="密码" name="password">--%>
<%--    <input type="submit" placeholder="登录">--%>
<%--    <a href="/in/register">注册</a>--%>
<%--</form>--%>

<div class="container" id="login">
    <div class="row justify-content-center">
        <div class="col-lg-8">
            <div class="login">

                <h1>Login</h1>

                <!-- Loging form -->
                <form method="post" action="/name/login" >
                    <div class="form-group">
                        <input name="username" type="username" class="form-control" id="exampleInputUsername"  placeholder="Username">

                    </div>
                    <div class="form-group">
                        <input name="password" type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
                    </div>

                    <div class="form-check">

                        <label class="switch">
                            <input type="checkbox">
                            <span class="slider round"></span>
                        </label>
                        <label class="form-check-label" >Remember me</label>

                        <label class="forgot-password">
                            <a href="#">Forgot Password?</a>
                        </label>

                    </div>

                    <br>
                    <button type="submit" class="btn btn-lg btn-block btn-success">Sign in</button>
                    <button class="btn btn-lg btn-block btn-success"><a href="/in/register">注册</a></button>
                </form>
                <!-- End Loging form -->

            </div>
        </div>
    </div>
</div>

</body>
</html>
