<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>教师信息</title>
<script type="text/javascript" 
      src="${pageContext.request.contextPath }/js/jquery-3.5.0.min.js">
</script>
<script type="text/javascript">
function toEdit(){
    // 获取输入的用户名和密码





	alert(photo);
	$.ajax({
		url : "",
		type : "post", 
		// data表示发送的数据
		data :JSON.stringify({teano:no,teaname:name,teapwd:pwd,teasex:sex,photo:photo}),
		// 定义发送请求的数据格式为JSON字符串
		contentType : "application/json;charset=UTF-8",
		//定义回调响应的数据格式为JSON字符串,该属性可以省略
		dataType : "json",
		//成功响应的结果
		success : function(data){
			if(data != null){			
			  alert(data.stuno+"修改后的密码为："+data.stupwd+"姓名为："
					  +data.stuname+"性别为："+data.stusex);
			  alert(data.stuno+"修改成功");
			  window.location.href=__________________________________;
			}
		}
	});
}
</script>
</head>
<h2>教师信息</h2>
${msg}
<form action="edit">
工号：<input id="teano"  type="text" value="" readonly/><br/>
姓名：<input id="teaname"  type="text" value=""/><br/>
性别：<input id="teasex"  type="text" value=""/><br/>
密码：<input id="teapwd"  type="text" value=""/><br/>
图像：<img src=""  width="150px"  height="150px"/><br/><input id="photo"  type="file" value=""/><br/><br/>
<input type="button" value="修改" onclick="toEdit()"/>
<input type="reset" value="重置" />
</form>
<br/>
<a href="">返回</a>
</body>
</html>