<%--
  Created by IntelliJ IDEA.
  User: 13326
  Date: 2020/2/16
  Time: 17:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<html>
<head>
    <title>前世名字</title>
</head>
<body>
<div>
    <form action="/user/name.do" method="post">
        <%--        <input type="text" placeholder="你的生肖（示例：狗）" name="shengxiao">--%>
        <%--        <input type="text" placeholder="你的生日月份（示例：12月）" name="month">--%>
        <%--        <input type="text" placeholder="你的星座（示例：魔羯座）" name="xingzuo">--%>
        <%--        <input type="submit" value="查看我的前世名字">--%>


        <div class="input-group mb-3">
            <div class="input-group-prepend">
                <div class="input-group-text">
                    <input type="checkbox" aria-label="Checkbox for following text input">
                </div>
            </div>
            <input type="text" class="form-control" aria-label="Text input with checkbox" placeholder="你的生肖（示例：狗）" name="shengxiao">
        </div>

        <div class="input-group mb-3">
            <div class="input-group-prepend">
                <div class="input-group-text">
                    <input type="checkbox" aria-label="Checkbox for following text input">
                </div>
            </div>
            <input type="text" class="form-control" aria-label="Text input with checkbox" placeholder="你的生日月份（示例：12月）" name="month">
        </div>

        <div class="input-group mb-3">
            <div class="input-group-prepend">
                <div class="input-group-text">
                    <input type="checkbox" aria-label="Checkbox for following text input">
                </div>
            </div>
            <input type="text" class="form-control" aria-label="Text input with checkbox" placeholder="你的星座（示例：魔羯座）" name="xingzuo">
        </div>

        <input type="submit" value="查看我的前世名字">

    </form>

    <div><span>你前世的名字是：${gna}</span></div>
</div>
</body>
</html>