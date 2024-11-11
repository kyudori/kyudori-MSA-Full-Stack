<template>
  <div>
  <p>
    <span :title="message">
      마우스를 올려 놓으면 잠시후 "둘리도우너또치"라는 툴팁이 출력됩니다.
    </span>
  </p>
  <p :class="{ red: isRed }" @click="toggleRed">
    빨간색 백그라운드 칼라가 토글~~~
  </p>

  <p :style="{ color }" @click="toggleColor">
    클릭할 때마다 그린과 블루가 토글~~~
  </p>
</div>
</template>

<script>
import { ref } from 'vue'

export default {
  setup() {
    const message = ref('둘리또치도우너')
    const isRed = ref(true)
    const color = ref('green')

    function toggleRed() {
      isRed.value = !isRed.value
    }

    function toggleColor() {
      color.value = color.value === 'green' ? 'blue' : 'green'
    }

    return {
      message,
      isRed,
      color,
      toggleRed,
      toggleColor
    }
  }
}
</script>

<style scoped>
  .red {
    background-color : red;
  }
</style>