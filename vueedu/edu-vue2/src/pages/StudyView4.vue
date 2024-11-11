<template>
  <div class="study">
    <h1>유니코의 Vue 학습 페이지-4</h1>
  </div>
  <hr>
  <ProvideInject></ProvideInject>
  <hr class="redline">
  <PiniaTest1></PiniaTest1>
  <hr class="greenline">
  <PiniaTest2></PiniaTest2>
  <hr class="greenline">
  <PiniaTest3></PiniaTest3>
  <hr class="redline">
  <WatchTest/>
</template>

<script setup>
// @ is an alias to /src
import ProvideInject from '@/components/ProvideInject.vue'
import PiniaTest1 from '@/components/PiniaTest1.vue';
import PiniaTest2 from '@/components/PiniaTest2.vue';
import PiniaTest3 from '@/components/PiniaTest3.vue';
import WatchTest from "@/components/WatchTest.vue";
</script>

<style>
.study {
  color: blue;
}
.redline {
  height: 10px;
  background-color: red;
}
.greenline {
  height: 5px;
  background-color: limegreen;
}
</style>
