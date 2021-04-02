<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2021/3/1
  Time: 18:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" %>
<html>
<head>
    <title>add</title>
</head>
<body>
    <h1>添加用户信息</h1>
    <form action="${pageContext.request.contextPath}/user/add" method="post">
        姓名:<input type="text" name="name"><br>
        年龄:<input type="text" name="age"><br>
        生日:<input type="text" name="bir"><br>
        <input type="submit" value="提交"/>
    </form>
</body>
</html>
