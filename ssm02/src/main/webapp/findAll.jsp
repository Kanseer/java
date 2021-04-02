<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2021/3/1
  Time: 18:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>findAll</title>
</head>
<body>
    <h1>展示用户列表</h1>
    <c:forEach items="${requestScope.users}" var="user">
        ${user.id}===${user.name}===${user.age}===${user.bir} <br/>
    </c:forEach>
    <a href="${pageContext.request.contextPath}/add.jsp">添加用户信息</a>

</body>
</html>
