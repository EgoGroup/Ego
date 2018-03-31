<!DOCTYPE html>
<html lang="en" xmlns="http://www.w3.org/1999/html">
<head>
<#include "./header.ftl"/>
    <link rel="stylesheet" href="/web/css/category.css"/>
    <script src="/bootstrap/js/jquery.min.js"></script>
</head>
<title></title>
<body>
<div style="width: 100%;height: 60px">
    <div class="navbar-header-left">
        <a style="padding: 10px 100px 0 70px; font-size: 25px">校园E站</a>
    </div>
    <input class="input-text" type="text" id="search" placeholder="搜索">
    <span class="glyphicon glyphicon glyphicon-search" aria-hidden="true"></span>
    <ul class="navbar-header-right">
        <li class="navbar-header-right">
            <a class="navbar-header-right">Home</a>
        </li>
        <li class="navbar-header-right">
            <a class="navbar-header-right">About</a>
        </li>
        <li class="navbar-header-right">
            <a class="navbar-header-right">Contact</a>
        </li>
        <li class="navbar-header-right"><a class="navbar-header-right">我的E服务</a></li>
        <li class="navbar-header-right"><a class="navbar-header-right">购物车</a></li>
        <li>
            <a href="/web/login.html" class="navbar-header-right" style="border:0px solid #00aeee;color: #00aeee;">
                Login in</a>
        </li>

        <li>
            <a href="" class="navbar-header-right" style="border:0px solid #00aeee;color: #00aeee;"> Login up</a>
        </li>
    </ul>
</div>
<div class="category-container">
    <div>
        <h3>闲趣校园</h3>
        <p style="text-align: center;margin: 0 0 10px">Real-time user testing on </p>
    </div>
    <div class="mainContainer">
        <div class="row">
            <div class="col-md-8 col-sm-8 col-xs-6">
                <div class="form-group">
                    <div class="project-filter">
                        <select id="category" class="form-control">
                            <option>所有的分类</option>
                            <#list categories as category>
                                    <option value="/item/list/${category.categoryId}">${category.categoryName}</option>
                            </#list>
                        </select>
                    </div>
                </div>
            </div>
            <div class="col-md-4 col-sm-4 col-xs-6">
                <div class="form-group pull-right">
                    <input class="form" placeholder="Search here"/>
                    <span></span>
                    <i class="glyphicon glyphicon-search"></i>
                </div>
            </div>
        </div>
    </div>
    <hr/>
</div>
<div style="width: 1200px;height: 414px;margin: auto">
<#list items as item>
    <div class="text" style="float: left">
        <div style="text-align: center">
            <img class="img" src="${item.itemImage}"/>
        </div>
        <h3 style="font-size: 1.5em;font-weight: 400;color: #49505b;text-align: center">${item.itemTitle}</h3>
        <p class="text-sub">${item.itemMemo}</p>
        <p style="text-align: center"><a class="text-sub-a" href="#">learn more...</a></p>
    </div>
</#list>
</div>
<script>
    $("#category").change(function () {
        var opt = $("#category").val();
        // window.open("localhost:8080"+opt)
        window.location.href = opt
    });
</script>
</body>
</html>