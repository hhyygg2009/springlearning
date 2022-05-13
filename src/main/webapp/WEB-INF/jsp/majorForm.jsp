<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2021/4/15
  Time: 14:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>收集专业信息</title>
</head>
<body>
<hr>
<form action="addMajor" method="post">
    <table border="1">
        <tr>
            <td>Major Id:</td>
            <td><input type="text" id="majorId" name="majorId" tabindex="1"></td>
        </tr>
        <tr>
            <td>Major Name:</td>
            <td><input type="text" id="majorName" name="majorName" tabindex="2"></td>
        </tr>
        <tr>
            <td>Tuition:</td>
            <td><input type="text" id="tuition" name="tuition" tabindex="3"></td>
        </tr>
        <tr>
            <td><input id="reset" type="reset" tabindex="4"></td>
            <td><input id="submit" type="submit" tabindex="5"
                       value="添加专业"></td>
        </tr>


    </table>
</form>
</body>
</html>
