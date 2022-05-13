<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>教师图像上传</title>
</head>
<body>
<h2>教师图像上传</h2>
	<form>
		<table>
			<tr>
				<td>个人图像:</td>
				<td><input  id="photo"  name="photo" value="${uploadImgError}"></td>
			</tr>
			<tr>
				<td><input type="submit" value="上传"></td>
				<td><input type="submit" value="重置"></td>
			</tr>
		</table>
	</form>
</body>
</html>