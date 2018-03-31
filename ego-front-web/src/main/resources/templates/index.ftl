<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <#include "./header.ftl"/>
</head>
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
            <#--<#if user.userName??>Login in</#if>-->
            ${userName!"Login in"}</a>
        </li>

        <li>
            <a href="" class="navbar-header-right" style="border:0px solid #00aeee;color: #00aeee;"> Login up</a>
        </li>
    </ul>
</div>
<div style="height: 5000px;width: 100%;">
    <div>
        <div class="login-form-container" style="text-align: center">
            <p style="padding-left: 10%; padding-top: 30%;padding-bottom: 20%; font-size: 2.75em;line-height: 58px;margin-top: 0;width: 668px;height: 114px">
                Sign up here to start a shopping tour.Please click<a> here</a></p>
        </div>

        <div style="text-align: center;padding-top: 50px">
            <img style="width: 680px;height: 430px;" src="/web/img/form-login.png">
        </div>
    </div>
    <hr/>

   <#list categoryWithItems as categoryWithItem>
    <div style="height: 1100px;width: 100%;">
        <div style=" height: 50px;text-align:center">
            <h2>
                ${categoryWithItem.category.categoryName}
            </h2>

        </div>

        <div style="width: 1200px;height: 414px;margin: auto">
            <#list categoryWithItem.items as item>
                <div class="text" style="float: left">
                    <div style="text-align: center">
                        <a href="/item/details/${item.itemId}">
                            <img class="img" src="${item.itemImage}"/>
                        </a>
                    </div>
                    <h3 style="font-size: 1.5em;font-weight: 400;color: #49505b;text-align: center">${item.itemTitle}</h3>
                    <button class="btn btn-default" style="margin-left: 100px" type="submit">查看详情</button>
                    <button class="btn btn-default" type="submit">加入购物车</button>
                    <p style="text-align: center"><a class="text-sub-a" href="#">learn more...</a></p>
                </div>
            </#list>
            <div style="text-align: center">
                <h2><a href="/item/list/${categoryWithItem.category.categoryId}">获取更多</a></h2>
            </div>
        </div>
    </div>

    <hr>
   </#list>

    <div class="footer">
        <p class="footerl">@ 2018 Ego.<a href="#"> Privacy Policy </a>& <a href="#">Term Of Use</a></p>
    </div>
    <script src="/bootstrap/js/bootstrap.min.js"></script>
    <script src="/bootstrap/js/jquery.min.js"></script>
</body>
</html>