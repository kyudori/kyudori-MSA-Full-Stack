<template>
  <div>
    <h3>Calculator3-외부 함수에 정의된 computed</h3>
    <div>
      <input type="number" v-model="num1" />
      <span> + </span>
      <input type="number" v-model="num2" />
      <span> = </span>
      <span>{{ result }}</span>
    </div>
  </div>
</template>
<script>
import { reactive, computed, toRefs } from 'vue' //toRefs 추가

function plusCalculator() {
  let state = reactive({
    num1: 0,
    num2: 0,
    result: computed(() => state.num1 + state.num2),
  })
  return state;
}
export default {
  name: 'calculator',
  setup() {
    // 아무리 reactive 객체를 받아와도 구조분해 할당을 하면 반응성을 잃어버림
    // 반응성을 유지하면서 구조분해 할당하려면 toRefs()를 호출한 결과로 할당함
    let { num1, num2, result } = toRefs(plusCalculator()) //외부 function
    return {
      num1,
      num2,
      result,
    }
  },
}
</script>
