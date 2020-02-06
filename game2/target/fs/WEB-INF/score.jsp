<%--
  Created by IntelliJ IDEA.
  User: 13326
  Date: 2020/2/6
  Time: 22:32
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
            margin: auto;
            padding-top: 100px;
            width: 600px;
            height: 400px;
        }

        #fs-xa tr{
            height: 80px;
        }
    </style>
</head>
<body>
<div class="jumbotron jumbotron-fluid">
    <div class="container">
        <h1 class="display-4">如下为排行榜</h1>
        <p class="lead">请阅览。</p>
    </div>
</div>
<table id="fs-xa" class="table">
    <thead class="thead-dark">
    <tr>
        <th scope="col">id</th>
        <th scope="col">名字</th>
        <th scope="col">分数</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <th scope="row">1</th>
        <td>Mark</td>
        <td>Otto</td>
    </tr>
    <tr>
        <th scope="row">2</th>
        <td>Jacob</td>
        <td>Thornton</td>
    </tr>
    <tr>
        <th scope="row">3</th>
        <td>Larry</td>
        <td>the Bird</td>
    </tr>
    </tbody>
</table>

</body>
<script src="../js/jquery.min.js"></script>
<script src="../js/bootstrap.min.js"></script>