<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>学生文件上传</title>
</head>
<body>
<h2>学生文件上传</h2>
	<form action="/file/upload" method="post" enctype="multipart/form-data">
		<table>
			<tr>
				<td>个人图像:</td>
				<td><input id="photo" type="file" name="photo" value="${uploadFileError}"></td>
			</tr>
<%--			<tr>--%>
<%--				<td>个人简历:</td>--%>
<%--				<td><input id="resume"  name="resume" value="${uploadWpError}"></td>--%>
<%--			</tr>--%>
			<tr>
				<td><input type="submit" value="上传"></td>
			</tr>
		</table>
	</form>

<table>
	<c:forEach items="${files}" var="f">
		<tr><td>${f}</td><td><a href="download/${f}">下载</a></td></tr>

	</c:forEach>
</table>
</body>
</html>