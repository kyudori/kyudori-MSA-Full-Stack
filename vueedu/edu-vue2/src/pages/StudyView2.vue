<template>
  <div class="study">
    <h1>유니코의 Vue 학습 페이지-2</h1>
  </div>
  <hr />
  <CompositionAPI></CompositionAPI>
  <hr />
  <CompositionAPI_s></CompositionAPI_s>
  <hr class="redline" />
  <CompositionAPI2></CompositionAPI2>
  <hr />
  <CompositionAPI3></CompositionAPI3>
  <hr />
  <CompositionAPI4></CompositionAPI4>
</template>

<script setup>
// @ is an alias to /src
import CompositionAPI from '@/components/CompositionAPI.vue'
import CompositionAPI_s from '@/components/CompositionAPI_s.vue'
import CompositionAPI2 from '@/components/CompositionAPI2.vue'
import CompositionAPI3 from '@/components/CompositionAPI3.vue'
import CompositionAPI4 from '@/components/CompositionAPI4.vue'
</script>
<style>
.study {
  color: blue;
}

.redline {
  height: 3px;
  background-color: brown;
}
</style>
