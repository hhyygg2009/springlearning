<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta charset="utf-8">
    <title>CMS内容管理系统</title>
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

<body>
<!-- Start: Header -->
<header class="navbar navbar-fixed-top" style="background-image: none; background-color: rgb(240, 240, 240);">
    <div class="pull-left"><a class="navbar-brand" href="#">
        <div class="navbar-logo"><img src="/images/logo.png" alt="logo"></div>
    </a></div>
    <div class="pull-right header-btns">
        <a class="user"><span class="glyphicons glyphicon-user"></span> admin</a>
        <a href="login.html" class="btn btn-default btn-gradient" type="button"><span
                class="glyphicons glyphicon-log-out"></span> 退出</a>
    </div>
</header>
<!-- End: Header -->

<!-- Start: Main -->
<div id="main">
    <!-- Start: Sidebar -->
<%@include file="sidebar.jsp"%>
    <!-- End: Sidebar -->

    <!-- Start: Content -->
    <section id="content">
        <div id="topbar" class="affix">
            <ol class="breadcrumb">
                <li><a href="#"><span class="glyphicon glyphicon-home"></span></a></li>
                <li class="active">资讯管理</li>
            </ol>
        </div>
        <div class="container">

            <div class="row">
                <div class="col-md-12">
                    <div class="panel">
                        <div class="panel-heading">
                            <div class="panel-title">资讯列表</div>
                            <a href="news_add.html" class="btn btn-info btn-gradient pull-right"><span
                                    class="glyphicons glyphicon-plus"></span> 添加资讯</a>
                        </div>
                        <form action="" method="post">
                            <div class="panel-body">
                                <table class="table table-striped table-bordered table-hover dataTable">
                                    <tr class="active">
                                        <th class="text-center">
                                            <a class="btn btn-gray btn-sm" id="selectAll">全选</a>
                                        </th>


                                        <c:forEach items="${datalist[0]}" var="item">
                                            <th>${item.key}</th>
                                        </c:forEach>
                                        <th width="200">操作</th>
                                    </tr>
                                    <c:forEach items="${datalist}" var="data">

                                        <tr class="success">
                                            <td class="text-center">
                                                <input type="checkbox" value="${data.id}" name="idarr[]"
                                                       class="cbox"></td>

                                            <c:forEach items="${data}" var="item">
                                                <td>${item.value}</td>
                                            </c:forEach>

                                            <td>
                                                <div class="btn-group">
                                                    <a href="update?id=${data.id}" class="btn btn-default btn-gradient"><span
                                                            class="glyphicons glyphicon-pencil"></span></a>
                                                    <a onclick="return confirm('确定要删除吗？');" href="delete?id=${data.id}"
                                                       class="btn btn-default btn-gradient dropdown-toggle"><span
                                                            class="glyphicons glyphicon-trash"></span></a>
                                                </div>

                                            </td>
                                        </tr>
                                    </c:forEach>

                                </table>

                                <div class="pull-left">

                                    <button type="submit" class="btn btn-default btn-gradient pull-right delall"><span
                                            class="glyphicons glyphicon-trash"></span></button>


                                </div>

                                <div class="pull-right">
                                    <ul class="pagination" id="paginator-example">
                                        <li><a href="#">&lt;</a></li>
                                        <li><a href="#">&lt;&lt;</a></li>
                                        <li><a href="#">1</a></li>
                                        <li class="active"><a href="#">2</a></li>
                                        <li><a href="#">3</a></li>
                                        <li><a href="#">&gt;</a></li>
                                        <li><a href="#">&gt;&gt;</a></li>
                                    </ul>
                                </div>

                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- End: Content -->
</div>
<!-- End: Main -->
</body>
</html>