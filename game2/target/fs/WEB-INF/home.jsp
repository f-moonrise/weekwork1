<%--
  Created by IntelliJ IDEA.
  User: 13326
  Date: 2020/2/6
  Time: 20:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Home</title>
    <link rel="stylesheet" href="../css/bootstrap.min.css" >
    <style>
        .fs-xa{
            margin: auto;
            padding-top: 100px;
            width: 400px;
            width: 300px;
            /*border: 1px solid black;*/
        }

        #fs-xb{
            width: 100px;
            height: 60px;
            float: left;
        }

        #fs-xc{
            width: 100px;
            height: 60px;
            float: right;
        }
    </style>
</head>
<body>
<div class="jumbotron jumbotron-fluid">
    <div class="container">
        <h1 class="display-4">Welcome join us!</h1>
        <p class="lead">请选择你要去的地方。</p>
    </div>
</div>

<div class="fs-xa">
    <button id="fs-xb" type="button" class="btn btn-primary">进入游戏</button>
    <button id="fs-xc" type="button" class="btn btn-primary">排行榜</button>
</div>
</body>
<script src="../js/jquery.min.js"></script>
<script src="../js/bootstrap.min.js"></script>
</html>