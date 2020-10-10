<%--
  Created by IntelliJ IDEA.
  User: 13326
  Date: 2020/1/18
  Time: 23:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <link rel="stylesheet" href="/css/bootstrap.min.css">

    <style>
        body{
            margin: 0;
            border: 0;
        }
        #left{
            width: 20%;
            height: 94.7%;
            float: left;
            background-color: seagreen;
        }

        #top{
            width: 100%;
            height:40px;
            background-color: #009688;
        }

        #top span a{
            margin-top: 8px;
            margin-right: 15px;
            float: right;
            color: white;
        }

        #le-2{
            margin-top: -20px;
            width: 100%;
            padding-top: 4%;
            padding-left: 3%;
            /*height: 100px;*/
            /*background-color: white;*/
        }
        #le-2 h1{

        }

        #le-3{
            width: 100%;
            height: 600px;
            background-color: salmon;
        }

        .le-3{
            width: 100%;
            height: 80px;
            background-color: salmon;
            font-size: 32px;
        }

        .le-4{
            width: 100%;
            height: 60px;
            background-color: salmon;
            font-size: 28px;
        }
    </style>
</head>


<body>

<div id="top">
        <span>
            <a href="/user/login.do">回到首页</a>
        </span>
</div>
<div id="left">
    <div id="le-2">
        <h1>欢迎登录管理后台</h1>
    </div>

    <div class="dropdown" >
        <button class="btn btn-default dropdown-toggle le-3" type="button" id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
            商品管理
            <span class="caret"></span>
        </button>
        <ul class="dropdown-menu le-4" aria-labelledby="dropdownMenu1">
            <li><a href="/product/plist.do">商品列表</a></li>
            <li><a href="/product/addproduct.do">新增商品</a></li>

        </ul>
    </div>
</div>
</body>

<script type="text/javascript" src="/js/jquery.min.js"></script>
<script type="text/javascript" src="/js/bootstrap.min.js"></script>


</html>
