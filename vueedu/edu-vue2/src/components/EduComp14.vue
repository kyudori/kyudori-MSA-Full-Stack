<template>
  <p>{{ count_o }}</p>
  <button @click="count_o++">Options API 카운트 증가</button>
  <p>{{ count_c1 }}</p>
  <button @click="count_c1++">Composition API 1st 카운트 증가</button>
  <p>{{ count_c2 }}</p>
  <button @click="count_c2++">Composition API 2nd 카운트 증가</button>
  <p>상태: {{ state }}</p>
  <button @click="we_stop()">watchEffect 중지</button>
</template>

<script>
import { ref, watch, watchEffect } from 'vue'

export default {
  //Options API
  data() {
    return {
      count_o: 0,
    }
  },
  watch: {
    count_o: {
      handler : function (cur, prev) {
                  console.log('Options API Watch : ' + prev + ' ==> ' + cur)
      },
      immediate: true,
    }
  },
  // Composition API
  setup() {
    const count_c1 = ref(0)
    const count_c2 = ref(0)
    const state = ref('실행 중')

    watch(
      count_c1,
      (cur, prev) => {
        console.log('Composition API Watch : ' + prev + ' ==> ' + cur)
      },
      {
        immediate: true,
      }
    )

    watch([count_c1, count_c2], (cur, prev) => {
      console.log('Composition API Multiple Watch : ' + prev + ' ==> ' + cur)
    })

    const stopWE = watchEffect(
      () => {
        console.log('Composition API watchEffect Called ' + count_c2.value)
      },
      {
        flush: 'post',
      }
    )

    const we_stop = () => {
      state.value = '중지'
      stopWE()
    }

    return {
      count_c1,
      count_c2,
      state,
      we_stop,
    }
  },
}
</script>
