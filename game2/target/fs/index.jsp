<html>
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="./css/bootstrap.min.css" >

    <!-- Loding font -->
    <link href="./css/fonts.css?family=Montserrat:300,700" rel="stylesheet">

    <!-- Custom Styles -->
    <link rel="stylesheet" type="text/css" href="./css/styles.css">

    <title>Login</title>
</head>
<body>

<!-- Backgrounds -->

<%--<div id="login-bg" class="container-fluid">--%>

<%--    <div class="bg-img"></div>--%>
<%--    <div class="bg-color"></div>--%>
<%--</div>--%>

<!-- End Backgrounds -->

<%--<div class="fs">--%>

<%--</div>--%>
<div class="container" id="login">
    <div class="row justify-content-center">
        <div class="col-lg-8">
            <div class="login">

                <h1>Login</h1>

                <!-- Loging form -->
                <form method="post" action="/backed/user/login" >
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
                </form>
                <!-- End Loging form -->

            </div>
        </div>
    </div>
</div>


</body>
</html>