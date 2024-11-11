<template>
  <p>{{ counter3 + counter2 }}</p>
  <button @click="onClick3">클릭하면 숫자가 올라갑니다.</button>
  <button @click="onClick2">클릭하면 숫자가 올라갑니다.</button>
</template>

<script>
import { ref } from 'vue' 

export default {
  // Option API
  data() {
    return {
      counter2: 0,
    }
  },
  methods: {
    onClick2: function (evt) {
      if (evt) {
        evt.preventDefault();
      }
      this.counter2++;
    },
  },
  // Composition API
  setup() {
    let counter3 = ref(0)
    const onClick3 = (evt) => {
      if (evt) {
        evt.preventDefault()
        counter3.value++
      }
    }
    return {
      counter3,
      onClick3,
    }
  },  
}
</script>
