<%--
  Created by IntelliJ IDEA.
  User: hhyygg2009
  Date: 2021/4/25
  Time: 15:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<aside id="sidebar" class="affix">
    <div id="sidebar-search">

    </div>
    <div id="sidebar-menu">
        <ul class="nav sidebar-nav">
            <li>
                <a href="<c:url value="/user/index"/>"><span class="glyphicons glyphicon-home"></span><span class="sidebar-title">后台首页</span></a>
            </li>
            <li>
                <a href="<c:url value="/dept/select"/>"><span class="glyphicons glyphicon-file"></span><span class="sidebar-title">系别管理</span></a>
            </li>
            <li>
                <a href="<c:url value="/major/select"/>"><span class="glyphicons glyphicon-paperclip"></span><span class="sidebar-title">专业管理</span></a>
            </li>
            <li>
                <a href="<c:url value="/class/select"/>"><span class="glyphicons glyphicon-credit-card"></span><span class="sidebar-title">班级管理</span></a>
            </li>
            <li>
                <a href="<c:url value="/user/select"/>"><span class="glyphicons glyphicon-paperclip"></span><span class="sidebar-title">用户管理</span></a>
            </li>
        </ul>
    </div>
</aside>