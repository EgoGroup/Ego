<template>
  <div>
    <FrontHeader></FrontHeader>
    <FrontTopBar></FrontTopBar>
    <FrontFooter></FrontFooter>
  </div>
</template>

<script>
  import {getCateogryList} from "../api/api";
  import FrontHeader from './FrontHeader';
  import FrontFooter from './FrontFooter';
  import FrontTopBar from "./FrontTopBar";

  export default {
    name: "Test",
    data() {
      return {
        categories: []
      }
    },
    created() {
      getCateogryList({}).then((res) => {
        console.log(res);
      }).catch(function (res) {
        console.log(res)
      });
    },
    components: {
      FrontTopBar,
      FrontHeader,
      FrontFooter,
    }
  }
</script>

<style scoped>

</style>
