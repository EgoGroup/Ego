<template>
  <div>
    <div v-for="categoryWithItem in categoryWithItems" style="height: 1100px;width: 100%;">
      <div style=" height: 50px;text-align:center">
        <h2>
          {{categoryWithItem.category.categoryName}}
        </h2>
        <div style="width: 1200px;height: 414px;margin: auto">
          <div v-for="item in categoryWithItem.items" class="text" style="float: left">
            <div style="text-align: center">
              <a @click="details(item.itemId)">
                <img class="img" :src="item.itemImage"/>
              </a>
            </div>
            <button class="btn btn-default" type="submit">查看详情</button>
            <button class="btn btn-default" type="submit">加入购物车</button>
            <p style="text-align: center"><a class="text-sub-a" href="#">learn more...</a></p>
          </div>
          <div style="text-align: center">
            <h2><a href="#">获取更多</a></h2>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
  import {getIndexInfo} from "../api/api";

  export default {
    name: "FrontMain",
    data() {
      return {
        categoryWithItems: [],
      }
    },
    methods: {
      details(itemId) {
        window.location.href = 'http://localhost:8080/item/details/' + itemId;
      }
    },
    created() {
      getIndexInfo({}).then((res) => {
        this.categoryWithItems = res.data.data.categoryWithItems;
        console.log(this.categoryWithItems[0])
      })
    }
  }
</script>

<style scoped>
  @import "../common/frontpage/css/index.css";
  @import "../common/bootstrap/css/bootstrap.min.css";
</style>
