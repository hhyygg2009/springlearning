<%--
  Created by IntelliJ IDEA.
  User: hhyygg2009
  Date: 2021/4/19
  Time: 10:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta charset="utf-8">
    <title>登录</title>
    <meta name="keywords" content="Admin">
    <meta name="description" content="Admin">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <!-- Core CSS  -->
    <link rel="stylesheet" type="text/css" href="/css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="/css/glyphicons.min.css">

    <!-- Theme CSS -->
    <link rel="stylesheet" type="text/css" href="/css/theme.css">
    <link rel="stylesheet" type="text/css" href="/css/pages.css">
    <link rel="stylesheet" type="text/css" href="/css/plugins.css">
    <link rel="stylesheet" type="text/css" href="/css/responsive.css">


    <!-- Your Custom CSS -->
    <link rel="stylesheet" type="text/css" href="/css/custom.css">

    <!-- Core Javascript - via CDN -->
    <script type="text/javascript" src="/js/jquery.min.js"></script>
</head>
<body class="login-page">

<!-- Start: Main -->
<div id="main">
    <div class="container">
        <div class="row">
            <div id="page-logo"></div>
        </div>
        <div class="row">
            <div class="panel">
                <div class="panel-heading">
                    <div class="panel-title">系统登录入口</div>
                </div>

                <form action="login" class="cmxform" id="altForm" method="post">
                    <div class="panel-body">
                        <div class="form-group">
                            <div class="input-group"> <span class="input-group-addon">用户名</span>
                                <input type="text" name="account" class="form-control" autocomplete="off"  placeholder="请输入您的用户名">
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="input-group"> <span class="input-group-addon">密&nbsp;&nbsp;&nbsp;码</span>
                                <input type="password" name="password" class="form-control" autocomplete="off" placeholder="请输入您的密码">
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="input-group"> <span class="input-group-addon">角&nbsp;&nbsp;&nbsp;色</span>
                                <select name="roleId"  style="height:34px;">
                                    <option value="0">管理员</option>
                                    <option value="1">教务员</option>
                                    <option value="2">财务人员</option>
                                    <option value="3">宿舍管理员</option>
                                    <option value="4">系书记</option>
                                    <option value="5">新生</option>
                                </select>
                            </div>
                        </div>
                    </div>

                    <div class="panel-footer"> <span class="panel-title-sm pull-left" style="padding-top: 7px;"></span>
                        <div class="form-group margin-bottom-none">
                            <input type="hidden" value="login" name="action-mark" />
                            <input class="btn btn-primary pull-right" type="submit" value="登 录" />
                            <div class="clearfix"></div>
                        </div>
                    </div>

                </form>

            </div>
        </div>
    </div>
</div>
<!-- End: Main -->

</body>

</html>