<template>
  <div>
    <h3>Calculator2-computed 사용</h3>
    <div>
      <input type="number" v-model="state.num1" />
      <span> + </span>
      <input type="number" v-model="state.num2" />
      <span> = </span>
      <span>{{ state.result }}</span>
    </div>
  </div>
</template>
<script>
import { reactive, computed } from 'vue';
export default {
  name: 'calculator',
  setup() {
    let state = reactive({
      num1: 0,
      num2: 0,
      // computed를 이용해서 num1, num2가 변경이 일어나면 즉시 result로 더한 값을 반환
      result: computed(() => state.num1 + state.num2)
    });
    return {
      state
    }
  }
}
</script>