<%--
  Created by IntelliJ IDEA.
  User: 13326
  Date: 2020/2/6
  Time: 22:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="../css/bootstrap.min.css" >
    <style>
        #fs-xa{
            margin:auto;
            padding-top: 80px;
        }
        #fs-xa li{
            margin: 20px;
            text-align:center;
        }
    </style>
</head>
<body>
<div class="jumbotron jumbotron-fluid">
    <div class="container">
        <h1 class="display-4">下面开始游戏</h1>
        <p class="lead">请点击你的选择。</p>
    </div>
</div>
<div id="fs-xa" class="card" style="width: 18rem;">
    <ul class="list-group list-group-flush">
        <li class="list-group-item active">石头</li>

        <li class="list-group-item active">剪刀</li>
        <li class="list-group-item active">布</li>
    </ul>
</div>
</body>
<script src="../js/jquery.min.js"></script>
<script src="../js/bootstrap.min.js"></script>
</html>
