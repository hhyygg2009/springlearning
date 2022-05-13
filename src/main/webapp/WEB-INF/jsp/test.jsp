<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: hhyygg2009
  Date: 2021/4/27
  Time: 9:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>

</head>
<body>
<spring:message code="loginname"/>
<form:form modelAttribute="user" action="/user/test" method="post">
    <form:input path="account"/><form:errors path="account"/>
    <form:password  path="password"/><form:errors path="password"/>
    <input type="submit">
</form:form>
</body>
</html>
