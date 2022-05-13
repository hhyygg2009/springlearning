<%--
  Created by IntelliJ IDEA.
  User: hhyygg2009
  Date: 2021/4/19
  Time: 15:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <table>


<c:forEach items="${majors}" var="major">
    <tr>
        <td>${major.dept_id}</td>
        <td>${major.major_name}</td>
        <td>${major.major_id}</td>
    </tr>

</c:forEach>
    </table>
</body>
</html>
