<template>
  <header>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../common/frontpage/img/head.ico">
    <title>校园E服务</title>
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
          <a href="http://localhost:8080/web/login.html" class="navbar-header-right"
             style="border:0 solid #00aeee;color: #00aeee;">{{isLogin}}</a>
        </li>
        <li>
          <a href="" class="navbar-header-right" style="border:0 solid #00aeee;color: #00aeee;"> Login up</a>
        </li>
      </ul>
    </div>
  </header>
</template>

<script>
  import {isLogin} from "../api/api";

  export default {
    name: "FrontHeader",
    data() {
      return {
        isLogin: "Login in"
      }
    },
    methods: {
      init() {
        isLogin({}).then(res => {
          if (res.data.data != null) {
            this.isLogin = res.data;
          }
        })
      }
    },
    created() {
      this.init();
    }
  }
</script>

<style scoped>
  @import "../common/frontpage/css/index.css";
  @import "../common/bootstrap/css/bootstrap.min.css";
</style>
