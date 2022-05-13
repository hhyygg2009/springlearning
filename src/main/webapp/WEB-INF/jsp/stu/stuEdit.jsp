<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>学生信息</title>
<script type="text/javascript" 
      src="${pageContext.request.contextPath }/js/jquery-3.5.0.min.js">
</script>

<script type="text/javascript">
function toEdit(){
    // 获取输入的用户名和密码
	
	
	
	$.ajax({
		url : "",
		type : "post", 
		// data表示发送的数据
		data :JSON.stringify({stuno:no,stuname:name,stupwd:pwd,stusex:sex}),
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
			  window.location.href=________________________;
			}
		}
	});
}
</script>
</head>
<h2>学生信息</h2>
${msg}
<form action="edit">
学号：<input id="stuno"  type="text" value="${stu.STUNO }" readonly/><br/>
姓名：<input id="stuname"  type="text" value="${stu.STUNAME}"/><br/>
性别：<input id="stusex"  type="text" value="${stu.STUSEX }"/><br/>
密码：<input id="stupwd"  type="text" value="${stu.STUPWD}"/><br/>
图像：<input id="stupwd"  type="text" value=""/><br/>
简历：<a href="">我的简历</a><input id="stupwd"  type="text" value=""/><br/>
<input type="button" value="修改" onclick="toEdit()"/>
<input type="reset" value="重置" />
</form>
<br/>
<a href="">个人文件</a>
</body>
</html>