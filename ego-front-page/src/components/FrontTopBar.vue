<template>

  <div style="height: 5000px;width: 100%;">
    <div>
      <div class="login-form-container" style="text-align: center">
        <p
          style="padding-left: 10%; padding-top: 30%;padding-bottom: 20%; font-size: 2.75em;line-height: 58px;margin-top: 0;width: 668px;height: 114px">
          Sign up here to start a shopping tour.Please click<a> here</a></p>
      </div>

      <div style="text-align: center;padding-top: 50px">
        <img style="width: 680px;height: 430px;" src="../common/frontpage/img/form-login.png">
      </div>
    </div>
    <hr/>
    <FrontMain></FrontMain>
  </div>
</template>

<script>
  import FrontMain from './FrontMain';

  export default {
    name: "FrontTopBar",
    components: {
      FrontMain
    }
  }
</script>

<style scoped>
  @import "../common/frontpage/css/index.css";
</style>
