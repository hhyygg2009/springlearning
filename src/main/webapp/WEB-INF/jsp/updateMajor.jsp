<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2021/4/16
  Time: 13:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>修改专业信息</title>
</head>
<body>
<hr>
<form action="updateMajor" method="post">
    <table border="1">
        <tr>
            <td>Major Id:</td>
            <td><input type="text" id="majorId" name="majorId" value="${major.majorId}" readonly tabindex="1"></td>
        </tr>
        <tr>
            <td>Major Name:</td>
            <td><input type="text" id="majorName" name="majorName" value="${major.majorName}" tabindex="2"></td>
        </tr>
        <tr>
            <td>Tuition:</td>
            <td><input type="text" id="tuition" name="tuition" value="${major.tuition}" tabindex="3"></td>
        </tr>
        <tr>
            <td><input id="reset" type="reset" tabindex="4"></td>
            <td><input id="submit" type="submit" tabindex="5"
                       value="修改专业"></td>
        </tr>


    </table>
</form>
</body>
</html>
