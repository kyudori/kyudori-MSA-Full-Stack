<template>
  메인보드의 가격: <input type="text" v-on:input="price = $event.target.value" v-bind:value="price"><br>
  메인보드의 가격: <input type="text" v-model.lazy="price">
</template> 

<script>
import { ref, watch } from 'vue'

export default {
  setup() {
    const price = ref(100000);

    watch(price, (cur, prev) => {
        console.log('price의 변경된 값 :', cur)
        console.log('price의 변경되기 전의 값 :', prev)
      },
      {
        immediate: true,
      }
    )

    return {
      price,
    }
  },
}
</script>
