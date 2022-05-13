<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2021/4/15
  Time: 14:52
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>majorInfo</title>
</head>
<body>
<h3>The Major has been saved.</h3>
<hr>
<h3>Details:</h3>
<c:forEach items="${majorList}" var="major">
    Major Id: ${major.majorId}<br/>
    Major Name: ${major.majorName}<br/>
    Tuition: $${major.tuition}<br/>
</c:forEach>

</body>
</html>
