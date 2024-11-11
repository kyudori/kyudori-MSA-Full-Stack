<template>
  <div>
    <h3>Calculator4-외부 소스의 함수에 정의된 computed</h3>
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
import { plusCalculator } from '../common.js';

export default {
  name: 'calculator',
  setup() {
    let { num1, num2, result } = plusCalculator();

    return {
      num1, num2, result
    }
  }
}
</script>