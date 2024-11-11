<template>
  <h4>Setup API 형식에서는 객체형 데이터가 반응성을 가질려면 ref 또는 reactive() 함수로 포장해야 함</h4>
  <div>
    <div class="name">{{ name }}</div>
    <div class="name">성은 {{ name.lastName }}가이고 이름은 {{ name.firstName }}입니당.</div>
    <button @click="updateName">Click</button>
  </div>
</template>

<script>
import { reactive } from "vue";

export default {
  setup() {
    const name = reactive({
      firstName:"길동", lastName:"고"
    });

    const updateName = () => {
      name.firstName = "둘리";
      name.lastName = "김"
    };
    return {
      name,
      updateName,
    };
  },
};
</script>

<style scoped>
    .name {
      color : magenta;
    }
</style>