<%--
  Created by IntelliJ IDEA.
  User: zangye03@gmail.com
  Date: 2020/2/5
  Time: 19:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="./css/bootstrap.min.css" >

    <!-- Loding font -->
    <link href="./css/fonts.css?family=Montserrat:300,700" rel="stylesheet">

    <!-- Custom Styles -->
    <link rel="stylesheet" type="text/css" href="./css/styles.css">
</head>
<body>
<div>
<form action="/user/re" method="post">
    <input type="text" placeholder="用户名" name="rusername">
    <input type="password" placeholder="密码" name="rpassword">
    <input type="submit" value="注册">
</form>
</div>

<%--<div class="container" id="login">--%>
<%--    <div class="row justify-content-center">--%>
<%--        <div class="col-lg-8">--%>
<%--            <div class="login">--%>

<%--                <h1>Login</h1>--%>

<%--                <!-- Loging form -->--%>
<%--                <form method="post" action="/user/re" >--%>
<%--                    <div class="form-group">--%>
<%--                        <input name="username" type="username" class="form-control" id="exampleInputUsername"  placeholder="Username">--%>

<%--                    </div>--%>
<%--                    <div class="form-group">--%>
<%--                        <input name="password" type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">--%>
<%--                    </div>--%>

<%--                    <div class="form-check">--%>

<%--                        <label class="switch">--%>
<%--                            <input type="checkbox">--%>
<%--                            <span class="slider round"></span>--%>
<%--                        </label>--%>
<%--                        <label class="form-check-label" >Remember me</label>--%>
<%--                        --%>

<%--                    </div>--%>

<%--                    <br>--%>
<%--                    <button type="submit" class="btn btn-lg btn-block btn-success">注册</button>--%>
<%--                </form>--%>
<%--                <!-- End Loging form -->--%>

<%--            </div>--%>
<%--        </div>--%>
<%--    </div>--%>
<%--</div>--%>

</body>
</html>
